package com.sdsoon.modular.system.service;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.vo.h.ProdVo;

import java.text.ParseException;
import java.util.Map;

/**
 * Created By Chr on 2019/9/24.
 */
public interface ProdService {
    //h
    boolean prodInsertOne(ProdVo prodVo) throws ParseException;

    boolean updateProdStatus(String projectId, String projectProdStatus);

    Map<String, Object> queryProdMissionByGId(String projectId, Integer page, Integer limit);

    //q
    Map<String, Object> list(Integer page, Integer limit, String missionName, String prodName, String projectProdLeaderName);

    boolean deleteProdById(String projectProdId) throws ResponseException;

    Map<String, Object> queryProdById(String projectProdId) throws ResponseException;

    boolean updateProdById(ProdVo prodVo) throws ParseException;


}
