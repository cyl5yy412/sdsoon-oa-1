package com.sdsoon.modular.system.controller;

import com.alibaba.fastjson.JSON;
import com.sdsoon.core.response.ReturnResult;
import com.sdsoon.core.response.ex.BaseController;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.service.ProdService;
import com.sdsoon.modular.system.vo.h.OrderVo;
import com.sdsoon.modular.system.vo.h.ProdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Map;

/**
 * 中台 生产管理
 * Created By Chr on 2019/9/24.
 */
@RestController
@RequestMapping("/prod")
public class ProdController extends BaseController {

    @Autowired
    private ProdService prodService;

    //展示所有投产任务
    @GetMapping("/list")
    public Map<String, Object> list(@RequestParam("page") Integer page, //
                                    @RequestParam("limit") Integer limit,//
                                    @RequestParam(value = "projectProdMissionName", required = false) String projectProdMissionName,//任务名字
                                    @RequestParam(value = "projectProdName", required = false) String projectProdName,//,产品名字
                                    @RequestParam(value = "projectProdLeaderName", required = false) String projectProdLeaderName//负责人
    ) throws ResponseException {
        Map<String, Object> objectMap = prodService.list(page, limit, projectProdMissionName, projectProdName, projectProdLeaderName);
        return objectMap;
    }

    //展示单个投产任务
    @PostMapping("/query")
    public Map<String, Object> queryProdById(@RequestParam("projectProdId") String projectProdId) throws ResponseException {
        Map<String, Object> objectMap = prodService.queryProdById(projectProdId);
        if (objectMap == null) {
            objectMap.put("data", null);
            return objectMap;
        }
        return objectMap;
    }

    //修改单个投产任务
    @PostMapping("/update")
    public ReturnResult updateProdById(@RequestBody ProdVo prodVo) throws ResponseException, ParseException {
        boolean b = prodService.updateProdById(prodVo);
        if (b) {
            return ReturnResult.create(HttpStatus.OK);
        }
        return ReturnResult.create("更新失败");
    }

    //删除单个投产任务
    @PostMapping("/delete")
    public ReturnResult deleteProdById(@RequestParam("projectProdId") String projectProdId) throws ResponseException {
        boolean b = prodService.deleteProdById(projectProdId);
        if (b) {
            return ReturnResult.create(HttpStatus.OK);
        }
        return ReturnResult.create("删除失败");
    }

    //订单####################################

    //查看所有订单,不分类
    @GetMapping("/orders/list")
    public Map<String, Object> ordersList(@RequestParam("page") Integer page,
                                          @RequestParam("limit") Integer limit,
                                          @RequestParam(value = "projectName", required = false) String projectName//条件查询
    ) throws ResponseException {
        Map<String, Object> map = prodService.selectAllOrders(page, limit, projectName);
        return map;
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

    //查看单个订单
    @PostMapping("/order/one")
    public Map<String, Object> queryOrderOne(@RequestParam("projectOrderId") String projectOrderId) throws ResponseException {
        Map<String, Object> objectMap = prodService.queryOrderOneById(projectOrderId);
        return objectMap;
    }

    //删除单个订单
    @PostMapping("/order/delete")
    public ReturnResult deleteOrderOne(@RequestParam("projectOrderId") String projectOrderId) throws ResponseException {
        boolean b = prodService.deleteOrderOneById(projectOrderId);
        if (b) {
            return ReturnResult.create(HttpStatus.OK);
        }
        return ReturnResult.create("删除失败");
    }

    //修改订单内容
    @PostMapping("/order/update")
    public ReturnResult updateOrderOne(@RequestBody OrderVo orderVo) throws ResponseException {
        boolean b = prodService.updateOrderOne(orderVo);
        if (b) {
            return ReturnResult.create(HttpStatus.OK);
        }
        return ReturnResult.create("更新失败");
    }
    //订单完成???


    public static void main(String args[]) {
        OrderVo orderVo = new OrderVo();
        orderVo.setProjectOrderId("5694e99b5tym4e168e61b5b02a2c0e34");
        orderVo.setProjectOrderPart("2批");
        orderVo.setProjectOrderProducer("南极人");
        orderVo.setProjectOrderLeaderName("陈聪聪");
        System.out.println(JSON.toJSONString(orderVo, true));
    }
}
