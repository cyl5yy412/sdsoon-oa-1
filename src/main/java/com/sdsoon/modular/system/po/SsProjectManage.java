package com.sdsoon.modular.system.po;

import java.io.Serializable;
import java.util.Date;

public class SsProjectManage implements Serializable {
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

    private String projectPeopleName;

    private static final long serialVersionUID = 1L;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription == null ? null : projectDescription.trim();
    }

    public String getProjectTechnology() {
        return projectTechnology;
    }

    public void setProjectTechnology(String projectTechnology) {
        this.projectTechnology = projectTechnology == null ? null : projectTechnology.trim();
    }

    public String getProjectStandard() {
        return projectStandard;
    }

    public void setProjectStandard(String projectStandard) {
        this.projectStandard = projectStandard == null ? null : projectStandard.trim();
    }

    public String getProjectLeaderName() {
        return projectLeaderName;
    }

    public void setProjectLeaderName(String projectLeaderName) {
        this.projectLeaderName = projectLeaderName == null ? null : projectLeaderName.trim();
    }

    public String getProjectLeaderPhone() {
        return projectLeaderPhone;
    }

    public void setProjectLeaderPhone(String projectLeaderPhone) {
        this.projectLeaderPhone = projectLeaderPhone == null ? null : projectLeaderPhone.trim();
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
        this.projectDocInfo = projectDocInfo == null ? null : projectDocInfo.trim();
    }

    public String getProjectPeopleName() {
        return projectPeopleName;
    }

    public void setProjectPeopleName(String projectPeopleName) {
        this.projectPeopleName = projectPeopleName == null ? null : projectPeopleName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projectId=").append(projectId);
        sb.append(", projectName=").append(projectName);
        sb.append(", projectDescription=").append(projectDescription);
        sb.append(", projectTechnology=").append(projectTechnology);
        sb.append(", projectStandard=").append(projectStandard);
        sb.append(", projectLeaderName=").append(projectLeaderName);
        sb.append(", projectLeaderPhone=").append(projectLeaderPhone);
        sb.append(", projectCreateTime=").append(projectCreateTime);
        sb.append(", projectEndTime=").append(projectEndTime);
        sb.append(", projectStatus=").append(projectStatus);
        sb.append(", projectLevel=").append(projectLevel);
        sb.append(", projectDocInfo=").append(projectDocInfo);
        sb.append(", projectPeopleName=").append(projectPeopleName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}