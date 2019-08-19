package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsRole;
import com.sdsoon.modular.system.po.SsRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsRoleMapper {
    long countByExample(SsRoleExample example);

    int deleteByExample(SsRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(SsRole record);

    int insertSelective(SsRole record);

    List<SsRole> selectByExample(SsRoleExample example);

    SsRole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") SsRole record, @Param("example") SsRoleExample example);

    int updateByExample(@Param("record") SsRole record, @Param("example") SsRoleExample example);

    int updateByPrimaryKeySelective(SsRole record);

    int updateByPrimaryKey(SsRole record);

    List<SsRole> findRolesByUserId(@Param("userId") String userId);
}