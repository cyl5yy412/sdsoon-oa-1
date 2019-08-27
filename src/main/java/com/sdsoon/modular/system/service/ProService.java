package com.sdsoon.modular.system.service;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.modular.system.vo.AddPro;

import java.text.ParseException;

/**
 * Created By Chr on 2019/8/27.
 */
public interface ProService {
    boolean insertPro(AddPro addPro) throws ResponseException, ParseException;
}
