package com.sdsoon.modular.system.service;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.PageResult;
import com.sdsoon.modular.system.model.ProjectModel;
import com.sdsoon.modular.system.model.ProjectPoModel;
import com.sdsoon.modular.system.po.SsProjectDoc;
import com.sdsoon.modular.system.po.SsProjectMission;
import com.sdsoon.modular.system.vo.AddMissionVo;
import com.sdsoon.modular.system.vo.h.PicVo;
import com.sdsoon.modular.system.vo.h.SsProjectManageVo;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

//import com.sdsoon.core.util.PageParam;

/**
 * Created By Chr on 2019/8/22.
 */
public interface ProjectService {
    //后台
    String setupProject(ProjectModel projectModel) throws ResponseException, ParseException;

    //中台
    ProjectPoModel selectProjectById(String projectId) throws ResponseException;

    //中台
    boolean download(String downloadId, HttpServletResponse response) throws ResponseException, IOException;

    //中台
    boolean addMission(AddMissionVo addMissionVo) throws ResponseException;

    //后台
    boolean uploadFile(ProjectModel projectModel);

    //后台
    boolean uploadAll(List<MultipartFile> file, String projectId);

    //后台
    Map<String, Object> selectAllProjects(Integer page, Integer limit, String projectName, String projectLeaderName);

    //后台
    Map<String, Object> selectMissionByProjectId(String projectId, Integer page, Integer limit);

    //后台
    boolean updateProject(SsProjectManageVo ssProjectManageVo) throws ParseException;

    //后台
    boolean delete(String projectId);

    //后台
    boolean updateStatus(String projectId, String projectStatus);

    //后台
    boolean deleteMission(String projectMissionId);

    //中台
    boolean updateMission(AddMissionVo addMissionVo) throws ResponseException;

    //中台
    Map<String, Object> selectAllProjectsByStatus(Integer status, Integer page, Integer limit);

    //中台
    SsProjectMission getMissionById(String projectMissionId);

    //后台

    String uploadAll2pic(List<MultipartFile> file);

    String uploadAll2doc(List<MultipartFile> file);

    Map<String, Object> selectAllProject(Integer page, Integer limit, String projectName);

    boolean setupProject2(ProjectModel projectModel, List<String> picIdList, List<String> docIdList) throws ParseException;

    PageResult<PicVo> selectPicByProjectId(String projectId);

    boolean deletePic(String projectPicId, String projectPicNewName);

    PageResult<SsProjectDoc> selectDocByProjectId(String projectId);

    boolean deleteDoc(String projectDocId, String projectDocNewName);

    Map<String,Object> selectAllDoneProjects(Integer page, Integer limit, String projectName, String projectLeaderName);

    //数据结构修改
    Map<String,Object> selectAllProject2(Integer page, Integer limit, String projectName);

    //后端分页
//    PageResult<SsProjectManageVo> selectAllProjects2(PageParam pageParam);
}
