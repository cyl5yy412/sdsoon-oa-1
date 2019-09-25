package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsProjectProdDoc;
import com.sdsoon.modular.system.po.SsProjectProdDocExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsProjectProdDocMapper {
    long countByExample(SsProjectProdDocExample example);

    int deleteByExample(SsProjectProdDocExample example);

    int deleteByPrimaryKey(String prodDocId);

    int insert(SsProjectProdDoc record);

    int insertSelective(SsProjectProdDoc record);

    List<SsProjectProdDoc> selectByExample(SsProjectProdDocExample example);

    SsProjectProdDoc selectByPrimaryKey(String prodDocId);

    int updateByExampleSelective(@Param("record") SsProjectProdDoc record, @Param("example") SsProjectProdDocExample example);

    int updateByExample(@Param("record") SsProjectProdDoc record, @Param("example") SsProjectProdDocExample example);

    int updateByPrimaryKeySelective(SsProjectProdDoc record);

    int updateByPrimaryKey(SsProjectProdDoc record);
}