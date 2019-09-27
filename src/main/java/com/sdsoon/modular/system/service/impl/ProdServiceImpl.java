package com.sdsoon.modular.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sdsoon.core.response.ex.EnumError;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.DateUtil;
import com.sdsoon.modular.system.mapper.SsProjectManageMapper;
import com.sdsoon.modular.system.mapper.SsProjectOrderMapper;
import com.sdsoon.modular.system.mapper.SsProjectProdDocMapper;
import com.sdsoon.modular.system.mapper.SsProjectProdMapper;
import com.sdsoon.modular.system.model.OrderProdManageModel;
import com.sdsoon.modular.system.model.ProjectOrderModel;
import com.sdsoon.modular.system.po.*;
import com.sdsoon.modular.system.service.ProdService;
import com.sdsoon.modular.system.vo.h.OrderVo;
import com.sdsoon.modular.system.vo.h.ProdVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created By Chr on 2019/9/24.
 */
@Service
public class ProdServiceImpl implements ProdService {

    @Resource
    private SsProjectManageMapper ssProjectManageMapper;
    @Resource
    private SsProjectProdMapper ssProjectProdMapper;
    @Resource
    private SsProjectOrderMapper ssProjectOrderMapper;
    @Resource
    private SsProjectProdDocMapper ssProjectProdDocMapper;

    @Transactional
    @Override
    public boolean prodInsertOne(ProdVo prodVo) throws ParseException {
        if (prodVo == null ||
                StringUtils.isAnyBlank(prodVo.getProjectId(), prodVo.getProjectProdName(),
                        prodVo.getProjectProdMissionName(), prodVo.getProjectProdDate()
                )) {
            return false;
        }
        SsProjectProdExample example = new SsProjectProdExample();
        SsProjectProdExample.Criteria criteria = example.createCriteria();
        criteria.andProjectGProjectIdEqualTo(prodVo.getProjectId());
        List<SsProjectProd> ssProjectProds = ssProjectProdMapper.selectByExample(example);
        if (ssProjectProds.size() > 0) {
            return false;
        }
        //添加投产
        SsProjectProd ssProjectProd = convertProdBeanFromProdVo(prodVo);
        if (ssProjectProd == null) {
            return false;
        }
        int i = ssProjectProdMapper.insertSelective(ssProjectProd);
        if (i == 1) {
            //添加文档=====暂无
            return true;
        }
        return false;
    }

