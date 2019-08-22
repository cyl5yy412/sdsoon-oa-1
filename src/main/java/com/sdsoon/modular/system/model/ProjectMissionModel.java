package com.sdsoon.modular.system.model;

import java.io.Serializable;

/**
 * Created By Chr on 2019/8/22.
 */
public class ProjectMissionModel implements Serializable {
    private static final long serialVersionUID = -4909398512473656416L;
    private String projectMissionId;

    private String projectMissionCreateTime;

    private String projectMissionEndTime;

    private String projectMissionDescription;

    private String projectGProjectId;

    public ProjectMissionModel() {
    }

    public ProjectMissionModel(String projectMissionId, String projectMissionCreateTime, String projectMissionEndTime, String projectMissionDescription, String projectGProjectId) {
        this.projectMissionId = projectMissionId;
        this.projectMissionCreateTime = projectMissionCreateTime;
        this.projectMissionEndTime = projectMissionEndTime;
        this.projectMissionDescription = projectMissionDescription;
        this.projectGProjectId = projectGProjectId;
    }

    public String getProjectMissionId() {
        return projectMissionId;
    }

    public void setProjectMissionId(String projectMissionId) {
        this.projectMissionId = projectMissionId;
    }

    public String getProjectMissionCreateTime() {
        return projectMissionCreateTime;
    }

    public void setProjectMissionCreateTime(String projectMissionCreateTime) {
        this.projectMissionCreateTime = projectMissionCreateTime;
    }

    public String getProjectMissionEndTime() {
        return projectMissionEndTime;
    }

    public void setProjectMissionEndTime(String projectMissionEndTime) {
        this.projectMissionEndTime = projectMissionEndTime;
    }

    public String getProjectMissionDescription() {
        return projectMissionDescription;
    }

    public void setProjectMissionDescription(String projectMissionDescription) {
        this.projectMissionDescription = projectMissionDescription;
    }

    public String getProjectGProjectId() {
        return projectGProjectId;
    }

    public void setProjectGProjectId(String projectGProjectId) {
        this.projectGProjectId = projectGProjectId;
    }
}
