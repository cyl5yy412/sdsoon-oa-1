package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsDailyTask;
import com.sdsoon.modular.system.po.SsDailyTaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsDailyTaskMapper {
    long countByExample(SsDailyTaskExample example);

    int deleteByExample(SsDailyTaskExample example);

    int deleteByPrimaryKey(String dailyTaskId);

    int insert(SsDailyTask record);

    int insertSelective(SsDailyTask record);

    List<SsDailyTask> selectByExample(SsDailyTaskExample example);

    SsDailyTask selectByPrimaryKey(String dailyTaskId);

    int updateByExampleSelective(@Param("record") SsDailyTask record, @Param("example") SsDailyTaskExample example);

    int updateByExample(@Param("record") SsDailyTask record, @Param("example") SsDailyTaskExample example);

    int updateByPrimaryKeySelective(SsDailyTask record);

    int updateByPrimaryKey(SsDailyTask record);

    //
    List<SsDailyTask> selectAllDailyTask();

    List<SsDailyTask> selectDailyTaskByCategory(@Param("category") Integer category,@Param("taskDate") String taskDate);
}