package com.sdsoon.modular.system.po;

import java.io.Serializable;

public class SsUserInfo implements Serializable {
    private String userId;

    private String userName;

    private Integer userGRoleId;

    private String userRealName;

    private String userPhone;

    private Integer userStatus;

    private String userDept;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
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
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
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
        this.userDept = userDept == null ? null : userDept.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userGRoleId=").append(userGRoleId);
        sb.append(", userRealName=").append(userRealName);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", userDept=").append(userDept);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}