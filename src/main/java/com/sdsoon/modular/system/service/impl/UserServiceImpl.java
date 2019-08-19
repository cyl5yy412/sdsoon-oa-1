package com.sdsoon.modular.system.service.impl;

import com.sdsoon.core.response.ex.EnumError;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.mapper.SsUserInfoMapper;
import com.sdsoon.modular.system.mapper.SsUserPasswordMapper;
import com.sdsoon.modular.system.po.SsUserInfo;
import com.sdsoon.modular.system.po.SsUserInfoExample;
import com.sdsoon.modular.system.po.SsUserPassword;
import com.sdsoon.modular.system.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Encoder;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.UUID;

/**
 * Created By Chr on 2019/8/13.
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private SsUserInfoMapper ssUserInfoMapper;
    @Resource
    private SsUserPasswordMapper ssUserPasswordMapper;

    @Override
    public SsUserInfo validateLogin(String userName, String password) throws ResponseException, UnsupportedEncodingException, NoSuchAlgorithmException {
        if (StringUtils.isAnyBlank(userName, password)) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        //验证用户名
        SsUserInfoExample example = new SsUserInfoExample();
        SsUserInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userName);
        List<SsUserInfo> ssUserInfos = ssUserInfoMapper.selectByExample(example);
        if (ssUserInfos.size() == 1) {
            SsUserInfo ssUserInfo = ssUserInfos.get(0);
            SsUserPassword ssUserPassword = ssUserPasswordMapper.selectByPrimaryKey(ssUserInfo.getUserId());
            //验证密码(加密验证)
//            String encryptPassword = EncodeByMD5(password);
//            if (!StringUtils.equals(encryptPassword, ssUserPassword.getEncryptPassword())) {
//                throw new ResponseException(EnumError.USER_LOGIN_FAIL);
//            }
            //验证密码(非加密)
            if (!StringUtils.equals(password, ssUserPassword.getEncryptPassword())) {
                throw new ResponseException(EnumError.USER_LOGIN_FAIL);
            }
            //验证成功
            log.info("用户: {} 账号密码认证通过", ssUserInfo.getUserName());
            return ssUserInfo;
        } else {
            log.info("userName:{} 不存在", userName);
            throw new ResponseException(EnumError.USER_LOGIN_FAIL);
        }

    }


    //手动设置密码加密算法
    private String EncodeByMD5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder();
        //加密字符串
        String newStr = base64Encoder.encode(md5.digest(str.getBytes("utf-8")));
        return newStr;
    }

    public static String show(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder();
        //加密字符串
        String newStr = base64Encoder.encode(md5.digest(str.getBytes("utf-8")));
        System.out.println(newStr);
        return newStr;
    }
    public static void main(String args[]) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        show("123456");
    }

}