    @Transactional
    @Override
    public boolean updateProdStatus(String projectId, String projectProdStatus) {
        if (StringUtils.isAnyBlank(projectId, projectProdStatus)) {
            return false;
        }
        SsProjectManage ssProjectManage = new SsProjectManage();
        ssProjectManage.setProjectId(projectId);
        ssProjectManage.setProjectStatus(Integer.valueOf(projectProdStatus));
        int i = ssProjectManageMapper.updateByPrimaryKeySelective(ssProjectManage);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public Map<String, Object> queryProdMissionByGId(String projectId, Integer page, Integer limit) {
        if (StringUtils.isBlank(projectId)) {
            return null;
        }
        PageHelper.startPage(page, limit);
        SsProjectProdExample example = new SsProjectProdExample();
        SsProjectProdExample.Criteria criteria = example.createCriteria();
        criteria.andProjectGProjectIdEqualTo(projectId);
        List<SsProjectProd> ssProjectProds = ssProjectProdMapper.selectByExample(example);
        if (ssProjectProds.size() == 0 || ssProjectProds == null) {
            return null;
        }
        PageInfo<SsProjectProd> pageInfo = new PageInfo<>(ssProjectProds);
        Map<String, Object> map = new HashMap<>();
        map.put("count", pageInfo.getTotal());
        map.put("data", ssProjectProds);
        map.put("code", 0);
        map.put("msg", "");
        map.put("status", "success");
        return map;
    }

    @Override
    public Map<String, Object> list(Integer page, Integer limit, String missionName, String prodName, String projectProdLeaderName) {
        if (page == null || limit == null) {
            return null;
        }
        PageHelper.startPage(page, limit);
        List<SsProjectProd> ssProjectProds = ssProjectProdMapper.selectAllProds(missionName, prodName, projectProdLeaderName);

        PageInfo<SsProjectProd> pageInfo = new PageInfo<>(ssProjectProds);
        Map<String, Object> map = new HashMap<>();
        //总数量
        long total = ssProjectProdMapper.countByExample(null);

        map.put("total", total);
        map.put("data", ssProjectProds);
        map.put("code", 0);
        map.put("msg", "");
        map.put("status", "success");
        return map;
    }

    @Transactional
    @Override
    public boolean deleteProdById(String projectProdId) throws ResponseException {
        if (StringUtils.isBlank(projectProdId)) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        int i = ssProjectProdMapper.deleteByPrimaryKey(projectProdId);
        if (i == 1) {
            return true;
        }
        return false;

    }

    @Override
    public Map<String, Object> queryProdById(String projectProdId) throws ResponseException {
        if (StringUtils.isBlank(projectProdId)) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        SsProjectProd ssProjectProd = ssProjectProdMapper.selectByPrimaryKey(projectProdId);
        if (ssProjectProd == null) {
            return null;
        }
        Map<String, Object> map = new HashMap<>();
        map.put("data", ssProjectProd);
        map.put("code", 0);
        map.put("msg", "");
        map.put("status", "success");
        return map;
    }

    @Transactional
    @Override
    public boolean updateProdById(ProdVo prodVo) throws ParseException {
        if (StringUtils.isAnyBlank(prodVo.getProjectProdId())) {
            return false;
        }
        SsProjectProd ssProjectProd = convertProdBeanFromProdVoTUpdate(prodVo);
        int i = ssProjectProdMapper.updateByPrimaryKeySelective(ssProjectProd);
        if (i == 1) {
            return true;
        }
        return false;
    }

    //订单####################################
    @Override
    public Map<String, Object> selectOrderList(Integer page, Integer limit, Integer projectOrderStatus, String projectName) throws ResponseException {
        if (projectOrderStatus == null) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        PageHelper.startPage(page, limit);
        OrderProdManageModel orderProdManageModel=new OrderProdManageModel();
        orderProdManageModel.setProjectOrderStatus(projectOrderStatus);
        orderProdManageModel.setProjectName(projectName);
        List<ProjectOrderModel> ssProjectOrders = ssProjectOrderMapper.selectOrderList(orderProdManageModel);
        PageInfo<ProjectOrderModel> pageInfo = new PageInfo<>(ssProjectOrders);
        Map<String, Object> map = new HashMap<>();
        map.put("count", pageInfo.getTotal());
        map.put("data", ssProjectOrders);
        map.put("code", 0);
        map.put("msg", "");
        map.put("status", "success");
        return map;
    }

    @Transactional
    @Override
    public boolean orderInsertOne(OrderVo orderVo) {
        if (StringUtils.isAnyBlank(orderVo.getProjectId())) {
            return false;
        }

        orderVo.setProjectGProjectId(orderVo.getProjectId());
        SsProjectOrder ssProjectOrder = new SsProjectOrder();
        BeanUtils.copyProperties(orderVo, ssProjectOrder);
        ssProjectOrder.setProjectOrderId(UUID.randomUUID().toString().replaceAll("-", ""));
        ssProjectOrder.setProjectOrderStatus(0);
        //prod
        SsProjectProd ssProjectProd = ssProjectProdMapper.selectByGid(orderVo.getProjectId());
        //OrderProdManageModel
        if (ssProjectProd == null) {
            return false;
        }
        ssProjectOrder.setProjectGProdId(ssProjectProd.getProjectProdId());
        ssProjectOrder.setProjectOrderDate(new Date());
        int i = ssProjectOrderMapper.insertSelective(ssProjectOrder);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Transactional
    @Override
    public boolean deleteOrderById(String projectOrderId) {
        if (StringUtils.isAnyBlank(projectOrderId)) {
            return false;
        }
        int i = ssProjectOrderMapper.deleteByPrimaryKey(projectOrderId);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public Map<String, Object> selectAllOrders(Integer page, Integer limit, String projectName) {
        PageHelper.startPage(page, limit);
        List<ProjectOrderModel> ssProjectOrders = ssProjectOrderMapper.selectAllOrders(projectName);
        PageInfo<ProjectOrderModel> pageInfo = new PageInfo<>(ssProjectOrders);
        Map<String, Object> map = new HashMap<>();
        map.put("count", pageInfo.getTotal());
        map.put("data", ssProjectOrders);
        map.put("code", 0);
        map.put("msg", "");
        map.put("status", "success");
        return map;
    }

    @Override
    public Map<String, Object> queryOrderByGid(Integer page, Integer limit, String projectId) {
        if (StringUtils.isAnyBlank(projectId)) {
            return null;
        }
        PageHelper.startPage(page, limit);
        //order
        SsProjectOrderExample example = new SsProjectOrderExample();
        SsProjectOrderExample.Criteria criteria = example.createCriteria();
        criteria.andProjectGProjectIdEqualTo(projectId);
        List<SsProjectOrder> ssProjectOrders = ssProjectOrderMapper.selectByExample(example);
        if (ssProjectOrders == null || ssProjectOrders.size() == 0) {
            return null;
        }
        //prod
        SsProjectProd ssProjectProd = ssProjectProdMapper.selectByGid(projectId);
        //OrderProdManageModel
        if (ssProjectProd == null) {
            return null;
        }
        List<OrderProdManageModel> collect = ssProjectOrders.stream().map(ssProjectOrder -> {
            OrderProdManageModel orderProdManageModel = convertOrdersFromModel(ssProjectOrder);
            orderProdManageModel.setProjectId(projectId);
            orderProdManageModel.setProjectGProjectId(projectId);
            orderProdManageModel.setProjectGProdId(ssProjectProd.getProjectProdId());
            orderProdManageModel.setProjectProdId(ssProjectProd.getProjectProdId());
            orderProdManageModel.setProjectProdName(ssProjectProd.getProjectProdName());
            return orderProdManageModel;
        }).collect(Collectors.toList());

        PageInfo<SsProjectOrder> pageInfo = new PageInfo<>(ssProjectOrders);
        Map<String, Object> map = new HashMap<>();
        map.put("count", pageInfo.getTotal());
        map.put("data", collect);
        map.put("code", 0);
        map.put("msg", "");
        map.put("status", "success");
        return map;
    }

    @Override
    public boolean updateOrderStatus(String projectOrderId, String projectOrderStatus) {
        if (StringUtils.isAnyBlank(projectOrderId, projectOrderStatus)) {
            return false;
        }
        SsProjectOrder ssProjectOrder = new SsProjectOrder();
        ssProjectOrder.setProjectOrderStatus(Integer.valueOf(projectOrderStatus));
        ssProjectOrder.setProjectOrderId(projectOrderId);
        int i = ssProjectOrderMapper.updateByPrimaryKeySelective(ssProjectOrder);
        if (i == 1) {
            return true;
        }
        return false;
    }

    //order->model
    private OrderProdManageModel convertOrdersFromModel(SsProjectOrder ssProjectOrder) {
        if (ssProjectOrder == null) {
            return null;
        }
        OrderProdManageModel orderProdManageModel = new OrderProdManageModel();
        BeanUtils.copyProperties(ssProjectOrder, orderProdManageModel);
        switch (orderProdManageModel.getProjectOrderStatus()) {
            case 0:
                orderProdManageModel.setProjectOrderStatusS("待生产");
                break;
            case 1:
                orderProdManageModel.setProjectOrderStatusS("已完成");
                break;
        }
        return orderProdManageModel;
    }

    @Override
    public Map<String, Object> queryOrderOneById(String projectOrderId) throws ResponseException {
        if (StringUtils.isAnyBlank(projectOrderId)) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        SsProjectOrder ssProjectOrder = ssProjectOrderMapper.selectByPrimaryKey(projectOrderId);
        Map<String, Object> map = new HashMap<>();
        map.put("data", ssProjectOrder);
        map.put("code", 0);
        map.put("msg", "");
        map.put("status", "success");
        return map;
    }

    @Transactional
    @Override
    public boolean deleteOrderOneById(String projectOrderId) throws ResponseException {
        if (StringUtils.isAnyBlank(projectOrderId)) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        int i = ssProjectOrderMapper.deleteByPrimaryKey(projectOrderId);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Transactional
    @Override
    public boolean updateOrderOne(OrderVo orderVo) throws ResponseException {
        if (StringUtils.isAnyBlank(orderVo.getProjectProdId())) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        SsProjectOrder ssProjectOrder = new SsProjectOrder();
        BeanUtils.copyProperties(orderVo, ssProjectOrder);
        int i = ssProjectOrderMapper.updateByPrimaryKeySelective(ssProjectOrder);
        if (i == 1) {
            return true;
        }
        return false;
    }


    //无id
    private SsProjectProd convertProdBeanFromProdVo(ProdVo prodVo) throws ParseException {
        if (prodVo == null) {
            return null;
        }
        SsProjectProd ssProjectProd = new SsProjectProd();
        BeanUtils.copyProperties(prodVo, ssProjectProd);
        Date prodDate = DateUtil.convertStrDate2Date(prodVo.getProjectProdDate());
        ssProjectProd.setProjectProdDate(prodDate);
        ssProjectProd.setProjectGProjectId(prodVo.getProjectId());//
        String prodId = UUID.randomUUID().toString().replaceAll("-", "");
        ssProjectProd.setProjectProdId(prodId);
        return ssProjectProd;
    }

    //更新的convert(有id)
    private SsProjectProd convertProdBeanFromProdVoTUpdate(ProdVo prodVo) throws ParseException {
        if (prodVo == null) {
            return null;
        }
        SsProjectProd ssProjectProd = new SsProjectProd();
        BeanUtils.copyProperties(prodVo, ssProjectProd);
        Date prodDate = DateUtil.convertStrDate2Date(prodVo.getProjectProdDate());
        ssProjectProd.setProjectProdDate(prodDate);
        ssProjectProd.setProjectGProjectId(prodVo.getProjectId());//
        return ssProjectProd;
    }
}
