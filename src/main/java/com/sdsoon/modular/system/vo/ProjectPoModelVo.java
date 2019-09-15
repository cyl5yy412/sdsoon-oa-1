package com.sdsoon.modular.system.vo;

import com.sdsoon.modular.system.model.ProjectMissionModel;
import com.sdsoon.modular.system.po.SsProjectDoc;
import com.sdsoon.modular.system.po.SsProjectPic;

import java.io.Serializable;
import java.util.List;

/**
 * Created By Chr on 2019/9/10.
 */
public class ProjectPoModelVo implements Serializable {
    private static final long serialVersionUID = 4616925808039950151L;
    //manage
    private String projectId;

    private String projectName;

    private String projectDescription;

    private String projectTechnology;

    private String projectStandard;

    private String projectLeaderName;

    private String projectLeaderPhone;

    private String projectCreateTime;

    private String projectEndTime;

    private Integer projectStatus;

    private Integer projectLevel;

    private String projectDocInfo;

    private String projectPeopleName;
    //mission
    List<ProjectMissionModel> projectMissions;
    //pic
    List<SsProjectPic> projectPics;
    //doc
    List<SsProjectDoc> projectDocs;

    public ProjectPoModelVo() {
    }


    public ProjectPoModelVo(String projectId, String projectName, String projectDescription, String projectTechnology, String projectStandard, String projectLeaderName, String projectLeaderPhone, String projectCreateTime, String projectEndTime, Integer projectStatus, Integer projectLevel, String projectDocInfo, String projectPeopleName, List<ProjectMissionModel> projectMissions, List<SsProjectPic> projectPics, List<SsProjectDoc> projectDocs) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectTechnology = projectTechnology;
        this.projectStandard = projectStandard;
        this.projectLeaderName = projectLeaderName;
        this.projectLeaderPhone = projectLeaderPhone;
        this.projectCreateTime = projectCreateTime;
        this.projectEndTime = projectEndTime;
        this.projectStatus = projectStatus;
        this.projectLevel = projectLevel;
        this.projectDocInfo = projectDocInfo;
        this.projectPeopleName = projectPeopleName;
        this.projectMissions = projectMissions;
        this.projectPics = projectPics;
        this.projectDocs = projectDocs;
    }

    public String getProjectPeopleName() {
        return projectPeopleName;
    }

    public void setProjectPeopleName(String projectPeopleName) {
        this.projectPeopleName = projectPeopleName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectTechnology() {
        return projectTechnology;
    }

    public void setProjectTechnology(String projectTechnology) {
        this.projectTechnology = projectTechnology;
    }

    public String getProjectStandard() {
        return projectStandard;
    }

    public void setProjectStandard(String projectStandard) {
        this.projectStandard = projectStandard;
    }

    public String getProjectLeaderName() {
        return projectLeaderName;
    }

    public void setProjectLeaderName(String projectLeaderName) {
        this.projectLeaderName = projectLeaderName;
    }

    public String getProjectLeaderPhone() {
        return projectLeaderPhone;
    }

    public void setProjectLeaderPhone(String projectLeaderPhone) {
        this.projectLeaderPhone = projectLeaderPhone;
    }

    public String getProjectCreateTime() {
        return projectCreateTime;
    }

    public void setProjectCreateTime(String projectCreateTime) {
        this.projectCreateTime = projectCreateTime;
    }

    public String getProjectEndTime() {
        return projectEndTime;
    }

    public void setProjectEndTime(String projectEndTime) {
        this.projectEndTime = projectEndTime;
    }

    public Integer getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
    }

    public Integer getProjectLevel() {
        return projectLevel;
    }

    public void setProjectLevel(Integer projectLevel) {
        this.projectLevel = projectLevel;
    }

    public String getProjectDocInfo() {
        return projectDocInfo;
    }

    public void setProjectDocInfo(String projectDocInfo) {
        this.projectDocInfo = projectDocInfo;
    }

    public List<ProjectMissionModel> getProjectMissions() {
        return projectMissions;
    }

    public void setProjectMissions(List<ProjectMissionModel> projectMissions) {
        this.projectMissions = projectMissions;
    }

    public List<SsProjectPic> getProjectPics() {
        return projectPics;
    }

    public void setProjectPics(List<SsProjectPic> projectPics) {
        this.projectPics = projectPics;
    }

    public List<SsProjectDoc> getProjectDocs() {
        return projectDocs;
    }

    public void setProjectDocs(List<SsProjectDoc> projectDocs) {
        this.projectDocs = projectDocs;
    }
}
