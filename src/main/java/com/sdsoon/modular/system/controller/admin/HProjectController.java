package com.sdsoon.modular.system.controller.admin;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.JsonResult;
import com.sdsoon.core.util.PageResult;
import com.sdsoon.modular.system.model.ProjectModel;
import com.sdsoon.modular.system.service.ProjectService;
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

    //多文件上传 file:多种类型,判断后缀名后上传
    @PostMapping("/upload")
    public JsonResult uploadAll(List<MultipartFile> file, String projectId) throws ResponseException, ParseException {

        boolean b = projectService.uploadAll(file, projectId);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    //展示所有project
    @GetMapping("/list")
    public PageResult<SsProjectManageVo> list(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit) throws ResponseException {
        PageResult<SsProjectManageVo> ssProjectManageVoPageResult = projectService.selectAllProjects(page, limit);
        return ssProjectManageVoPageResult;
    }

//    @PostMapping("/uploadfile")
//    public JsonResult uploadFile(ProjectModel projectModel) throws ResponseException, ParseException {
//        boolean b = projectService.uploadFile(projectModel);
//        if (b) {
//            return JsonResult.ok();
//        }
//        return JsonResult.error();
//    }


}
