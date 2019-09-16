package com.sdsoon;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.DateUtil;
import com.sdsoon.modular.system.mapper.*;
import com.sdsoon.modular.system.model.ProjectMissionModel;
import com.sdsoon.modular.system.po.*;
import com.sdsoon.modular.system.service.DailyTaskService;
import com.sdsoon.modular.system.service.ProjectService;
import com.sdsoon.modular.system.vo.AddMissionVo;
import com.sdsoon.modular.system.vo.UserVo;
import com.sun.org.apache.xerces.internal.impl.PropertyManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SdsoonOaApplicationTests {

    @Resource
    private SsUserInfoMapper ssUserInfoMapper;
    @Resource
    private SsPermissionMapper ssPermissionMapper;
    @Resource
    private SsRoleMapper ssRoleMapper;

  /*  @Test
    public void contextLoads() {
        SsUserInfoExample example = new SsUserInfoExample();
//		SsUserInfoExample.Criteria criteria = example.createCriteria();
        long l = ssUserInfoMapper.countByExample(null);
        System.out.println(l);
    }*/

   /* @Test
    public void contextLoads2() {
        List<SsPermission> ssPermissions = ssPermissionMapper.selectByExample(null);
        System.out.println(ssPermissions);
        long l = ssRoleMapper.countByExample(null);
        System.out.println(l);
    }*/

    @Autowired
    private ProjectService projectService;

    @Resource
    private SsProjectManageMapper ssProjectManageMapper;
    @Resource
    private SsProjectDocMapper ssProjectDocMapper;
    @Resource
    private SsProjectPicMapper ssProjectPicMapper;
    @Resource
    private SsProjectMissionMapper ssProjectMissionMapper;

   /* @Test
    public void show2() {
        String id = "695b1acedf034b09be4246fba42c56ce";
        SsProjectMissionExample example = new SsProjectMissionExample();
        SsProjectMissionExample.Criteria criteria = example.createCriteria();
        criteria.andProjectGProjectIdEqualTo(id);
        List<SsProjectMission> ssProjectMissions = ssProjectMissionMapper.selectByExample(example);
        long total = ssProjectMissionMapper.countByExample(example);
        System.out.println(total);
        System.out.println(ssProjectMissions);
    }*/

    /*  @Test
      public void show3() {
  //        List<SsProjectPic> projectPics = new ArrayList<>();
  //        SsProjectPic ssProjectPic1 = new SsProjectPic();
  //        ssProjectPic1.setProjectPicId("123");
  //        SsProjectPic ssProjectPic2 = new SsProjectPic();
  //        ssProjectPic2.setProjectPicId("456");
  //        projectPics.add(ssProjectPic1);
  //        projectPics.add(ssProjectPic2);
  //        int picNum = ssProjectPicMapper.deletes(projectPics);
  //        System.out.println(picNum);
          //
  //        List<SsProjectDoc> projectDocs = new ArrayList<>();
  //        SsProjectDoc ssProjectDoc1=new SsProjectDoc();
  //        ssProjectDoc1.setProjectDocId("123");
  //        ssProjectDoc1.setProjectGProjectId("sada");
  //        SsProjectDoc ssProjectDoc2=new SsProjectDoc();
  //        ssProjectDoc2.setProjectDocId("456");
  //        ssProjectDoc2.setProjectDocNewName("fs");
  //        projectDocs.add(ssProjectDoc1);
  //        projectDocs.add(ssProjectDoc2);
  //        int docNum = ssProjectDocMapper.deletes(projectDocs);
  //        System.out.println(docNum);
          //
          //根据gid删除
          String projectId = "55";
          int picNum = ssProjectPicMapper.deleteByGId(projectId);
          System.out.println(picNum);
          int docNum = ssProjectDocMapper.deleteByGId(projectId);
          System.out.println(docNum);
          int missionNum = ssProjectMissionMapper.deleteByGId(projectId);
          System.out.println(missionNum);
      }*/

  /*  @Test
    public void show4() {
        String fileGId = "fa5feb93216146f78ecc78f01a12257d";
        List<String> picIdList = new ArrayList<>();
        picIdList.add("pic_031aa7dfc11640968773ef8fcb833e43");
        picIdList.add("pic_0f43ae1772fd4dbc828a3f6500bf80e5");
        picIdList.add("pic_1157299214d749f4a050a2e8637d8d34");
        int ipic = ssProjectPicMapper.updatesGIdById(fileGId, picIdList);
        System.out.println(ipic);
    }*/

/*    @Test
    public void show5() {
        String fileGId = "fa5feb93216146f78ecc78f01a12257d";
        List<String> docIdList = new ArrayList<>();
        docIdList.add("doc_27206e5bb69646fdbd634fe0afa9b891");
        docIdList.add("doc_38c40f6e46d7434f9e349ebaed926509");
        docIdList.add("doc_7273c762daa5476ea557d68d9bfa4630");
        int idoc = ssProjectDocMapper.updatesGIdById(fileGId, docIdList);
        System.out.println(idoc);
    }*/

    @Resource
    private AdminMapper adminMapper;
    @Resource
    private SsDailyTaskMapper ssDailyTaskMapper;
    @Autowired
    private DailyTaskService dailyTaskService;

    @Test
    public void show6() throws ParseException {
//        List<SsProjectManage> ssProjectManages = ssProjectManageMapper.selectAllProjects(2,10);
//        System.out.println(ssProjectManages);
        //
//        List<SsProjectManage> ssProjectManages = ssProjectManageMapper.selectAllProjectsByStatus(1);
//        System.out.println(ssProjectManages);
        //
//        Map<String, Object> map = projectService.selectAllProject(1, 10,null);
//        System.out.println(map);
        //
//        List<UserVo> userVos = adminMapper.selectAllUsersAndRoles("c", "c");
//        System.out.println(userVos.size());
        //
//        List<SsDailyTask> ssDailyTasks = ssDailyTaskMapper.selectDailyTaskByCategory(2, "");
//        System.out.println(ssDailyTasks.size());
        Map<String, Object> dailyTask = dailyTaskService.getDailyTask(2, "", 1, 10);
        System.out.println(dailyTask.size());
    }
}
