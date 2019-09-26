package com.sdsoon.modular.system.controller.admin;

import com.sdsoon.core.response.ex.BaseController;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.JsonResult;
import com.sdsoon.core.util.PageResult;
import com.sdsoon.core.util.StringUtil;
import com.sdsoon.modular.system.model.ProjectModel;
import com.sdsoon.modular.system.po.SsProjectDoc;
import com.sdsoon.modular.system.service.ProjectService;
import com.sdsoon.modular.system.vo.h.PicVo;
import com.sdsoon.modular.system.vo.h.SsProjectManageVo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * 后台项目管理
 * Created By Chr on 2019/8/30.
 */
@RestController
@RequestMapping("/pro")
public class HProjectController extends BaseController {

    @Autowired
    private ProjectService projectService;

    //添加立项
    @PostMapping("/setup")
    @RequiresPermissions({"system:admin", "project:manager"})
    public JsonResult setup(ProjectModel projectModel) throws ResponseException, ParseException {
        String projectId = projectService.setupProject(projectModel);
        if (projectId.trim() == null || projectId.trim().length() == 0) {
            return JsonResult.error();
        }
        return JsonResult.ok(projectId);
    }


    //添加项目:picid 和docid 更新projectId为gid
    @PostMapping("/setup2")
    @RequiresPermissions({"system:admin", "project:manager"})
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
    @RequiresPermissions({"system:admin", "project:manager"})
    public JsonResult uploadAll(List<MultipartFile> file, String projectId) throws ResponseException, ParseException {

        boolean b = projectService.uploadAll(file, projectId);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    @PostMapping("/upload2/pic")
    @RequiresPermissions({"system:admin", "project:manager"})
    public JsonResult uploadAll2pic(List<MultipartFile> file) throws ResponseException, ParseException {
        String picIdStr = projectService.uploadAll2pic(file);
        if (picIdStr != null) {
            return JsonResult.ok(picIdStr);
        }
        return JsonResult.error();
    }

    @PostMapping("/upload2/doc")
    @RequiresPermissions({"system:admin", "project:manager"})
    public JsonResult uploadAll2doc(List<MultipartFile> file) throws ResponseException, ParseException {
        String docIdStr = projectService.uploadAll2doc(file);
        if (docIdStr != null) {
            return JsonResult.ok(docIdStr);
        }
        return JsonResult.error();
    }

    //展示所有project
    @GetMapping("/list")
    @RequiresPermissions({"system:admin", "project:manager"})
    public Map<String, Object> list(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, String projectName, String projectLeaderName) throws ResponseException {
        Map<String, Object> map = projectService.selectAllProjects(page, limit, projectName, projectLeaderName);
        return map;
    }

    //展示所有已完成的project
    @GetMapping("/donelist")
    @RequiresPermissions({"system:admin", "project:manager"})
    public Map<String, Object> doneList(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, String projectName, String projectLeaderName) throws ResponseException {
        Map<String, Object> map = projectService.selectAllDoneProjects(page, limit, projectName, projectLeaderName);
        return map;
    }

    //展示所有已投产project
    @GetMapping("/doneprodlist")
    @RequiresPermissions({"system:admin", "project:manager"})
    public Map<String, Object> doneProdList(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, String projectName, String projectLeaderName) throws ResponseException {
        Map<String, Object> map = projectService.selectAllDoneProdProjects(page, limit, projectName, projectLeaderName);
        return map;
    }
//    @GetMapping("/list")
//    public PageResult<SsProjectManageVo> list2(HttpServletRequest request) throws ResponseException {
//        return projectService.selectAllProjects2(new PageParam(request));
//
//    }

    //查看任务节点
    @GetMapping("/list/mission")
    @RequiresPermissions({"system:admin", "project:manager"})
    public Map<String, Object> missionList(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit, String projectId) {
        Map<String, Object> map = projectService.selectMissionByProjectId(projectId, page, limit);
        return map;
    }

    //删除任务
    @PostMapping("/mission/delete")
    @RequiresPermissions({"system:admin", "project:manager"})
    public JsonResult deleteMission(String projectMissionId) throws ParseException {
        boolean b = projectService.deleteMission(projectMissionId);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    //更新项目
    @PostMapping("/project/update")
    @RequiresPermissions({"system:admin", "project:manager"})
    public JsonResult updateProject(SsProjectManageVo ssProjectManageVo) throws ParseException {
        boolean b = projectService.updateProject(ssProjectManageVo);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    @PostMapping("/project/delete")
    @RequiresPermissions({"system:admin", "project:manager"})
    public JsonResult deleteProject(String projectId) throws ParseException {
        boolean b = projectService.delete(projectId);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    @PostMapping("/project/updateStatus")
    @RequiresPermissions({"system:admin", "project:manager"})
    public JsonResult updateStatus(String projectId, String projectStatus) {
        boolean b = projectService.updateStatus(projectId, projectStatus);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    //查看板标
    @GetMapping("/pic/show")
    @RequiresPermissions({"system:admin", "project:manager"})
    public PageResult<PicVo> picShow(String projectId) {
        PageResult<PicVo> ssProjectPicPageResult = projectService.selectPicByProjectId(projectId);
        return ssProjectPicPageResult;
    }

    //删除板标
    @PostMapping("/pic/delete")
    @RequiresPermissions({"system:admin", "project:manager"})
    public JsonResult picDelete(String projectPicId, String projectPicNewName) {
        boolean b = projectService.deletePic(projectPicId, projectPicNewName);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    //查看文档
    @GetMapping("/doc/show")
    @RequiresPermissions({"system:admin", "project:manager"})
    public PageResult<SsProjectDoc> docShow(String projectId) {
        PageResult<SsProjectDoc> ssProjectPicPageResult = projectService.selectDocByProjectId(projectId);
        return ssProjectPicPageResult;
    }

    //删除文档
    @PostMapping("/doc/delete")
    @RequiresPermissions({"system:admin", "project:manager"})
    public JsonResult docDelete(String projectDocId, String projectDocNewName) {
        boolean b = projectService.deleteDoc(projectDocId, projectDocNewName);

        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }


}
