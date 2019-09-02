package com.sdsoon.modular.system.controller;

import com.sdsoon.core.response.ReturnResult;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.model.ProjectPoModel;
import com.sdsoon.modular.system.service.ProjectService;
import com.sdsoon.modular.system.vo.AddMissionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 中台立项
 * <p>
 * Created By Chr on 2019/8/22.
 */
@RestController
@RequestMapping("/project")
public class ProjectController {
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
        ProjectPoModel projectPoModel = projectService.selectProjectById(projectId);
        if (projectPoModel == null) {
            return ReturnResult.create(null);
        }
        return ReturnResult.create(projectPoModel);
    }

    //下载任务节点的文件
    @GetMapping("/download")
    public void downLoad(@RequestParam("downloadId") String downloadId,
                         HttpServletResponse response
    ) throws ResponseException, UnsupportedEncodingException {
        boolean b = projectService.download(downloadId, response);
        //返回信息会把返回的信息加到下载的doc中
//        if (b) {
//            return ReturnResult.create(HttpStatus.OK);
//        }
//        return ReturnResult.create(null);
    }

/*
    @PostMapping("/setup/demo")
    public ReturnResult setupDemo(String projectName,
                                  String projectLeaderName,
                                  String projectLeaderPhone,
                                  String projectDes,
                                  String projectTechnology,
                                  String projectStandard
//                                  MultipartFile docFile,
//                                  MultipartFile picFile,
//                                  String startTimeStamp,
//                                  String endTimeStamp,
//                                  String missionDes

    ) throws ResponseException {
        String projectId = UUID.randomUUID().toString().replaceAll("-", "");
        ProjectModel projectModel = new ProjectModel();
        projectModel.setProjectId(projectId);
        projectModel.setProjectName(projectName);
        projectModel.setProjectLeaderName(projectLeaderName);
        projectModel.setProjectLeaderPhone(projectLeaderPhone);
        projectModel.setProjectDescription(projectDes);
        projectModel.setProjectTechnology(projectTechnology);
        projectModel.setProjectStandard(projectStandard);

        boolean b = projectService.setupProject(projectModel);
        if (b) {
            return ReturnResult.create(HttpStatus.CREATED);
        }
        return ReturnResult.create(null);
    }
    */

//    @PostMapping("/setup/demo2")
//    public ReturnResult setupDemo2(MultipartFile docFile1,
//                                   MultipartFile docFile2,
//                                   MultipartFile docFile3,
//                                   MultipartFile picFile1,
//                                   MultipartFile picFile2,
//                                   MultipartFile picFile3,
//                                   String createTime1,
//                                   String endTime1,
//                                   String missionDes1,
//                                   String createTime2,
//                                   String endTime2,
//                                   String missionDes2,
//                                   String createTime3,
//                                   String endTime3,
//                                   String missionDes3
//    ) throws ResponseException {
//
//        //mission
//        List<ProjectMissionModel> projectMissions = new ArrayList<>();
//        ProjectMissionModel projectMissionModel1 = new ProjectMissionModel();
//        ProjectMissionModel projectMissionModel2 = new ProjectMissionModel();
//        ProjectMissionModel projectMissionModel3 = new ProjectMissionModel();
//        projectMissionModel1.setProjectMissionId(uuid());
//        projectMissionModel2.setProjectMissionId(uuid());
//        projectMissionModel3.setProjectMissionId(uuid());
//        projectMissionModel1.setProjectMissionCreateTime(createTime1);
//        projectMissionModel2.setProjectMissionCreateTime(createTime2);
//        projectMissionModel3.setProjectMissionCreateTime(createTime3);
//        projectMissionModel1.setProjectMissionEndTime(endTime1);
//        projectMissionModel2.setProjectMissionEndTime(endTime2);
//        projectMissionModel3.setProjectMissionEndTime(endTime3);
//        projectMissionModel1.setProjectMissionDescription(missionDes1);
//        projectMissionModel2.setProjectMissionDescription(missionDes2);
//        projectMissionModel3.setProjectMissionDescription(missionDes3);
//        projectMissions.add(projectMissionModel1);
//        projectMissions.add(projectMissionModel2);
//        projectMissions.add(projectMissionModel3);
//        //doc
//        List<MultipartFile> docFiles = new ArrayList<>();
//        docFiles.add(docFile1);
//        docFiles.add(docFile2);
//        docFiles.add(docFile3);
//        //pic
//        List<MultipartFile> picFiles = new ArrayList<>();
//        picFiles.add(picFile1);
//        picFiles.add(picFile2);
//        picFiles.add(picFile3);
//
//
//        ProjectModel projectModel = new ProjectModel();
//        projectModel.setProjectName("项目名");
//        projectModel.setProjectTechnology("工艺");
//        projectModel.setProjectStandard("标准");
//        projectModel.setProjectDescription("项目描述");
//        projectModel.setProjectLeaderName("负责人名字");
//        projectModel.setProjectLeaderPhone("负责人手机");
//
//        projectModel.setProjectMissions(projectMissions);
//        projectModel.setPicFiles(picFiles);
//        projectModel.setDocFiles(docFiles);
//
//        String s = JSON.toJSONString(projectModel, true);
//        System.out.println(s);
//
//        boolean b = projectService.setupProjectDemo(projectModel);
//        if (b) {
//            return ReturnResult.create(HttpStatus.CREATED);
//        }
//        return ReturnResult.create(null);
//    }


    public static void main(String args[]) throws ParseException {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(d);
        Date parse = sdf.parse(format);
        long time = parse.getTime();
        System.out.println(format);
        System.out.println(time);
        String s = "1566403200000";
        Long timeL = Long.valueOf(s);
        Date date = new Date(timeL);
        System.out.println(date);


//        ProjectModel projectModel = new ProjectModel();
//        projectModel.setProjectName();
//        projectModel.setProjectTechnology();
//        projectModel.setProjectStandard();
//        projectModel.setProjectDescription();
//        projectModel.setProjectLeaderName();
//        projectModel.setProjectLeaderPhone();
//
//        projectModel.setDocFiles();
//        projectModel.setPicFiles();
//        projectModel.setProjectMissions();

    }

    private String uuid() {
        String s = UUID.randomUUID().toString().replaceAll("-", "");
        return s;
    }
}
