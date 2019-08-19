package com.sdsoon.core.shiro.realm;

import com.sdsoon.modular.system.po.SsPermission;
import com.sdsoon.modular.system.po.SsRole;
import com.sdsoon.modular.system.po.SsUserInfo;
import com.sdsoon.modular.system.po.SsUserPassword;
import com.sdsoon.modular.system.service.AdminService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created By Chr on 2019/8/16.
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private AdminService adminService;

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SsUserInfo ssUserInfo = (SsUserInfo) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        //角色
        Set<String> roles = new HashSet<>();
        List<SsRole> ssRoles = adminService.findRolesByUserId(ssUserInfo.getUserId());
        if (ssRoles != null || ssRoles.size() != 0) {
            for (SsRole ssRole : ssRoles) {
                if (ssRole!= null) {
                    roles.add(ssRole.getRoleCode());
                }
            }
        }

        authorizationInfo.setRoles(roles);
        //权限
        Set<String> permissions = new HashSet<>();
        List<SsPermission> ssPermissions = adminService.findPermsByUserId(ssUserInfo.getUserId());
        if (ssPermissions != null || ssPermissions.size() != 0) {
            for (SsPermission ssPermission : ssPermissions) {
                if (ssPermission!=null) {
                    permissions.add(ssPermission.getPermCode());
                }
            }
        }
        authorizationInfo.setStringPermissions(permissions);
        return authorizationInfo;
    }

    /**
     * 认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = token.getPrincipal().toString();
        SsUserInfo ssUserInfo = adminService.selectUserInfoByUserName(username);

        if (ssUserInfo == null) {
            throw new UnknownAccountException(); // 账号不存在
        }
        if (ssUserInfo.getUserStatus() != 0) {
            throw new LockedAccountException();  // 账号被锁定
        }
        SsUserPassword ssUserPassword = adminService.selectPasswordByUserId(ssUserInfo.getUserId());
        if (ssUserPassword == null) {
            throw new UnknownAccountException(); // 账号不存在
        }
        String encryptPassword = ssUserPassword.getEncryptPassword();
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(ssUserInfo, encryptPassword, "userRealm");
        return authenticationInfo;
    }
}
