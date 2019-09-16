package com.sdsoon.modular.system.controller;

import com.alibaba.fastjson.JSON;
import com.sdsoon.core.response.ReturnResult;
import com.sdsoon.core.response.ex.BaseController;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.model.ProjectMissionModel;
import com.sdsoon.modular.system.model.ProjectPoModel;
import com.sdsoon.modular.system.po.SsProjectMission;
import com.sdsoon.modular.system.service.ProjectService;
import com.sdsoon.modular.system.vo.AddMissionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 中台立项
 * <p>
 * Created By Chr on 2019/8/22.
 */
@RestController
@RequestMapping("/project")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class ProjectController extends BaseController {
    @Autowired
    private ProjectService projectService;

    //派发项目列表
//    @PostMapping("/list")
//    public ReturnResult projectList() throws ResponseException, ParseException {
//        projectService.projectList();
//        return null;
//    }

    //立项列项列表
//    @PostMapping("/setlist")
//    public ReturnResult projectSetList() throws ResponseException, ParseException {
//        return null;
//    }

    //添加立项任务节点:mission
    @PostMapping("/setup/mission")
    public ReturnResult addMission(@RequestBody AddMissionVo addMissionVo) throws ResponseException {
        boolean b = projectService.addMission(addMissionVo);
        if (b) {
            return ReturnResult.create(HttpStatus.CREATED);
        }
        return ReturnResult.create(null);
    }

    //查询立项所有内容
    @PostMapping("/get")
    public ReturnResult select(String projectId) throws ResponseException {
        ProjectPoModel projectPoModelVo = projectService.selectProjectById(projectId);
        if (projectPoModelVo == null) {
            return ReturnResult.create(null);
        }
        return ReturnResult.create(projectPoModelVo);
    }

    //项目管理内容
    @GetMapping("/list")
    public ReturnResult list(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, @RequestParam(value = "projectName", required = false) String projectName) throws ResponseException {
        Map<String, Object> objectMap = projectService.selectAllProject(page, limit, projectName);
        return ReturnResult.create(objectMap);
    }

    //项目管理 进行和完成
    @GetMapping("/list/status")
    public Map<String, Object> listByStatus(@RequestParam("status") Integer status, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) throws ResponseException {
        Map<String, Object> ssProjectManageVoPageResult = projectService.selectAllProjectsByStatus(status, page, limit);
        return ssProjectManageVoPageResult;
    }

    //下载任务节点的文件
    @GetMapping("/download")
    public void downLoad(@RequestParam("downloadId") String downloadId, HttpServletResponse response
    ) throws ResponseException, IOException {
        boolean b = projectService.download(downloadId, response);
    }

    //修改任务节点信息
    @PostMapping("/update/mission")
    public ReturnResult updateMission(@RequestBody AddMissionVo addMissionVo) throws ResponseException {
        boolean b = projectService.updateMission(addMissionVo);
        if (b) {
            return ReturnResult.create(HttpStatus.OK);
        }
        return ReturnResult.create(null);
    }

    //根据missionid查询
    @PostMapping("/get/mission")
    public ReturnResult getMission(String projectMissionId) throws ResponseException {
        SsProjectMission ssProjectMission = projectService.getMissionById(projectMissionId);
        if (ssProjectMission != null) {
            return ReturnResult.create(ssProjectMission);
        }
        return ReturnResult.create(null);
    }

    //删除单个任务节点
    @PostMapping("/delete/mission")
    public ReturnResult deleteMission(@RequestParam("projectMissionId") String projectMissionId) throws ResponseException {
        boolean b = projectService.deleteMission(projectMissionId);
        if (b) {
            return ReturnResult.create(HttpStatus.OK);
        }
        return ReturnResult.create(null);
    }

    public static void main(String args[]) throws ParseException {
//        Date d = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
////        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format = sdf.format(d);
//        Date parse = sdf.parse(format);
//        long time = parse.getTime();
//        System.out.println(format);
//        System.out.println(time);
//        String s = "1566403200000";
//        String a = "1567395537000";
//        Long timeL = Long.valueOf(s);
//        Date date = new Date(timeL);
//        System.out.println(date);


///////////////////////
        AddMissionVo vo = new ProjectController().show();
        String s = JSON.toJSONString(vo, true);
        System.out.println(s);
    }

    private String uuid() {
        String s = UUID.randomUUID().toString().replaceAll("-", "");
        return s;
    }

    public AddMissionVo show() {
        String gid = "695b1acedf034b09be4246fba42c56ce";
        List<ProjectMissionModel> list = new ArrayList<>();
        ProjectMissionModel projectMissionModel1 = new ProjectMissionModel();
        projectMissionModel1.setProjectGProjectId(gid);
        projectMissionModel1.setProjectMissionCreateTime("1560403200000");
        projectMissionModel1.setProjectMissionEndTime("1516403200000");
        projectMissionModel1.setProjectMissionDescription("model1");
        projectMissionModel1.setProjectMissionId("1e66454b4f024ac683b1096f0ff3f18d");
        list.add(projectMissionModel1);
        ProjectMissionModel projectMissionMode2 = new ProjectMissionModel();
        projectMissionMode2.setProjectGProjectId(gid);
        projectMissionMode2.setProjectMissionCreateTime("1563403200000");
        projectMissionMode2.setProjectMissionEndTime("1546403200000");
        projectMissionMode2.setProjectMissionDescription("model2");
        list.add(projectMissionMode2);

        ProjectMissionModel projectMissionMode3 = new ProjectMissionModel();
        projectMissionMode3.setProjectGProjectId(gid);
        projectMissionMode3.setProjectMissionCreateTime("1066403200000");
        projectMissionMode3.setProjectMissionEndTime("1266403200000");
        projectMissionMode3.setProjectMissionDescription("model3");
        list.add(projectMissionMode3);
        AddMissionVo addMissionVo = new AddMissionVo();
        addMissionVo.setMissions(list);
        return addMissionVo;
    }
}
