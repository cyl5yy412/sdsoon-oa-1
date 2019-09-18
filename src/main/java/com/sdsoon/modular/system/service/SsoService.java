package com.sdsoon.modular.system.service;


import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.model.SsoUserModel;
import com.sdsoon.modular.system.po.SsUserInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created By Chr on 2019/7/22.
 */
public interface SsoService {
    /**
     * sso登陆,存cookie,redis
     *
     * @param request
     * @param response
     * @param ssUserInfo
     */
    void doSso(HttpServletRequest request, HttpServletResponse response, SsUserInfo ssUserInfo) throws UnsupportedEncodingException;


    //验证是否老用户
    SsoUserModel loginCheck(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, ResponseException;

    /**
     * 校验拦截器
     *
     * @param request
     * @param response
     * @return
     * @throws UnsupportedEncodingException
     */
    boolean authLoginCheck(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException;

    /**
     * 校验拦截器
     *
     * @param request
     * @param response
     * @param token    userId
     * @return
     * @throws UnsupportedEncodingException
     */
    boolean authLoginCheck(HttpServletRequest request, HttpServletResponse response, String token) throws UnsupportedEncodingException;

    boolean logout(HttpServletRequest request, HttpServletResponse response, String userId) throws ResponseException;


}
