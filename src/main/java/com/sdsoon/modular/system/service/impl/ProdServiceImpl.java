package com.sdsoon.modular.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sdsoon.core.response.ex.EnumError;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.DateUtil;
import com.sdsoon.modular.system.mapper.SsProjectManageMapper;
import com.sdsoon.modular.system.mapper.SsProjectProdDocMapper;
import com.sdsoon.modular.system.mapper.SsProjectProdMapper;
import com.sdsoon.modular.system.po.SsProjectManage;
import com.sdsoon.modular.system.po.SsProjectManageExample;
import com.sdsoon.modular.system.po.SsProjectProd;
import com.sdsoon.modular.system.po.SsProjectProdExample;
import com.sdsoon.modular.system.service.ProdService;
import com.sdsoon.modular.system.vo.h.ProdVo;
import com.sdsoon.modular.system.vo.h.SsProjectManageVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
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
        PageInfo<SsProjectProd> pageInfo = new PageInfo<>(ssProjectProds);
        Map<String, Object> map = new HashMap<>();
        map.put("count", pageInfo.getTotal());
        map.put("data", ssProjectProds);
        map.put("code", 0);
        map.put("msg", "");
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

    //
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
