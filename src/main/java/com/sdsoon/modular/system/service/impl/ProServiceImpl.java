package com.sdsoon.modular.system.service.impl;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.DateUtil;
import com.sdsoon.core.util.IDUtil;
import com.sdsoon.modular.system.mapper.SsProMapper;
import com.sdsoon.modular.system.po.SsPro;
import com.sdsoon.modular.system.service.ProService;
import com.sdsoon.modular.system.vo.AddPro;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.Date;
import java.util.UUID;

/**
 * Created By Chr on 2019/8/27.
 */
@Service
public class ProServiceImpl implements ProService {

    @Resource
    private SsProMapper ssProMapper;
    @Value("${DOC_REAL_SAVE_PATH}")
    private String DOC_REAL_SAVE_PATH;
    public static final String DOC_ID_PREFIX = "doc_";

    @Transactional
    @Override
    public boolean insertPro(AddPro addPro) throws ResponseException, ParseException {
        if (addPro == null || StringUtils.isAnyBlank(addPro.getDate(), addPro.getProLeader(),
                addPro.getProLevel(), addPro.getProName(), addPro.getProStatus())) {
            return false;
        }
        SsPro ssPro = addDoc(addPro);
        int i = ssProMapper.insertSelective(ssPro);
        if (i == 1) {
            return true;
        }
        return false;
    }

    //doc上传:添加db
    private SsPro addDoc(AddPro addPro) throws ParseException {
        MultipartFile docFile = addPro.getFile();
        // 文件原始名称
        String originalFileName = docFile.getOriginalFilename();

        String date = addPro.getDate();//2019-07-31 - 2019-09-15
        String[] split = date.split(" ", 3);
        String createTime = split[0];
        Date create = DateUtil.convertStrDate2Date(createTime);
        String endTime = split[2];
        Date end = DateUtil.convertStrDate2Date(endTime);

        SsPro ssPro = new SsPro();
        String docIdSuffix = UUID.randomUUID().toString().replaceAll("-", "");
        String proId = DOC_ID_PREFIX + docIdSuffix;
        String path = DOC_REAL_SAVE_PATH;
        //
        ssPro.setProId(proId);
        ssPro.setProName(addPro.getProName());
        ssPro.setProCreateTime(create);
        ssPro.setProEndTime(end);
        ssPro.setProDocPath(path);
        //暂时未有上传doc
        ssPro.setProOldDocName(originalFileName);
        ssPro.setProNewDocName(newFileName(originalFileName));
        ssPro.setProLevel(Integer.valueOf(addPro.getProLevel()));
        ssPro.setProStatus(Integer.valueOf(addPro.getProStatus()));
        ssPro.setProLeaderName(addPro.getProLeader());

        return ssPro;
    }

    /**
     * 获得doc,pic上传新名字
     *
     * @param originalFilename
     * @return
     */
    private String newFileName(String originalFilename) {
        String imgPrefix = IDUtil.genImageName();
//        String imgFileName = imgPrefix + "." + StringUtils.substringAfterLast(originalFilename, ".");
        String imgFileName = imgPrefix.concat(".").concat(StringUtils.substringAfterLast(originalFilename, "."));
        return imgFileName;
    }


}
