package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsProjectProd;
import com.sdsoon.modular.system.po.SsProjectProdExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsProjectProdMapper {
    long countByExample(SsProjectProdExample example);

    int deleteByExample(SsProjectProdExample example);

    int deleteByPrimaryKey(String projectProdId);

    int insert(SsProjectProd record);

    int insertSelective(SsProjectProd record);

    List<SsProjectProd> selectByExample(SsProjectProdExample example);

    SsProjectProd selectByPrimaryKey(String projectProdId);

    int updateByExampleSelective(@Param("record") SsProjectProd record, @Param("example") SsProjectProdExample example);

    int updateByExample(@Param("record") SsProjectProd record, @Param("example") SsProjectProdExample example);

    int updateByPrimaryKeySelective(SsProjectProd record);

    int updateByPrimaryKey(SsProjectProd record);

    //
    List<SsProjectProd> selectAllProds(@Param("missionName") String missionName, @Param("prodName") String prodName, @Param("projectProdLeaderName") String projectProdLeaderName);

    SsProjectProd selectByGid(@Param("projectId") String projectId);
}