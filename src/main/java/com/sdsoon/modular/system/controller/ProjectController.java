package com.sdsoon.modular.system.controller;

import com.alibaba.fastjson.JSON;
import com.sdsoon.core.response.ReturnResult;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.PageResult;
import com.sdsoon.modular.system.model.ProjectMissionModel;
import com.sdsoon.modular.system.model.ProjectPoModel;
import com.sdsoon.modular.system.service.ProjectService;
import com.sdsoon.modular.system.vo.AddMissionVo;
import com.sdsoon.modular.system.vo.h.SsProjectManageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
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

    @GetMapping("/list")
    public PageResult<SsProjectManageVo> list(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit) throws ResponseException {
        PageResult<SsProjectManageVo> ssProjectManageVoPageResult = projectService.selectAllProjects(page, limit);
        return ssProjectManageVoPageResult;
    }

    //下载任务节点的文件
    @GetMapping("/download/{downloadId}")
    public void downLoad(@PathVariable("downloadId") String downloadId,
                         HttpServletResponse response
    ) throws ResponseException, IOException {
//        boolean b = projectService.download(downloadId, response);

        downloadNet(response);

    }

    //
    public void downloadNet(HttpServletResponse response) throws IOException {
        // 下载网络文件
        int bytesum = 0;
        int byteread = 0;

//        URL url = new URL("windine.blogdriver.com/logo.gif");
        URL url = new URL("http://oa.sdsoon.cn:8099/images/1567392147878268.java");
        FileSystemView fsv = FileSystemView.getFileSystemView();
        File com = fsv.getHomeDirectory();
        URLConnection conn = url.openConnection();
        try (
                InputStream inStream = conn.getInputStream();
                FileOutputStream fs = new FileOutputStream(com.getPath() + "/abc.java");
        ) {

            byte[] buffer = new byte[1204];
            int length;
            while ((byteread = inStream.read(buffer)) != -1) {
                bytesum += byteread;
                System.out.println(bytesum);
                fs.write(buffer, 0, byteread);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
//添加立项任务节点:mission
    @PostMapping("/setup/mission/demo")
    public ReturnResult addMissionDemo() throws ResponseException {
        AddMissionVo vo = show();
        boolean b = projectService.addMission(vo);
        if (b) {
            return ReturnResult.create(HttpStatus.CREATED);
        }
        return ReturnResult.create(null);
    }

    public static void main(String args[]) throws ParseException {
/*        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(d);
        Date parse = sdf.parse(format);
        long time = parse.getTime();
        System.out.println(format);
        System.out.println(time);
        String s = "1566403200000";
        String a = "1567395537000";
        Long timeL = Long.valueOf(s);
        Date date = new Date(timeL);
        System.out.println(date);*/


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
