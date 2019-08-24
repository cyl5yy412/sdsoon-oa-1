package com.sdsoon.modular.system.vo;

import java.io.Serializable;

/**
 * Created By Chr on 2019/8/14.
 */
public class LoginSucUserVo implements Serializable {
    private static final long serialVersionUID = -261288210339196570L;

    //userinfo
    private String userId;

    private String userName;

    private Integer userGRoleId;

    private String userRealName;

    private String userPhone;

    private Integer userStatus;

    private String userDept;

    //role
    private Integer roleId;

    private String roleName;

    private String roleCode;

    private Integer roleStatus;

    private String roleDescription;


    //

    public LoginSucUserVo() {
    }

    public LoginSucUserVo(String userId, String userName, Integer userGRoleId, String userRealName, String userPhone, Integer userStatus, String userDept, Integer roleId, String roleName, String roleCode, Integer roleStatus, String roleDescription) {
        this.userId = userId;
        this.userName = userName;
        this.userGRoleId = userGRoleId;
        this.userRealName = userRealName;
        this.userPhone = userPhone;
        this.userStatus = userStatus;
        this.userDept = userDept;
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleCode = roleCode;
        this.roleStatus = roleStatus;
        this.roleDescription = roleDescription;
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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public Integer getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
}
