package com.sdsoon.modular.system.service.impl;

import com.sdsoon.core.response.ex.EnumError;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.DateUtil;
import com.sdsoon.modular.system.mapper.SsDailyTaskMapper;
import com.sdsoon.modular.system.po.SsDailyTask;
import com.sdsoon.modular.system.service.DailyTaskService;
import com.sdsoon.modular.system.vo.DailyTaskVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Created By Chr on 2019/8/10.
 */
@Service
public class DailyTaskServiceImpl implements DailyTaskService {

    @Resource
    private SsDailyTaskMapper ssDailyTaskMapper;

    @Transactional
    @Override
    public int addDailyTask(Integer category, String createTimeStamp, String taskDesc) throws ResponseException {

        if (category == null || StringUtils.isAnyBlank(taskDesc, createTimeStamp)) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        SsDailyTask ssDailyTask = new SsDailyTask();
        String dailyTaskId = UUID.randomUUID().toString().replaceAll("-", "");
        ssDailyTask.setDailyTaskId(dailyTaskId);
        ssDailyTask.setDailyCategory(category);
        Long createTimeStampL = Long.valueOf(createTimeStamp);
        Date date = new Date(createTimeStampL);
        ssDailyTask.setDailyCreateTime(date);
        ssDailyTask.setDailyDescriptioin(taskDesc);
        int i = ssDailyTaskMapper.insertSelective(ssDailyTask);
        if (i != 1) {
            throw new ResponseException(EnumError.UNKNOW_ERROR);
        }
        return i;
    }

    @Override
    public List<DailyTaskVo> getDailyTask(Integer category) {
//        List<SsDailyTask> ssDailyTasks = ssDailyTaskMapper.selectAllDailyTask();
        List<SsDailyTask> ssDailyTasks = ssDailyTaskMapper.selectDailyTaskByCategory(category);
        if (ssDailyTasks == null) {
            return null;
        }
        List<DailyTaskVo> dailyTaskVos = ssDailyTasks.stream().map(dailyTask -> {
            DailyTaskVo dailyTaskVo = convertDailyVoFromDto(dailyTask);
            return dailyTaskVo;
        }).collect(Collectors.toList());
        return dailyTaskVos;
    }

    @Override
    public List<DailyTaskVo> getDailyTask() {
        List<SsDailyTask> ssDailyTasks = ssDailyTaskMapper.selectAllDailyTask();
        if (ssDailyTasks == null) {
            return null;
        }
        List<DailyTaskVo> dailyTaskVos = ssDailyTasks.stream().map(dailyTask -> {
            DailyTaskVo dailyTaskVo = convertDailyVoFromDto(dailyTask);
            return dailyTaskVo;
        }).collect(Collectors.toList());
        return dailyTaskVos;
    }

    @Override
    public long getDailyCount() {
        long l = ssDailyTaskMapper.countByExample(null);
        return l;
    }

    @Transactional
    @Override
    public boolean removeDaily(String dailyTaskId) throws ResponseException {
        if (StringUtils.isBlank(dailyTaskId)) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        int i = ssDailyTaskMapper.deleteByPrimaryKey(dailyTaskId);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean update(DailyTaskVo dailyTaskVo) throws ParseException {
        if (dailyTaskVo == null || dailyTaskVo.getDailyTaskId() == null) {
            return false;
        }
        SsDailyTask ssDailyTask = new SsDailyTask();
        BeanUtils.copyProperties(dailyTaskVo, ssDailyTask);
        ssDailyTask.setDailyCategory(Integer.valueOf(dailyTaskVo.getDailyCategory()));
        Date date = DateUtil.convertStrDate2Date(dailyTaskVo.getDailyCreateTime());
        ssDailyTask.setDailyCreateTime(date);
        ssDailyTaskMapper.updateByPrimaryKeySelective(ssDailyTask);
        return true;
    }


    //
    private DailyTaskVo convertDailyVoFromDto(SsDailyTask ssDailyTask) {
        if (ssDailyTask == null) {
            return null;
        }
        DailyTaskVo dailyTaskVo = new DailyTaskVo();
        BeanUtils.copyProperties(ssDailyTask, dailyTaskVo);
        String dateFormat = DateUtil.dateFromat(ssDailyTask.getDailyCreateTime());
        dailyTaskVo.setDailyCreateTime(dateFormat);
        switch (ssDailyTask.getDailyCategory()) {
            case 1:
                dailyTaskVo.setDailyCategory("总结");
                break;
            case 2:
                dailyTaskVo.setDailyCategory("计划");
                break;
        }
        return dailyTaskVo;
    }


}
