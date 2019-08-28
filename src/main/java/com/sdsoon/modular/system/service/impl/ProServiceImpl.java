package com.sdsoon.modular.system.service.impl;

import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.DateUtil;
import com.sdsoon.core.util.FileUtil;
import com.sdsoon.core.util.IDUtil;
import com.sdsoon.modular.system.mapper.SsProDocMapper;
import com.sdsoon.modular.system.mapper.SsProMapper;
import com.sdsoon.modular.system.po.SsPro;
import com.sdsoon.modular.system.po.SsProDoc;
import com.sdsoon.modular.system.service.ProService;
import com.sdsoon.modular.system.vo.AddPro;
import com.sdsoon.modular.system.vo.SsProVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Created By Chr on 2019/8/27.
 */
@Service
public class ProServiceImpl implements ProService {

    @Resource
    private SsProMapper ssProMapper;
    @Resource
    private SsProDocMapper ssProDocMapper;
    @Value("${DOC_REAL_SAVE_PATH}")
    private String DOC_REAL_SAVE_PATH;
    public static final String DOC_ID_PREFIX = "doc_";

    @Transactional
    @Override
    public boolean insertPro(AddPro addPro) throws ResponseException, ParseException {
        if (addPro == null
                || StringUtils.isAnyBlank(addPro.getDate(), addPro.getProLeader(), addPro.getProLevel(), addPro.getProName(), addPro.getProStatus())
                || addPro.getFile() == null) {
            return false;
        }
        //添加pro
        SsPro ssPro = addPro(addPro);
        int i = ssProMapper.insertSelective(ssPro);
        if (i == 1) {
            //添加proDoc
            SsProDoc ssProDoc = addProDoc(addPro, ssPro.getProId());
            int i1 = ssProDocMapper.insertSelective(ssProDoc);
            if (i1 == 1) {
                //上传proDoc
                boolean b = upLoadProDoc(addPro.getFile(), ssProDoc.getProNewDocName());
                if (b) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override
    public List<SsProVo> selectProList() {
        List<SsPro> ssPros = ssProMapper.selectByExample(null);
        List<SsProDoc> ssProDocs = ssProDocMapper.selectByExample(null);
        List<SsProVo> collect = ssPros.stream().map(ssPro -> {
            SsProVo ssProVo = convertSsPro(ssPro);
            for (SsProDoc ssProDoc : ssProDocs) {
                ssProVo.setProDocId(ssProDoc.getProDocId());
                ssProVo.setProNewDocName(ssProDoc.getProNewDocName());
                ssProVo.setProOldDocName(ssProDoc.getProOldDocName());
                ssProVo.setProDocGProId(ssProDoc.getProDocGProId());
                ssProVo.setProPath(ssProDoc.getProPath());
            }
            return ssProVo;
        }).collect(Collectors.toList());
        return collect;
    }

    //
    private SsProVo convertSsPro(SsPro ssPro) {
        if (ssPro == null) {
            return null;
        }
        SsProVo ssProVo = new SsProVo();
        BeanUtils.copyProperties(ssPro, ssProVo);
        return ssProVo;
    }


    //doc上传
    private boolean upLoadProDoc(MultipartFile docFile, String newFileName) {
        String path = DOC_REAL_SAVE_PATH;
        boolean b = FileUtil.upLoadFile(docFile, path, newFileName);
        return b;
    }

    //doc上传:添加db
    private SsProDoc addProDoc(AddPro addPro, String proId) throws ParseException {
        MultipartFile file = addPro.getFile();
        // 文件原始名称
        String originalFileName = file.getOriginalFilename();
        SsProDoc ssProDoc = new SsProDoc();
        String docIdSuffix = UUID.randomUUID().toString().replaceAll("-", "");
        String proDocId = DOC_ID_PREFIX + docIdSuffix;
        String path = DOC_REAL_SAVE_PATH;
        ssProDoc.setProDocId(proDocId);
        ssProDoc.setProPath(path);
        ssProDoc.setProOldDocName(originalFileName);
        ssProDoc.setProNewDocName(newFileName(originalFileName));
        //暂时未设置 g_pro_id
        ssProDoc.setProDocGProId(proId);
        return ssProDoc;
    }

    private SsPro addPro(AddPro addPro) throws ParseException {
        String date = addPro.getDate();//2019-07-31 - 2019-09-15
        String[] split = date.split(" ", 3);
        String createTime = split[0];
        Date create = DateUtil.convertStrDate2Date(createTime);
        String endTime = split[2];
        Date end = DateUtil.convertStrDate2Date(endTime);
        SsPro ssPro = new SsPro();
        String proId = UUID.randomUUID().toString().replaceAll("-", "");
        //
        ssPro.setProId(proId);
        ssPro.setProName(addPro.getProName());
        ssPro.setProCreateTime(create);
        ssPro.setProEndTime(end);
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
