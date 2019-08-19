package com.sdsoon.modular.system.model;

import com.sdsoon.modular.system.po.SsUserInfo;

import java.io.Serializable;

/**
 * Created By Chr on 2019/7/22.
 */
public class SsoUserModel extends SsUserInfo implements Serializable {
    private static final long serialVersionUID = -6619952411731563464L;

    //过期时间:固定值
    private long expireTime;

    //刷新时间:存储时当前时间戳
    private long expireFreshTime;

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }

    public long getExpireFreshTime() {
        return expireFreshTime;
    }

    public void setExpireFreshTime(long expireFreshTime) {
        this.expireFreshTime = expireFreshTime;
    }
}
