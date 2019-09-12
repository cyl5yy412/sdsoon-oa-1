package com.sdsoon.modular.system.controller.admin;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.JsonResult;
import com.sdsoon.core.util.PageResult;
import com.sdsoon.core.util.StringUtil;
import com.sdsoon.modular.system.model.ProjectMissionModel;
import com.sdsoon.modular.system.model.ProjectModel;
import com.sdsoon.modular.system.po.SsProjectDoc;
import com.sdsoon.modular.system.service.ProjectService;
import com.sdsoon.modular.system.vo.h.PicVo;
import com.sdsoon.modular.system.vo.h.SsProjectManageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.text.ParseException;
import java.util.List;

/**
 * 后台项目管理
 * Created By Chr on 2019/8/30.
 */
@RestController
@RequestMapping("/pro")
public class HProjectController {

    @Autowired
    private ProjectService projectService;

    //添加立项
    @PostMapping("/setup")
    public JsonResult setup(ProjectModel projectModel) throws ResponseException, ParseException {
        String projectId = projectService.setupProject(projectModel);
        if (projectId.trim() == null || projectId.trim().length() == 0) {
            return JsonResult.error();
        }
        return JsonResult.ok(projectId);
    }


    //添加项目:picid 和docid 更新projectId为gid
    @PostMapping("/setup2")
    public JsonResult setup2(ProjectModel projectModel, String picIdStr, String docIdStr) throws ResponseException, ParseException {
        //pic_7d97d97544884e188bd8829bde73c913.pic_3c13a8621a2d40b7951193958df85bfd.
        //doc_687b7a331dea480289065d33a16d1d7d.doc_38c40f6e46d7434f9e349ebaed926509.
        List<String> picIdList = StringUtil.splitFileId(picIdStr);
        List<String> docIdList = StringUtil.splitFileId(docIdStr);
        boolean b = projectService.setupProject2(projectModel, picIdList, docIdList);
        if (!b) {
            return JsonResult.error();
        }
        return JsonResult.ok();
    }

    //多文件上传 file:多种类型,判断后缀名后上传,projectId上传
    @PostMapping("/upload")
    public JsonResult uploadAll(List<MultipartFile> file, String projectId) throws ResponseException, ParseException {

        boolean b = projectService.uploadAll(file, projectId);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    @PostMapping("/upload2/pic")
    public JsonResult uploadAll2pic(List<MultipartFile> file) throws ResponseException, ParseException {
        String picIdStr = projectService.uploadAll2pic(file);
        if (picIdStr != null) {
            return JsonResult.ok(picIdStr);
        }
        return JsonResult.error();
    }

    @PostMapping("/upload2/doc")
    public JsonResult uploadAll2doc(List<MultipartFile> file) throws ResponseException, ParseException {
        String docIdStr = projectService.uploadAll2doc(file);
        if (docIdStr != null) {
            return JsonResult.ok(docIdStr);
        }
        return JsonResult.error();
    }

    //展示所有project
    @GetMapping("/list")
    public PageResult<SsProjectManageVo> list(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit) throws ResponseException {
        PageResult<SsProjectManageVo> ssProjectManageVoPageResult = projectService.selectAllProjects(page, limit);
        return ssProjectManageVoPageResult;
    }
//    @GetMapping("/list")
//    public PageResult<SsProjectManageVo> list2(HttpServletRequest request) throws ResponseException {
//        return projectService.selectAllProjects2(new PageParam(request));
//
//    }

    //查看任务节点
    @GetMapping("/list/mission")
    public PageResult<ProjectMissionModel> missionList(@RequestParam String projectId, @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
        PageResult<ProjectMissionModel> projectMissionModelPageResult = projectService.selectMissionByProjectId(projectId);
        return projectMissionModelPageResult;
    }

    //删除任务
    @PostMapping("/mission/delete")
    public JsonResult deleteMission(String projectMissionId) throws ParseException {
        boolean b = projectService.deleteMission(projectMissionId);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    //更新项目
    @PostMapping("/project/update")
    public JsonResult updateProject(SsProjectManageVo ssProjectManageVo) throws ParseException {
        boolean b = projectService.updateProject(ssProjectManageVo);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    @PostMapping("/project/delete")
    public JsonResult deleteProject(String projectId) throws ParseException {
        boolean b = projectService.delete(projectId);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    @PostMapping("/project/updateStatus")
    public JsonResult updateStatus(String projectId, String projectStatus) {
        boolean b = projectService.updateStatus(projectId, projectStatus);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    //查看板标
    @GetMapping("/pic/show")
    public PageResult<PicVo> picShow(String projectId) {
        PageResult<PicVo> ssProjectPicPageResult = projectService.selectPicByProjectId(projectId);
        return ssProjectPicPageResult;
    }

    //删除板标
    @PostMapping("/pic/delete")
    public JsonResult picDelete(String projectPicId,String projectPicNewName) {
        boolean b = projectService.deletePic(projectPicId,projectPicNewName);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    //查看文档
    @GetMapping("/doc/show")
    public PageResult<SsProjectDoc> docShow(String projectId) {
        PageResult<SsProjectDoc> ssProjectPicPageResult = projectService.selectDocByProjectId(projectId);
        return ssProjectPicPageResult;
    }

    //删除文档
    @PostMapping("/doc/delete")
    public JsonResult docDelete(String projectDocId,String projectDocNewName) {
        boolean b = projectService.deleteDoc(projectDocId,projectDocNewName);

        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }





}
