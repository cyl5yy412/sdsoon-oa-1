package com.sdsoon.modular.system.controller;

import com.alibaba.fastjson.JSON;
import com.sdsoon.core.response.ReturnResult;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.model.ProjectMissionModel;
import com.sdsoon.modular.system.model.ProjectModel;
import com.sdsoon.modular.system.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 立项
 * <p>
 * Created By Chr on 2019/8/22.
 */
@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @PostMapping("/setup")
    public ReturnResult setup(@RequestBody ProjectModel projectModel) throws ResponseException {
        boolean b = projectService.setupProject(projectModel);
        if (b) {
            return ReturnResult.create(HttpStatus.CREATED);
        }
        return ReturnResult.create(null);
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

    @PostMapping("/setup/demo2")
    public ReturnResult setupDemo2(MultipartFile docFile1,
                                   MultipartFile docFile2,
                                   MultipartFile docFile3,
                                   MultipartFile picFile1,
                                   MultipartFile picFile2,
                                   MultipartFile picFile3,
                                   String createTime1,
                                   String endTime1,
                                   String missionDes1,
                                   String createTime2,
                                   String endTime2,
                                   String missionDes2,
                                   String createTime3,
                                   String endTime3,
                                   String missionDes3
    ) throws ResponseException {

        String projectId = "3068ff7d4d954d698da6a50dc7d241e7";
        //mission
        List<ProjectMissionModel> projectMissions = new ArrayList<>();
        ProjectMissionModel projectMissionModel1 = new ProjectMissionModel();
        ProjectMissionModel projectMissionModel2 = new ProjectMissionModel();
        ProjectMissionModel projectMissionModel3 = new ProjectMissionModel();
        projectMissionModel1.setProjectMissionId(uuid());
        projectMissionModel2.setProjectMissionId(uuid());
        projectMissionModel3.setProjectMissionId(uuid());
        projectMissionModel1.setProjectMissionCreateTime(createTime1);
        projectMissionModel2.setProjectMissionCreateTime(createTime2);
        projectMissionModel3.setProjectMissionCreateTime(createTime3);
        projectMissionModel1.setProjectMissionEndTime(endTime1);
        projectMissionModel2.setProjectMissionEndTime(endTime2);
        projectMissionModel3.setProjectMissionEndTime(endTime3);
        projectMissionModel1.setProjectMissionDescription(missionDes1);
        projectMissionModel2.setProjectMissionDescription(missionDes2);
        projectMissionModel3.setProjectMissionDescription(missionDes3);
        projectMissions.add(projectMissionModel1);
        projectMissions.add(projectMissionModel2);
        projectMissions.add(projectMissionModel3);
        //doc
        List<MultipartFile> docFiles = new ArrayList<>();
        docFiles.add(docFile1);
        docFiles.add(docFile2);
        docFiles.add(docFile3);
        //pic
        List<MultipartFile> picFiles = new ArrayList<>();
        picFiles.add(picFile1);
        picFiles.add(picFile2);
        picFiles.add(picFile3);


        ProjectModel projectModel = new ProjectModel();
        projectModel.setProjectName("项目名");
        projectModel.setProjectTechnology("工艺");
        projectModel.setProjectStandard("标准");
        projectModel.setProjectDescription("项目描述");
        projectModel.setProjectLeaderName("负责人名字");
        projectModel.setProjectLeaderPhone("负责人手机");
        projectModel.setProjectId(projectId);
        projectModel.setProjectMissions(projectMissions);
        projectModel.setPicFiles(picFiles);
        projectModel.setDocFiles(docFiles);

        String s = JSON.toJSONString(projectModel, true);
        System.out.println(s);

        boolean b = projectService.setupProjectDemo(projectModel);
        if (b) {
            return ReturnResult.create(HttpStatus.CREATED);
        }
        return ReturnResult.create(null);
    }


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