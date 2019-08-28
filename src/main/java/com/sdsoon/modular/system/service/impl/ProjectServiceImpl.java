package com.sdsoon.modular.system.service.impl;

import com.sdsoon.core.response.ex.EnumError;
import com.sdsoon.core.response.ex.ResponseException;
import com.sdsoon.core.util.FileUtil;
import com.sdsoon.core.util.IDUtil;
import com.sdsoon.modular.system.mapper.SsProjectDocMapper;
import com.sdsoon.modular.system.mapper.SsProjectManageMapper;
import com.sdsoon.modular.system.mapper.SsProjectMissionMapper;
import com.sdsoon.modular.system.mapper.SsProjectPicMapper;
import com.sdsoon.modular.system.model.ProjectMissionModel;
import com.sdsoon.modular.system.model.ProjectModel;
import com.sdsoon.modular.system.model.ProjectPoModel;
import com.sdsoon.modular.system.po.SsProjectDoc;
import com.sdsoon.modular.system.po.SsProjectManage;
import com.sdsoon.modular.system.po.SsProjectMission;
import com.sdsoon.modular.system.po.SsProjectPic;
import com.sdsoon.modular.system.service.ProjectService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * Created By Chr on 2019/8/22.
 */
@Service
public class ProjectServiceImpl implements ProjectService {
    /*@Override
    public boolean setupProjectDemo(ProjectModel projectModel) throws ResponseException {
        //添加project-manage
        if (StringUtils.isAnyBlank(
                projectModel.getProjectName(),
                projectModel.getProjectTechnology(),
                projectModel.getProjectStandard(),
                projectModel.getProjectDescription(),
                projectModel.getProjectLeaderName(),
                projectModel.getProjectLeaderPhone())) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        SsProjectManage ssProjectManage = convertProjectModelFromSsProjectManage(projectModel);
        int i = ssProjectManageMapper.insertSelective(ssProjectManage);
        if (i == 1) {
            *//**
             *doc,pic,mission
             *//*
            List<MultipartFile> docFiles = projectModel.getDocFiles();
            for (MultipartFile docFile : docFiles) {
                //添加doc->db
                SsProjectDoc ssProjectDoc = addDoc(ssProjectManage.getProjectId(), docFile);
                if (ssProjectDoc == null) {
                    throw new ResponseException(EnumError.DOC_UPLOAD_FAIL);
                }
                //上传doc
                boolean b = upLoadDoc(docFile, ssProjectDoc.getProjectDocNewName());
                if (!b) {
                    throw new ResponseException(EnumError.DOC_UPLOAD_FAIL);
                }
            }
            List<MultipartFile> picFiles = projectModel.getPicFiles();
            for (MultipartFile picFile : picFiles) {
                //添加pic:db
                SsProjectPic ssProjectPic = addPic(ssProjectManage.getProjectId(), picFile);
                if (ssProjectPic == null) {
                    throw new ResponseException(EnumError.PIC_UPLOAD_FAIL);
                }
                //上传pic
                boolean b = upLoadPic(picFile, ssProjectPic.getProjectPicNewName());
                if (!b) {
                    throw new ResponseException(EnumError.PIC_UPLOAD_FAIL);
                }
            }
            //添加mission
            List<ProjectMissionModel> projectMissionModels = projectModel.getProjectMissions();
            if (projectMissionModels.size() == 0 || projectMissionModels == null) {
                throw new ResponseException(EnumError.MISSION_FAIL);
            }
            List<SsProjectMission> projectMissions = projectMissionModels.stream().map(projectMissionModel -> {
                SsProjectMission ssProjectMission = convertMissionModelFromBean(projectMissionModel);
                return ssProjectMission;
            }).collect(Collectors.toList());
            for (SsProjectMission ssProjectMission : projectMissions) {
                String missionId = UUID.randomUUID().toString().replaceAll("-", "");
                ssProjectMission.setProjectMissionId(missionId);
                ssProjectMission.setProjectGProjectId(ssProjectManage.getProjectId());
//                int i1 = ssProjectMissionMapper.insertSelective(ssProjectMission);
//                if (i1!=1) {
//                    throw new ResponseException(EnumError.MISSION_FAIL);
//                }
            }
            int i2 = ssProjectMissionMapper.insertMissions(projectMissions);
            if (i2 < projectMissions.size()) {
                throw new ResponseException(EnumError.MISSION_FAIL);
            }
            return true;
        }
        return false;
    }*/

