package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsProjectManage;
import com.sdsoon.modular.system.po.SsProjectManageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsProjectManageMapper {
    long countByExample(SsProjectManageExample example);

    int deleteByExample(SsProjectManageExample example);

    int deleteByPrimaryKey(String projectId);

    int insert(SsProjectManage record);

    int insertSelective(SsProjectManage record);

    List<SsProjectManage> selectByExample(SsProjectManageExample example);

    SsProjectManage selectByPrimaryKey(String projectId);

    int updateByExampleSelective(@Param("record") SsProjectManage record, @Param("example") SsProjectManageExample example);

    int updateByExample(@Param("record") SsProjectManage record, @Param("example") SsProjectManageExample example);

    int updateByPrimaryKeySelective(SsProjectManage record);

    int updateByPrimaryKey(SsProjectManage record);
}