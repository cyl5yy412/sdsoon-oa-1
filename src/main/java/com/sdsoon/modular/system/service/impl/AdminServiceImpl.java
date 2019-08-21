package com.sdsoon.modular.system.service.impl;

import com.sdsoon.core.response.ex.EnumError;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.PageResult;
import com.sdsoon.core.util.PasswordUtil;
import com.sdsoon.modular.system.mapper.*;
import com.sdsoon.modular.system.po.*;
import com.sdsoon.modular.system.service.AdminService;
import com.sdsoon.modular.system.vo.AddUserVo;
import com.sdsoon.modular.system.vo.LoginSucUserVo;
import com.sdsoon.modular.system.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created By Chr on 2019/8/14.
 */
@Slf4j
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;
    @Resource
    private SsUserInfoMapper ssUserInfoMapper;
    @Resource
    private SsUserPasswordMapper ssUserPasswordMapper;
    @Resource
    private SsRoleMapper ssRoleMapper;
    @Resource
    private SsPermissionMapper ssPermissionMapper;

    @Override
    public LoginSucUserVo selectUserRolePermByUserId(String userId) {
        SsAdmin ssAdmin = adminMapper.selectUserRolePermByUserId(userId);
        LoginSucUserVo loginSucUserVo = convertAdminFromSucVo(ssAdmin);
        return loginSucUserVo;
    }

    @Override
    public List<SsRole> findRolesByUserId(String userId) {
        List<SsRole> ssRoles = ssRoleMapper.findRolesByUserId(userId);
        if (ssRoles == null || ssRoles.size() == 0) {
            return null;
        }
        return ssRoles;
    }

    @Override
    public List<SsPermission> findPermsByUserId(String userId) {
        List<SsPermission> ssPermissions = ssPermissionMapper.findPermsByUserId(userId);
        if (ssPermissions == null || ssPermissions.size() == 0) {
            return null;
        }
        return ssPermissions;
    }

    @Override
    public SsUserInfo selectUserInfoByUserName(String username) {
        SsUserInfoExample example = new SsUserInfoExample();
        SsUserInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(username);
        List<SsUserInfo> ssUserInfos = ssUserInfoMapper.selectByExample(example);
        if (ssUserInfos.size() == 1) {
            SsUserInfo ssUserInfo = ssUserInfos.get(0);
            return ssUserInfo;
        }
        return null;
    }

    @Override
    public SsUserPassword selectPasswordByUserId(String userId) {
        SsUserPassword ssUserPassword = ssUserPasswordMapper.selectByPrimaryKey(userId);
        if (ssUserPassword == null) {
            return null;
        }
        return ssUserPassword;
    }

    @Override
    public PageResult<UserVo> selectAllUsers(Integer page, Integer limit) throws ResponseException {
        if (page == null || limit == null) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        long total = ssUserInfoMapper.countByExample(null);
        List<UserVo> userVos = adminMapper.selectAllUsersAndRoles(page - 1, limit);
        for (UserVo userVo : userVos) {
            switch (userVo.getUserDept()) {
                case "研发部":
                    userVo.setUserDeptNo(1);
                    break;
                case "技术部":
                    userVo.setUserDeptNo(2);
                    break;
            }
        }
        if (userVos == null || userVos.size() == 0) {
            return null;
        }
        return new PageResult<>(userVos, total);
    }

    @Transactional
    @Override
    public boolean register(AddUserVo addUserVo, String roleId) throws ResponseException, UnsupportedEncodingException, NoSuchAlgorithmException {
        if (StringUtils.isAnyBlank(addUserVo.getUserName(),
                addUserVo.getUserRealName(),
                addUserVo.getUserPhone(),
                addUserVo.getUserDept()
                , addUserVo.getEncryptPassword()
        ) || roleId == null) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        SsUserInfoExample example = new SsUserInfoExample();
        SsUserInfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserPhoneEqualTo(addUserVo.getUserPhone());
        List<SsUserInfo> ssUserInfos = ssUserInfoMapper.selectByExample(example);
        if (ssUserInfos.size() != 0) {
            log.info("phone:{} 已存在", addUserVo.getUserPhone());
//            throw new ResponseException(EnumError.PHONE__EXISTS);
            return false;
        } else {//注册
            //用户
            switch (addUserVo.getUserDept()) {
                case "1":
                    addUserVo.setUserDept("研发部");
                    break;
                case "2":
                    addUserVo.setUserDept("技术部");
                    break;
            }
            SsUserInfo ssUserInfo = convertUsersFromAddUserVo(addUserVo, roleId);
            if (ssUserInfo == null) {
                return false;
            }
            int i = ssUserInfoMapper.insertSelective(ssUserInfo);
            if (i == 1) {
                SsUserPassword ssUserPassword = formatSsUserPassword(ssUserInfo.getUserId(), addUserVo.getEncryptPassword());
                int i1 = ssUserPasswordMapper.insertSelective(ssUserPassword);
                if (i1 == 1) {
                    return true;
                }
                return true;
            }
            return false;
        }
    }

    @Transactional
    @Override
    public boolean updateUserInfo(AddUserVo addUserVo, String roleId) throws ResponseException, UnsupportedEncodingException, NoSuchAlgorithmException {
        if (StringUtils.isAllBlank(addUserVo.getUserName(),
                addUserVo.getUserRealName(),
                addUserVo.getUserPhone(),
                addUserVo.getUserDept(),
                addUserVo.getEncryptPassword(),
                addUserVo.getEncryptPassword()) && roleId == null) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }

        reSetDept(addUserVo.getUserDept(), addUserVo);
        SsUserInfo ssUserInfo = addUserVoFormatSSUserInfo(addUserVo, roleId);
        SsUserPassword ssUserPassword = addUserVoFormatSsUserPassword(addUserVo, addUserVo.getUserId());
        if (ssUserInfo == null || ssUserPassword == null) {
            return false;
        }
        int i = ssUserInfoMapper.updateByPrimaryKey(ssUserInfo);
        if (i == 1) {
            int i1 = ssUserPasswordMapper.updateByPrimaryKeySelective(ssUserPassword);
            if (i1 == 1) {
                return true;
            }
        }
        return false;
    }


    @Transactional
    @Override
    public boolean updateState(String userId, Integer state) {
        SsUserInfo ssUserInfo = new SsUserInfo();
        ssUserInfo.setUserStatus(state);
        ssUserInfo.setUserId(userId);
        int i = ssUserInfoMapper.updateByPrimaryKeySelective(ssUserInfo);
        if (i == 1) {
            return true;
        }
        return false;

    }

    @Transactional
    @Override
    public boolean removeById(String userId) {
        int i = ssUserInfoMapper.deleteByPrimaryKey(userId);
        if (i == 1) {
            int i1 = ssUserPasswordMapper.deleteByPrimaryKey(userId);
            if (i1 == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Transactional
    @Override
    public boolean resetPsw(String userId) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String defaultPwd = PasswordUtil.EncodeByMD5("123456");
        SsUserPassword ssUserPassword = new SsUserPassword();
        ssUserPassword.setEncryptPassword(defaultPwd);
        ssUserPassword.setgUserId(userId);
        int i = ssUserPasswordMapper.updateByPrimaryKeySelective(ssUserPassword);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public PageResult<SsRole> selectAllRoles(Integer page, Integer limit) throws ResponseException {
        if (page == null || limit == null) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        long total = ssRoleMapper.countByExample(null);
        List<SsRole> roles = adminMapper.selectAllRoles(page - 1, limit);
        if (roles == null || roles.size() == 0) {
            return null;
        }
        return new PageResult<>(roles, total);
    }

    @Transactional
    @Override
    public boolean saveRole(SsRole role) {
        if (role == null) {
            return false;
        }
        role.setRoleStatus(0);
        int i = ssRoleMapper.insertSelective(role);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Transactional
    @Override
    public boolean updateRoleById(SsRole role) {
        if (role == null) {
            return false;
        }
        int i = ssRoleMapper.updateByPrimaryKeySelective(role);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Transactional
    @Override
    public boolean removeRoleById(Integer roleId) {
        if (roleId == null) {
            return false;
        }
        int i = ssRoleMapper.deleteByPrimaryKey(roleId);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public List<SsPermission> listByRoleId(Integer roleId) {
        if (roleId == null) {
            return new ArrayList<>();
        }
        return adminMapper.selectPermsByRoleId(roleId);
    }

    @Override
    public List<SsPermission> list() {
//        return adminMapper.selectPerms();
        List<SsPermission> ssPermissions = ssPermissionMapper.selectByExample(null);
        return ssPermissions;
    }

    @Transactional
    @Override
    public boolean updateRoleAuth(Integer roleId, List<Integer> integers) throws ResponseException {
        if (roleId == null) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        if (integers.size() == 0 || integers == null) {
            int i1 = adminMapper.deleteAllgRole(roleId);
            if (i1 >= 0) {
                return true;
            }
        }
        //删除全部该roleId权限,重新赋值
        int i1 = adminMapper.deleteAllgRole(roleId);
        if (i1 >= 0) {
            //增加新权限
            int i = adminMapper.insertRoleAuths(roleId, integers);
            if (i < integers.size()) {
                throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR, "操作失败");
            }
            return true;
        }
        return false;

    }

    @Override
    public List<SsPermission> selectPermsByPage() throws ResponseException {
//        if (page == null || limit == null) {
//            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
//        }
//        long total = ssPermissionMapper.countByExample(null);
        List<SsPermission> permissions = adminMapper.selectAllPerms();
        if (permissions == null || permissions.size() == 0) {
            return null;
        }
        return permissions;
    }

    @Transactional
    @Override
    public boolean addOnePerm(SsPermission authorities) {
        if (authorities == null) {
            return false;
        }
        authorities.setPermDescription(authorities.getPermName());
        authorities.setPermStatus(0);
        int i = ssPermissionMapper.insertSelective(authorities);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Transactional
    @Override
    public boolean updatePermsById(SsPermission authorities) {
        if (authorities == null) {
            return false;
        }
        authorities.setPermDescription(authorities.getPermName());
        int i = ssPermissionMapper.updateByPrimaryKeySelective(authorities);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Transactional
    @Override
    public boolean removePermById(Integer permId) {
        if (permId == null) {
            return false;
        }
        int i = ssPermissionMapper.deleteByPrimaryKey(permId);
        if (i == 1) {
            return true;
        }
        return false;
    }


    private LoginSucUserVo convertAdminFromSucVo(SsAdmin ssAdmin) {
        if (ssAdmin == null) {
            return null;
        }
        LoginSucUserVo loginSucUserVo = new LoginSucUserVo();
        BeanUtils.copyProperties(ssAdmin, loginSucUserVo);
        return loginSucUserVo;
    }

    private SsUserInfo convertUsersFromAddUserVo(AddUserVo addUserVo, String roleId) {
        if (addUserVo == null) {
            return null;
        }
        SsUserInfo ssUserInfo = new SsUserInfo();
        BeanUtils.copyProperties(addUserVo, ssUserInfo);
        String userId = UUID.randomUUID().toString().replaceAll("-", "");
        ssUserInfo.setUserId(userId);
        ssUserInfo.setUserGRoleId(Integer.valueOf(roleId));
        ssUserInfo.setUserStatus(0);
        return ssUserInfo;
    }

    private SsUserInfo addUserVoFormatSSUserInfo(AddUserVo addUserVo, String roleId) {
        if (addUserVo == null) {
            return null;
        }
        SsUserInfo ssUserInfo = new SsUserInfo();
        BeanUtils.copyProperties(addUserVo, ssUserInfo);
        ssUserInfo.setUserGRoleId(Integer.valueOf(roleId));
        ssUserInfo.setUserStatus(0);
        return ssUserInfo;
    }

    private SsUserPassword addUserVoFormatSsUserPassword(AddUserVo addUserVo, String userId) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if (addUserVo == null) {
            return null;
        }
        SsUserPassword ssUserPassword = new SsUserPassword();
        String encodeByMD5Password = PasswordUtil.EncodeByMD5(addUserVo.getEncryptPassword());
        ssUserPassword.setEncryptPassword(encodeByMD5Password);
        ssUserPassword.setgUserId(userId);
        return ssUserPassword;
    }

    private SsUserPassword formatSsUserPassword(String userId, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        if (StringUtils.isAnyBlank(userId, password)) {
            return null;
        }
        SsUserPassword ssUserPassword = new SsUserPassword();
        ssUserPassword.setgUserId(userId);
        String encryptPassword = PasswordUtil.EncodeByMD5(password);
        ssUserPassword.setEncryptPassword(encryptPassword);
        return ssUserPassword;
    }

    private void reSetDept(String userDept, AddUserVo addUserVo) {
        switch (userDept) {
            case "1":
                addUserVo.setUserDept("研发部");
                break;
            case "2":
                addUserVo.setUserDept("技术部");
                break;
        }
    }
}
