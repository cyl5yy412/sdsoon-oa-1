package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsProDoc;
import com.sdsoon.modular.system.po.SsProDocExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsProDocMapper {
    long countByExample(SsProDocExample example);

    int deleteByExample(SsProDocExample example);

    int deleteByPrimaryKey(String proDocId);

    int insert(SsProDoc record);

    int insertSelective(SsProDoc record);

    List<SsProDoc> selectByExample(SsProDocExample example);

    SsProDoc selectByPrimaryKey(String proDocId);

    int updateByExampleSelective(@Param("record") SsProDoc record, @Param("example") SsProDocExample example);

    int updateByExample(@Param("record") SsProDoc record, @Param("example") SsProDocExample example);

    int updateByPrimaryKeySelective(SsProDoc record);

    int updateByPrimaryKey(SsProDoc record);
}