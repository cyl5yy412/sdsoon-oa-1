package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsUserPassword;
import com.sdsoon.modular.system.po.SsUserPasswordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsUserPasswordMapper {
    long countByExample(SsUserPasswordExample example);

    int deleteByExample(SsUserPasswordExample example);

    int deleteByPrimaryKey(String gUserId);

    int insert(SsUserPassword record);

    int insertSelective(SsUserPassword record);

    List<SsUserPassword> selectByExample(SsUserPasswordExample example);

    SsUserPassword selectByPrimaryKey(String gUserId);

    int updateByExampleSelective(@Param("record") SsUserPassword record, @Param("example") SsUserPasswordExample example);

    int updateByExample(@Param("record") SsUserPassword record, @Param("example") SsUserPasswordExample example);

    int updateByPrimaryKeySelective(SsUserPassword record);

    int updateByPrimaryKey(SsUserPassword record);
}