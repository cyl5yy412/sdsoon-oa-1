package com.sdsoon.modular.system.service;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.po.SsUserInfo;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created By Chr on 2019/8/13.
 */
public interface UserService {
    SsUserInfo validateLogin(String userName, String password) throws ResponseException, UnsupportedEncodingException, NoSuchAlgorithmException;

}
