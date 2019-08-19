package com.sdsoon.modular.system.po;

import java.io.Serializable;

/**
 * Created By Chr on 2019/8/14.
 */
public class SsAdmin implements Serializable{


    private static final long serialVersionUID = 8406411022413750157L;
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
    //perm
    private Integer permId;

    private String permName;

    private String permCode;

    private Integer permStatus;

    private String permDescription;
    //role_perm
    private Integer rolePermGRoleId;

    private Integer rolePermGPermId;



    ///

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

    public Integer getPermId() {
        return permId;
    }

    public void setPermId(Integer permId) {
        this.permId = permId;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }

    public String getPermCode() {
        return permCode;
    }

    public void setPermCode(String permCode) {
        this.permCode = permCode;
    }

    public Integer getPermStatus() {
        return permStatus;
    }

    public void setPermStatus(Integer permStatus) {
        this.permStatus = permStatus;
    }

    public String getPermDescription() {
        return permDescription;
    }

    public void setPermDescription(String permDescription) {
        this.permDescription = permDescription;
    }

    public Integer getRolePermGRoleId() {
        return rolePermGRoleId;
    }

    public void setRolePermGRoleId(Integer rolePermGRoleId) {
        this.rolePermGRoleId = rolePermGRoleId;
    }

    public Integer getRolePermGPermId() {
        return rolePermGPermId;
    }

    public void setRolePermGPermId(Integer rolePermGPermId) {
        this.rolePermGPermId = rolePermGPermId;
    }
}
