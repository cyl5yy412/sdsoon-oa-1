package com.sdsoon.modular.system.service;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.PageResult;
import com.sdsoon.modular.system.po.SsPermission;
import com.sdsoon.modular.system.po.SsRole;
import com.sdsoon.modular.system.po.SsUserInfo;
import com.sdsoon.modular.system.po.SsUserPassword;
import com.sdsoon.modular.system.vo.AddUserVo;
import com.sdsoon.modular.system.vo.LoginSucUserVo;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

/**
 * Created By Chr on 2019/8/14.
 */
public interface AdminService {

    LoginSucUserVo selectUserRolePermByUserId(String userId);

    List<SsRole> findRolesByUserId(String userId);

    List<SsPermission> findPermsByUserId(String userId);

    SsUserInfo selectUserInfoByUserName(String username);

    SsUserPassword selectPasswordByUserId(String userId);

    Map<String,Object> selectAllUsers(Integer page, Integer limit,String userName,String userRealName) throws ResponseException;

    boolean register(AddUserVo addUserVo, String roleId) throws ResponseException, UnsupportedEncodingException, NoSuchAlgorithmException;

    boolean updateUserInfo(AddUserVo addUserVo, String roleId) throws ResponseException, UnsupportedEncodingException, NoSuchAlgorithmException;

    boolean updateState(String userId, Integer state);

    boolean removeById(String userId);

    boolean resetPsw(String userId) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    //role
    PageResult<SsRole> selectAllRoles(Integer page, Integer limit) throws ResponseException;

    boolean saveRole(SsRole role);

    boolean updateRoleById(SsRole role);

    boolean removeRoleById(Integer roleId);

    List<SsPermission> listByRoleId(Integer roleId);

    List<SsPermission> list();

    boolean updateRoleAuth(Integer roleId, List<Integer> integers) throws ResponseException;

    //perm
    List<SsPermission> selectPermsByPage() throws ResponseException;

    boolean addOnePerm(SsPermission authorities);

    boolean updatePermsById(SsPermission authorities);

    boolean removePermById(Integer permId);
}
