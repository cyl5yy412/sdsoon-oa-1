package com.sdsoon.modular.system.vo;

import com.sdsoon.modular.system.po.SsRole;

import java.io.Serializable;
import java.util.List;

/**
 * Created By Chr on 2019/8/16.
 */
public class UserVo implements Serializable {

    private static final long serialVersionUID = -7273182755030152479L;
    private String userId;

    private String userName;

    private Integer userGRoleId;

    private String userRealName;

    private String userPhone;

    private Integer state;

    private String userDept;

    private Integer userDeptNo;

    private List<SsRole> roles;


    public UserVo() {
    }

    public UserVo(String userId, String userName, Integer userGRoleId, String userRealName, String userPhone, Integer state, String userDept, Integer userDeptNo, List<SsRole> roles) {
        this.userId = userId;
        this.userName = userName;
        this.userGRoleId = userGRoleId;
        this.userRealName = userRealName;
        this.userPhone = userPhone;
        this.state = state;
        this.userDept = userDept;
        this.userDeptNo = userDeptNo;
        this.roles = roles;
    }

    public Integer getUserDeptNo() {
        return userDeptNo;
    }

    public void setUserDeptNo(Integer userDeptNo) {
        this.userDeptNo = userDeptNo;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUserDept() {
        return userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept;
    }

    public List<SsRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SsRole> roles) {
        this.roles = roles;
    }
}
