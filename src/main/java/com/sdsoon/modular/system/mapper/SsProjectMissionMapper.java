package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsProjectMission;
import com.sdsoon.modular.system.po.SsProjectMissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsProjectMissionMapper {
    long countByExample(SsProjectMissionExample example);

    int deleteByExample(SsProjectMissionExample example);

    int deleteByPrimaryKey(String projectMissionId);

    int insert(SsProjectMission record);

    int insertSelective(SsProjectMission record);

    List<SsProjectMission> selectByExample(SsProjectMissionExample example);

    SsProjectMission selectByPrimaryKey(String projectMissionId);

    int updateByExampleSelective(@Param("record") SsProjectMission record, @Param("example") SsProjectMissionExample example);

    int updateByExample(@Param("record") SsProjectMission record, @Param("example") SsProjectMissionExample example);

    int updateByPrimaryKeySelective(SsProjectMission record);

    int updateByPrimaryKey(SsProjectMission record);

    //
    int insertMissions(@Param("missions") List<SsProjectMission> projectMissions);

    int deleteByGId(String projectId);

    int updateMissions(@Param("params") List<SsProjectMission> projectMissions);
}