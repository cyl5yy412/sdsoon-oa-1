package com.sdsoon.modular.system.controller.admin;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.JsonResult;
import com.sdsoon.core.util.PageResult;
import com.sdsoon.modular.system.po.SsDailyTask;
import com.sdsoon.modular.system.service.DailyTaskService;
import com.sdsoon.modular.system.vo.DailyTaskVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * 后台日清
 * Created By Chr on 2019/8/21.
 */
@Controller
public class HDailyTaskController {

    @Autowired
    private DailyTaskService dailyTaskService;

    @ResponseBody
    @GetMapping(value = "/get/task")
    public Map<String, Object> getDailyTask(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
        Map<String, Object> map = dailyTaskService.getDailyTask(page, limit);
        return map;
    }

    //添加
    @ResponseBody
    @PostMapping("/dt/add")
    public JsonResult add(SsDailyTask ssDailyTask) {
//        dailyTaskService.addDailyTask();
//        if () {
//            return JsonResult.ok("添加成功，初始密码为" + DEFAULT_PSW);
//        }
        return JsonResult.error("添加失败");
    }


    //修改
    @ResponseBody
    @PostMapping("/dt/update")
    public JsonResult update(DailyTaskVo dailyTaskVo) throws ResponseException, ParseException {
        boolean b = dailyTaskService.update(dailyTaskVo);
        if (b) {
            return JsonResult.ok("修改成功");
        }
        return JsonResult.error("修改失败");
    }

    /**
     * 删除日清
     **/
    @ResponseBody
    @PostMapping("/dt/delete")
    public JsonResult delete(String dailyTaskId) throws ResponseException {
        boolean b = dailyTaskService.removeDaily(dailyTaskId);
        if (b) {
            return JsonResult.ok("删除成功");
        }
        return JsonResult.error("删除失败");
    }
}
