package com.sdsoon.modular.system.service;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.vo.AddPro;
import com.sdsoon.modular.system.vo.SsProVo;

import java.text.ParseException;
import java.util.List;

/**
 * Created By Chr on 2019/8/27.
 */
public interface ProService {
    boolean insertPro(AddPro addPro) throws ResponseException, ParseException;

    List<SsProVo> selectProList();

}