    @Override
    public ProjectPoModel selectProjectById(String projectId) throws ResponseException {
        if (StringUtils.isBlank(projectId)) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        ProjectPoModel projectPoModel = ssProjectManageMapper.selectProjectById(projectId);
        if (projectPoModel == null) {
            return null;
        }
        return projectPoModel;
    }


    @Resource
    private SsProjectManageMapper ssProjectManageMapper;
    @Resource
    private SsProjectDocMapper ssProjectDocMapper;
    @Resource
    private SsProjectPicMapper ssProjectPicMapper;
    @Resource
    private SsProjectMissionMapper ssProjectMissionMapper;

    // 允许上传的格式
    private static final String[] IMAGE_TYPE = new String[]{".bmp", ".jpg", ".jpeg", ".gif", ".png"};
    @Value("${IMG_REAL_SAVE_PATH}")
    private String IMG_REAL_SAVE_PATH;
    @Value("${DOC_REAL_SAVE_PATH}")
    private String DOC_REAL_SAVE_PATH;
    public static final String PIC_ID_PREFIX = "pic_";
    public static final String DOC_ID_PREFIX = "doc_";

    @Transactional
    @Override
    public boolean setupProject(ProjectModel projectModel) throws ResponseException {
        //添加project-manage
        if (StringUtils.isAnyBlank(
                projectModel.getProjectName(),
                projectModel.getProjectTechnology(),
                projectModel.getProjectStandard(),
                projectModel.getProjectDescription(),
                projectModel.getProjectLeaderName(),
                projectModel.getProjectLeaderPhone())) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        SsProjectManage ssProjectManage = convertProjectModelFromSsProjectManage(projectModel);
        int i = ssProjectManageMapper.insertSelective(ssProjectManage);
        if (i == 1) {
            /**
             *doc,pic,mission
             */
            List<MultipartFile> docFiles = projectModel.getDocFiles();
            for (MultipartFile docFile : docFiles) {
                //添加doc->db
                SsProjectDoc ssProjectDoc = addDoc(ssProjectManage.getProjectId(), docFile);
                if (ssProjectDoc == null) {
                    throw new ResponseException(EnumError.DOC_UPLOAD_FAIL);
                }
                //上传doc
                boolean b = upLoadDoc(docFile, ssProjectDoc.getProjectDocNewName());
                if (!b) {
                    throw new ResponseException(EnumError.DOC_UPLOAD_FAIL);
                }
            }
            List<MultipartFile> picFiles = projectModel.getPicFiles();
            for (MultipartFile picFile : picFiles) {
                //添加pic:db
                SsProjectPic ssProjectPic = addPic(ssProjectManage.getProjectId(), picFile);
                if (ssProjectPic == null) {
                    throw new ResponseException(EnumError.PIC_UPLOAD_FAIL);
                }
                //上传pic
                boolean b = upLoadPic(picFile, ssProjectPic.getProjectPicNewName());
                if (!b) {
                    throw new ResponseException(EnumError.PIC_UPLOAD_FAIL);
                }
            }
            //添加mission
            List<ProjectMissionModel> projectMissionModels = projectModel.getProjectMissions();
            if (projectMissionModels.size() == 0 || projectMissionModels == null) {
                throw new ResponseException(EnumError.MISSION_FAIL);
            }
            List<SsProjectMission> projectMissions = projectMissionModels.stream().map(projectMissionModel -> {
                SsProjectMission ssProjectMission = convertMissionModelFromBean(projectMissionModel);
                return ssProjectMission;
            }).collect(Collectors.toList());
            for (SsProjectMission ssProjectMission : projectMissions) {
                String missionId = UUID.randomUUID().toString().replaceAll("-", "");
                ssProjectMission.setProjectMissionId(missionId);
                ssProjectMission.setProjectGProjectId(ssProjectManage.getProjectId());
//                int i1 = ssProjectMissionMapper.insertSelective(ssProjectMission);
//                if (i1!=1) {
//                    throw new ResponseException(EnumError.MISSION_FAIL);
//                }
            }
            int i2 = ssProjectMissionMapper.insertMissions(projectMissions);
            if (i2 < projectMissions.size()) {
                throw new ResponseException(EnumError.MISSION_FAIL);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean download(String downloadId, HttpServletResponse response) throws ResponseException, UnsupportedEncodingException {
        if (StringUtils.isBlank(downloadId)) {
            throw new ResponseException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
        String path = null;
        String filename = null;
        if (downloadId.contains(PIC_ID_PREFIX)) {
            path = IMG_REAL_SAVE_PATH;
            SsProjectPic ssProjectPic = ssProjectPicMapper.selectByPrimaryKey(downloadId);
            if (ssProjectPic == null) {
                return false;
            }
            filename = ssProjectPic.getProjectPicNewName();
        } else if (downloadId.contains(DOC_ID_PREFIX)) {
            path = DOC_REAL_SAVE_PATH;
            SsProjectDoc ssProjectDoc = ssProjectDocMapper.selectByPrimaryKey(downloadId);
            if (ssProjectDoc == null) {
                return false;
            }
            filename = ssProjectDoc.getProjectDocNewName();
        } else {
            return false;
        }
        boolean b = FileUtil.downloadFile(path, filename, response);
        if (b) {
            return true;
        }
        return false;
    }

    //
    private SsProjectMission convertMissionModelFromBean(ProjectMissionModel projectModel) {
        if (projectModel == null) {
            return null;
        }
        SsProjectMission ssProjectMission = new SsProjectMission();
        BeanUtils.copyProperties(projectModel, ssProjectMission);
        Long createLong = Long.valueOf(projectModel.getProjectMissionCreateTime());
        Long endTime = Long.valueOf(projectModel.getProjectMissionEndTime());
        ssProjectMission.setProjectMissionCreateTime(new Date(createLong));
        ssProjectMission.setProjectMissionEndTime(new Date(endTime));
        return ssProjectMission;
    }

    //projectModel->ssBean
    private SsProjectManage convertProjectModelFromSsProjectManage(ProjectModel projectModel) {
        if (projectModel == null) {
            return null;
        }
        SsProjectManage ssProjectManage = new SsProjectManage();
        BeanUtils.copyProperties(projectModel, ssProjectManage);
        String projectId = UUID.randomUUID().toString().replaceAll("-", "");
        ssProjectManage.setProjectId(projectId);
        return ssProjectManage;
    }

    //doc上传:添加db
    private SsProjectDoc addDoc(String projectId, MultipartFile docFile) {
        // 文件原始名称
        String originalFileName = docFile.getOriginalFilename();

        SsProjectDoc ssProjectDoc = new SsProjectDoc();
        String docIdSuffix = UUID.randomUUID().toString().replaceAll("-", "");
        String docId = DOC_ID_PREFIX + docIdSuffix;
//        String docId = UUID.randomUUID().toString().replaceAll("-", "");

        ssProjectDoc.setProjectDocId(docId);
        ssProjectDoc.setProjectDocOldName(originalFileName);
        ssProjectDoc.setProjectDocNewName(newFileName(originalFileName));
        ssProjectDoc.setProjectGProjectId(projectId);
        ssProjectDoc.setProjectDocPath(DOC_REAL_SAVE_PATH);
        int i = ssProjectDocMapper.insertSelective(ssProjectDoc);
        if (i == 1) {
            return ssProjectDoc;
        }
        return null;
    }

    //pic添加db
    private SsProjectPic addPic(String projectId, MultipartFile picFile) {
        // 校验图片格式
        boolean isLegal = false;
        String originalFilename = picFile.getOriginalFilename();
        for (String type : IMAGE_TYPE) {
            if (StringUtils.endsWithIgnoreCase(originalFilename, type)) {
                isLegal = true;
                break;
            }
        }
        //格式正确 存db
        if (isLegal) {
            SsProjectPic ssProjectPic = new SsProjectPic();
            ssProjectPic.setProjectGProjectId(projectId);
            String picIdSuffix = UUID.randomUUID().toString().replaceAll("-", "");
            String picId = PIC_ID_PREFIX.concat(picIdSuffix);
//            String picId = UUID.randomUUID().toString().replaceAll("-", "");

            ssProjectPic.setProjectPicId(picId);
            ssProjectPic.setProjectPicOldName(originalFilename);
            ssProjectPic.setProjectPicNewName(newFileName(originalFilename));
            ssProjectPic.setProjectPicPath(IMG_REAL_SAVE_PATH);
            int i = ssProjectPicMapper.insertSelective(ssProjectPic);
            if (i == 1) {
                return ssProjectPic;
            }
        }
        return null;
    }


    //pic上传
    private boolean upLoadPic(MultipartFile picFile, String newFileName) {
        String path = IMG_REAL_SAVE_PATH;
        boolean b = FileUtil.upLoadFile(picFile, path, newFileName);
        return b;
    }

    //doc上传
    private boolean upLoadDoc(MultipartFile docFile, String newFileName) {
        String path = DOC_REAL_SAVE_PATH;
        boolean b = FileUtil.upLoadFile(docFile, path, newFileName);
        return b;
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
