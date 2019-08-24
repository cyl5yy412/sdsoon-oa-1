package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsPermission;
import com.sdsoon.modular.system.po.SsRole;
import com.sdsoon.modular.system.po.SsUserInfo;
import com.sdsoon.modular.system.vo.LoginSucUserVo;
import com.sdsoon.modular.system.vo.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created By Chr on 2019/8/14.
 */
public interface AdminMapper {

    LoginSucUserVo selectUserRolePermByUserId(@Param("userId") String userId);

    List<SsUserInfo> selectAllUsers();

    List<UserVo> selectAllUsersAndRoles(@Param("page") Integer page, @Param("limit") Integer limit);

    List<SsRole> selectAllRoles(@Param("page") Integer page, @Param("limit") Integer limit);

    List<SsPermission> selectPermsByRoleId(@Param("roleId") Integer roleId);

    List<SsPermission> selectPerms();

    int insertRoleAuths(@Param("roleId") Integer roleId, @Param("perms") List<Integer> integers);

    int deleteAllgRole(@Param("roleId") Integer roleId);

    List<SsPermission> selectAllPerms();
}
