package com.sdsoon.modular.system.vo;

import java.io.Serializable;

/**
 * Created By Chr on 2019/8/16.
 */
public class AddUserVo implements Serializable {
    private static final long serialVersionUID = -6404702521565238186L;
    //userinfo
    private String userId;

    private String userName;

    private Integer userGRoleId;

    private String userRealName;

    private String userPhone;

    private Integer userStatus;

    private String userDept;

    //password
    private String gUserId;

    private String encryptPassword;

    public AddUserVo() {
    }

    public AddUserVo(String userId, String userName, Integer userGRoleId, String userRealName, String userPhone, Integer userStatus, String userDept, String gUserId, String encryptPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userGRoleId = userGRoleId;
        this.userRealName = userRealName;
        this.userPhone = userPhone;
        this.userStatus = userStatus;
        this.userDept = userDept;
        this.gUserId = gUserId;
        this.encryptPassword = encryptPassword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserGRoleId() {
        return userGRoleId;
    }

    public void setUserGRoleId(Integer userGRoleId) {
        this.userGRoleId = userGRoleId;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserDept() {
        return userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept;
    }

    public String getgUserId() {
        return gUserId;
    }

    public void setgUserId(String gUserId) {
        this.gUserId = gUserId;
    }

    public String getEncryptPassword() {
        return encryptPassword;
    }

    public void setEncryptPassword(String encryptPassword) {
        this.encryptPassword = encryptPassword;
    }
}
