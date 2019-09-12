package com.sdsoon.modular.system.controller;

import com.sdsoon.core.response.ReturnResult;
import com.sdsoon.core.response.ex.BaseController;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.po.SsUserInfo;
import com.sdsoon.modular.system.service.AdminService;
import com.sdsoon.modular.system.service.SsoService;
import com.sdsoon.modular.system.service.UserService;
import com.sdsoon.modular.system.vo.LoginSucUserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/**
 * 中台用户接口
 * Created By Chr on 2019/8/13.
 */
@Slf4j
@RestController
@RequestMapping("/v1/user")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private SsoService ssoService;


    //第一次登陆
    @PostMapping("/login")
    public Callable<ReturnResult> login(@RequestParam("username") String userName,//
                                        @RequestParam("password") String password,
                                        HttpServletResponse response,//
                                        HttpServletRequest request) throws ResponseException, UnsupportedEncodingException, NoSuchAlgorithmException {
        return () -> {
            //登陆验证
            SsUserInfo ssUserInfo = userService.validateLogin(userName, password);
            if (ssUserInfo == null) {
                return ReturnResult.create(null);
            }
            //doSso
            ssoService.doSso(request, response, ssUserInfo);
            //返回用户信息
            LoginSucUserVo loginSucUserVo = adminService.selectUserRolePermByUserId(ssUserInfo.getUserId());
            return ReturnResult.create(loginSucUserVo);
        };
    }

    //老用户登陆--暂时未用
   /* @PostMapping("/check")
    public Callable<ReturnResult> checkLogin(HttpServletRequest request,//
                                             HttpServletResponse response) throws UnsupportedEncodingException, ResponseException {
        SsoUserModel ssoUserModel = ssoService.loginCheck(request, response);
        if (ssoUserModel != null) {
            return () -> ReturnResult.create(ssoUserModel);
        }
        //登陆页登陆
        return () -> ReturnResult.create(null);
    }*/

    //退出
  /*  @PostMapping("/logout")
    public Callable<ReturnResult> logout(String userId,
                                         HttpServletRequest request,//
                                         HttpServletResponse response) throws UnsupportedEncodingException, ResponseException {
        boolean b = ssoService.logout(request, response);
        return () -> ReturnResult.create(b);

    }*/
/*
    @PostMapping("/register")
    public ReturnResult register(@RequestParam("userName") String userName,//
                                 @RequestParam("userPassWord") String userPassWord,//
                                 @RequestParam("userRoleId") Integer userRoleId,//
                                 @RequestParam("userRealName") String userRealName,//
                                 @RequestParam("userPhone") String userPhone,//
                                 @RequestParam("userDept") String userDept) throws ResponseException, UnsupportedEncodingException, NoSuchAlgorithmException {
        userService.register(userName, userPassWord, userRoleId, userRealName, userPhone, userDept);

        return null;
    }
*/

    @Value("${SSO_REDIS_KEY_PREFIX}")
    private String SSO_REDIS_KEY_PREFIX;

    @Value("${SSO_COOKIE_NAME}")
    private String SSO_COOKIE_NAME;

    @RequestMapping("/show")
    public Object show() {
        return SSO_REDIS_KEY_PREFIX + ":" + SSO_COOKIE_NAME;
    }

}
