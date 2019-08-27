package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsPro;
import com.sdsoon.modular.system.po.SsProExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsProMapper {
    long countByExample(SsProExample example);

    int deleteByExample(SsProExample example);

    int deleteByPrimaryKey(String proId);

    int insert(SsPro record);

    int insertSelective(SsPro record);

    List<SsPro> selectByExample(SsProExample example);

    SsPro selectByPrimaryKey(String proId);

    int updateByExampleSelective(@Param("record") SsPro record, @Param("example") SsProExample example);

    int updateByExample(@Param("record") SsPro record, @Param("example") SsProExample example);

    int updateByPrimaryKeySelective(SsPro record);

    int updateByPrimaryKey(SsPro record);
}