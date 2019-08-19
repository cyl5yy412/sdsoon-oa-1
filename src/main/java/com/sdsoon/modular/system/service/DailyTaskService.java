package com.sdsoon.modular.system.service;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.vo.DailyTaskVo;

import java.util.List;

/**
 * Created By Chr on 2019/8/10.
 */
public interface DailyTaskService {

    int addDailyTask(Integer category, String createTimeStamp, String taskDesc) throws ResponseException;

    List<DailyTaskVo> getDailyTask(Integer category);

}
