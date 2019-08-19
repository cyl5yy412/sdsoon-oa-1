package com.sdsoon.modular.system.controller;

import com.sdsoon.core.response.ReturnResult;
import com.sdsoon.core.response.ex.BaseController;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.service.DailyTaskService;
import com.sdsoon.modular.system.vo.DailyTaskVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created By Chr on 2019/8/10.
 */
@RestController
@RequestMapping("/daily")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class DailyTaskController extends BaseController {

    @Autowired
    private DailyTaskService dailyTaskService;

    @PostMapping(value = {"/task"})
    public Callable<ReturnResult> addDailyTask(@RequestParam(name = "category") Integer category,//
                                               @RequestParam(name = "createTimeStamp") String createTimeStamp,//
                                               @RequestParam(name = "taskDesc") String taskDesc) throws ResponseException {

        dailyTaskService.addDailyTask(category, createTimeStamp, taskDesc);
        return () -> ReturnResult.create(HttpStatus.CREATED);
    }

    @PostMapping(value = "/get/task")
    public Callable<ReturnResult> getDailyTask(@RequestParam("category") Integer category) {
        List<DailyTaskVo> dailyTaskVos = dailyTaskService.getDailyTask(category);
        if (dailyTaskVos == null) {
            return () -> ReturnResult.create(null);
        }
        return () -> ReturnResult.create(dailyTaskVos);
    }


    //#####测试 eolinker-rest#########################
    @PostMapping(value = {"/aaa/{category}/{createTimeStamp}"})
    public Object aaa(@PathVariable(name = "category") Integer category,//
                      @PathVariable(name = "createTimeStamp") String createTimeStamp) throws ResponseException {

        return category + ":" + createTimeStamp;
    }

    @PutMapping(value = {"/bb/{demo1}/{demo2}"})
    public Object bb(@PathVariable(name = "demo1") Integer demo1,//
                     @PathVariable(name = "demo2") String demo2
    ) throws ResponseException {

        return demo1 + ":" + demo2;
    }

    public static void main(String args[]) {
        long time = new Date().getTime();
        System.out.println(time);
    }
}
