package com.sdsoon.modular.system.model;

import com.sdsoon.modular.system.po.SsProjectDoc;
import com.sdsoon.modular.system.po.SsProjectMission;
import com.sdsoon.modular.system.po.SsProjectPic;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created By Chr on 2019/8/23.
 */
public class ProjectPoModel implements Serializable {

    private static final long serialVersionUID = -1585984369319398981L;

    //manage
    private String projectId;

    private String projectName;

    private String projectDescription;

    private String projectTechnology;

    private String projectStandard;

    private String projectLeaderName;

    private String projectLeaderPhone;

    private Date projectCreateTime;

    private Date projectEndTime;

    private Integer projectStatus;

    private Integer projectLevel;

    private String projectDocInfo;
    //mission
    List<SsProjectMission> projectMissions;
    //pic
    List<SsProjectPic> projectPics;
    //doc
    List<SsProjectDoc> projectDocs;

    public ProjectPoModel() {
    }

    public ProjectPoModel(String projectId, String projectName, String projectDescription, String projectTechnology, String projectStandard, String projectLeaderName, String projectLeaderPhone, Date projectCreateTime, Date projectEndTime, Integer projectStatus, Integer projectLevel, String projectDocInfo, List<SsProjectMission> projectMissions, List<SsProjectPic> projectPics, List<SsProjectDoc> projectDocs) {
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
        this.projectMissions = projectMissions;
        this.projectPics = projectPics;
        this.projectDocs = projectDocs;
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

    public Date getProjectCreateTime() {
        return projectCreateTime;
    }

    public void setProjectCreateTime(Date projectCreateTime) {
        this.projectCreateTime = projectCreateTime;
    }

    public Date getProjectEndTime() {
        return projectEndTime;
    }

    public void setProjectEndTime(Date projectEndTime) {
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

    public List<SsProjectMission> getProjectMissions() {
        return projectMissions;
    }

    public void setProjectMissions(List<SsProjectMission> projectMissions) {
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
