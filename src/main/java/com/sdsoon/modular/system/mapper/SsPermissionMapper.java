package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsPermission;
import com.sdsoon.modular.system.po.SsPermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsPermissionMapper {
    long countByExample(SsPermissionExample example);

    int deleteByExample(SsPermissionExample example);

    int deleteByPrimaryKey(Integer permId);

    int insert(SsPermission record);

    int insertSelective(SsPermission record);

    List<SsPermission> selectByExample(SsPermissionExample example);

    SsPermission selectByPrimaryKey(Integer permId);

    int updateByExampleSelective(@Param("record") SsPermission record, @Param("example") SsPermissionExample example);

    int updateByExample(@Param("record") SsPermission record, @Param("example") SsPermissionExample example);

    int updateByPrimaryKeySelective(SsPermission record);

    int updateByPrimaryKey(SsPermission record);

    List<SsPermission> findPermsByUserId(@Param("userId") String userId);
}