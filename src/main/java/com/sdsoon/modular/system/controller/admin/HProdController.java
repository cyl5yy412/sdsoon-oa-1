package com.sdsoon.modular.system.controller.admin;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.JsonResult;
import com.sdsoon.modular.system.service.ProdService;
import com.sdsoon.modular.system.vo.h.ProdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Map;

/**
 * 后台生产管理
 * Created By Chr on 2019/9/24.
 */
@RestController
@RequestMapping("/prd")
public class HProdController {

    @Autowired
    private ProdService prodService;

    //单个项目 添加一个投产
    @PostMapping("/prod/insert")
    public JsonResult prodInsertOne(ProdVo prodVo) throws ParseException {
        boolean b = prodService.prodInsertOne(prodVo);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    //修改投产转改
    @PostMapping("/prod/updateStatus")
    public JsonResult updateProdStatus(String projectId, String projectProdStatus) {
        boolean b = prodService.updateProdStatus(projectId, projectProdStatus);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    //展示 该项目下的 投产
    @GetMapping("/list/prod")
    public Map<String, Object> queryProdMissionByGId(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit,//
                                                     @RequestParam("projectId") String projectId) {
        Map<String, Object> map = prodService.queryProdMissionByGId(projectId, page, limit);
        return map;
    }

    //删除单个投产任务
    @PostMapping("/delete")
    public JsonResult deleteProdById(@RequestParam("projectProdId") String projectProdId) throws ResponseException {
        boolean b = prodService.deleteProdById(projectProdId);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    //订单####################################

}
