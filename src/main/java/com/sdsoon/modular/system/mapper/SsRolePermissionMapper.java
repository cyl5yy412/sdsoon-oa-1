package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsRolePermission;
import com.sdsoon.modular.system.po.SsRolePermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsRolePermissionMapper {
    long countByExample(SsRolePermissionExample example);

    int deleteByExample(SsRolePermissionExample example);

    int deleteByPrimaryKey(Integer rolePermGRoleId);

    int insert(SsRolePermission record);

    int insertSelective(SsRolePermission record);

    List<SsRolePermission> selectByExample(SsRolePermissionExample example);

    SsRolePermission selectByPrimaryKey(Integer rolePermGRoleId);

    int updateByExampleSelective(@Param("record") SsRolePermission record, @Param("example") SsRolePermissionExample example);

    int updateByExample(@Param("record") SsRolePermission record, @Param("example") SsRolePermissionExample example);

    int updateByPrimaryKeySelective(SsRolePermission record);

    int updateByPrimaryKey(SsRolePermission record);
}