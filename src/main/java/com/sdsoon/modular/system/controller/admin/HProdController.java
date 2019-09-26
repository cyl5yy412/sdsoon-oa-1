package com.sdsoon.modular.system.controller.admin;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.JsonResult;
import com.sdsoon.modular.system.service.ProdService;
import com.sdsoon.modular.system.vo.h.OrderVo;
import com.sdsoon.modular.system.vo.h.ProdVo;
import org.apache.commons.collections.map.HashedMap;
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
        return JsonResult.error("添加失败,或者已有投产");
    }

    //修改投产状态
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
        if (map == null) {
            map.put("code", 0);
            map.put("data", null);
        }
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

    //增加订单
    @PostMapping("/order/insert")
    public JsonResult orderInsertOne(OrderVo orderVo) throws ParseException {
        boolean b = prodService.orderInsertOne(orderVo);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    //查看投产任务下的 多个订单;分类查询
    @GetMapping("/order/list")
    public Map<String, Object> orderList(@RequestParam("page") Integer page,
                                         @RequestParam("limit") Integer limit,
                                         @RequestParam(value = "projectOrderStatus", required = true) Integer projectOrderStatus,//订单状态
                                         @RequestParam(value = "projectName", required = false) String projectName//条件查询
    ) throws ResponseException {
        Map<String, Object> map = prodService.selectOrderList(page, limit, projectOrderStatus, projectName);
        return map;
    }

    //查看所有订单,不分类
    @GetMapping("/orders/list")
    public Map<String, Object> ordersList(@RequestParam("page") Integer page,
                                          @RequestParam("limit") Integer limit,
                                          @RequestParam(value = "projectName", required = false) String projectName//条件查询
    ) throws ResponseException {
        Map<String, Object> map = prodService.selectAllOrders(page, limit, projectName);
        return map;
    }

    //删除订单
    @PostMapping("/order/delete")
    public JsonResult deleteOrderById(@RequestParam("projectOrderId") String projectOrderId) throws ResponseException {
        boolean b = prodService.deleteOrderById(projectOrderId);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }

    //根据projectId查询所有订单
    @GetMapping("/order/list/gid")
    public Map<String, Object> queryOrderByGid(@RequestParam("projectId") String projectId,
                                               @RequestParam("page") Integer page,
                                               @RequestParam("limit") Integer limit) {
        Map<String, Object> objectMap = prodService.queryOrderByGid(page, limit, projectId);
        if (objectMap == null) {
            objectMap = new HashedMap();
            objectMap.put("code", 0);
            objectMap.put("data", null);
            return objectMap;
        }
        return objectMap;
    }

    //修改订单状态
    @PostMapping("/order/status")
    public JsonResult updateOrderStatus(String projectOrderId, String projectOrderStatus) {
        boolean b = prodService.updateOrderStatus(projectOrderId, projectOrderStatus);
        if (b) {
            return JsonResult.ok();
        }
        return JsonResult.error();
    }
}
