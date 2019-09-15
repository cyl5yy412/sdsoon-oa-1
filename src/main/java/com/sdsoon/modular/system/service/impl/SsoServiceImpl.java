package com.sdsoon.modular.system.service.impl;

import com.sdsoon.config.SsoConf;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.CookieUtil;
import com.sdsoon.modular.system.model.SsoUserModel;
import com.sdsoon.modular.system.po.SsUserInfo;
import com.sdsoon.modular.system.service.SsoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

/**
 * Created By Chr on 2019/8/14.
 */
@Slf4j
@Service
public class SsoServiceImpl implements SsoService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Value("${SSO_REDIS_KEY_PREFIX}")
    private String SSO_REDIS_KEY_PREFIX;

    @Value("${SSO_COOKIE_NAME}")
    private String SSO_COOKIE_NAME;

    @Override
    public void doSso(HttpServletRequest request, HttpServletResponse response, SsUserInfo ssUserInfo) throws UnsupportedEncodingException {
        /**
         * 存redis:
         * key:sso_redis#userId
         * value:ssoUserModel
         * timeOut:5天
         */
        SsoUserModel ssoUserModel = convertUserInfoFromSsoUserModel(ssUserInfo);
        String redisKey = redisKey(ssoUserModel.getUserId());
        redisTemplate.opsForValue().set(
                redisKey, ssoUserModel, SsoConf.REDIS_EXPIRE_SECOND, TimeUnit.SECONDS
        );
        /**
         * 存cookie:
         * name:sso_cookie
         * value:前缀#userId-base64编码:sso_cookie#b92c07d222824fe48d9a8d8434e372f0
         * 过期时间:5 day
         */
//        String encodeCookieSuffix = cookieValueSuffix(ssoUserModel.getUserId());
//        String cookieValue = cookieValue(encodeCookieSuffix);
//        CookieUtil.setCookie(request, response,
//                SSO_COOKIE_NAME,//cookieName:sso_cookie
//                cookieValue,//cookieValue,userId编码
//                SsoConf.COOKIE_EXPIRE_SECOND);
//        log.info(cookieValue);

        log.info(SSO_COOKIE_NAME);
    }

    @Override
    public SsoUserModel loginCheck(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, ResponseException {
        //编码后的cookieValue:sso_cookie#b92c07d222824fe48d9a8d8434e372f0
        String cookieEncodeValue = CookieUtil.getCookieValue(request, SSO_COOKIE_NAME, true);
        if (StringUtils.isBlank(cookieEncodeValue)) {//no cookie无法验证信息
            return null;
        } else {
            //编码的userId:b92c07d222824fe48d9a8d8434e372f0
            String encodeUserId = splitCookieVal2encdeId(cookieEncodeValue);
            //cookie的userId:encodeUserId解码userId
            String userId = decode2UserId(encodeUserId);
            //redisKey
            String redisKey = redisKey(userId);
            SsoUserModel ssoUserModel = (SsoUserModel) redisTemplate.opsForValue().get(redisKey);
            if (ssoUserModel == null) {
                //no redis ssoModel
                return null;
            } else {
                //验证:cookie和redis的userId是否一致,不一致则为非法入侵
                if (!StringUtils.equals(userId, ssoUserModel.getUserId())) {
//                    throw new ResponseException(EnumError.ILLEGAL_LOGIN);
                    return null;
                }
                //过期时间过半更新redis,//更新cookie
                if ((System.currentTimeMillis() - ssoUserModel.getExpireFreshTime()) / 2 > ssoUserModel.getExpireTime()) {
                    redisTemplate.opsForValue().set(redisKey, ssoUserModel, SsoConf.REDIS_EXPIRE_SECOND, TimeUnit.SECONDS);
                    CookieUtil.setCookie(request, response, SSO_COOKIE_NAME, cookieEncodeValue, SsoConf.COOKIE_EXPIRE_SECOND);
                }
            }
            return ssoUserModel;
        }

    }

    @Override
    public boolean authLoginCheck(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        String cookieEncodeValue = CookieUtil.getCookieValue(request, SSO_COOKIE_NAME, true);
        if (StringUtils.isBlank(cookieEncodeValue)) {//no cookie无法验证信息
            return false;
        } else {
            //编码的userId:b92c07d222824fe48d9a8d8434e372f0
            String encodeUserId = splitCookieVal2encdeId(cookieEncodeValue);
            //cookie的userId:encodeUserId解码userId
            String userId = decode2UserId(encodeUserId);
            //redisKey
            String redisKey = redisKey(userId);
            SsoUserModel ssoUserModel = (SsoUserModel) redisTemplate.opsForValue().get(redisKey);
            //验证:cookie和redis的userId是否一致,不一致则为非法入侵
            if (ssoUserModel == null) {
                return false;
            }
            if (StringUtils.equals(userId, ssoUserModel.getUserId())) {
                return true;
            }
            return false;
        }
    }

    @Override
    public boolean authLoginCheck(HttpServletRequest request, HttpServletResponse response, String token) throws UnsupportedEncodingException {
        String redisKey = redisKey(token);
        SsoUserModel ssoUserModel = (SsoUserModel) redisTemplate.opsForValue().get(redisKey);
        if (ssoUserModel == null) {
            return false;
        }
        if (StringUtils.equals(token, ssoUserModel.getUserId())) {
            return true;
        }
        return false;
    }


    @Override
    public boolean logout(HttpServletRequest request, HttpServletResponse response) throws ResponseException {
        //清除cookie
        CookieUtil.deleteCookie(request, response, SSO_COOKIE_NAME);
        //清除redis
//        String redisKey = redisKey(userId);
//        redisTemplate.delete(redisKey);
        return true;

    }

    @Override
    public boolean idlogout(String userId) {
        String redisKey = redisKey(userId);
        Boolean delete = redisTemplate.delete(redisKey);
        if (delete) {
            return true;
        }
        return false;

    }


    private SsoUserModel convertUserInfoFromSsoUserModel(SsUserInfo ssUserInfo) {

        SsoUserModel ssoUserModel = new SsoUserModel();
        BeanUtils.copyProperties(ssUserInfo, ssoUserModel);
        ssoUserModel.setExpireTime(SsoConf.REDIS_EXPIRE_SECOND * 1000);
        ssoUserModel.setExpireFreshTime(System.currentTimeMillis());
        return ssoUserModel;
    }

    //

    /**
     * 生成redisKey
     *
     * @param userId userId
     * @return redisKey
     */
    private String redisKey(String userId) {
        return SSO_REDIS_KEY_PREFIX.concat("#").concat(userId);
    }

    /**
     * 生成cookieValue
     *
     * @param userId userId
     * @return cookieValue
     */
    private String cookieValue(String userId) {
        return SSO_COOKIE_NAME.concat("#").concat(userId);
    }

    /**
     * cookie value后缀
     *
     * @param userId uuid
     * @return
     * @throws UnsupportedEncodingException
     */
    private String cookieValueSuffix(String userId) throws UnsupportedEncodingException {
        return encodeUserId(userId);
    }

    /**
     * base64 编码
     *
     * @param userId userId-uuid
     * @return
     * @throws UnsupportedEncodingException
     */
    private String encodeUserId(String userId) throws UnsupportedEncodingException {
        String encode =
                Base64.getEncoder().encodeToString(userId.getBytes("UTF-8"));
        return encode;
    }

    /**
     * base64 解码
     *
     * @param encodeUserIdStr 编码之后的userId
     * @return
     * @throws UnsupportedEncodingException
     */
    private String decode2UserId(String encodeUserIdStr) throws UnsupportedEncodingException {
        byte[] decode =
                Base64.getDecoder().decode(encodeUserIdStr);
        String str = new String(decode, "UTF-8");
        return str;
    }

    /**
     * cookie->encodeUserId
     *
     * @param cookieVal
     * @return 编码后的userId
     */
    private String splitCookieVal2encdeId(String cookieVal) {
        return cookieVal.split("#")[1];
    }

}
