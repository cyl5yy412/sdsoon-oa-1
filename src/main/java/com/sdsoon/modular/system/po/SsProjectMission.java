package com.sdsoon.modular.system.po;

import java.io.Serializable;
import java.util.Date;

public class SsProjectMission implements Serializable {
    private String projectMissionId;

    private Date projectMissionCreateTime;

    private Date projectMissionEndTime;

    private String projectMissionDescription;

    private String projectGProjectId;

    private static final long serialVersionUID = 1L;

    public String getProjectMissionId() {
        return projectMissionId;
    }

    public void setProjectMissionId(String projectMissionId) {
        this.projectMissionId = projectMissionId == null ? null : projectMissionId.trim();
    }

    public Date getProjectMissionCreateTime() {
        return projectMissionCreateTime;
    }

    public void setProjectMissionCreateTime(Date projectMissionCreateTime) {
        this.projectMissionCreateTime = projectMissionCreateTime;
    }

    public Date getProjectMissionEndTime() {
        return projectMissionEndTime;
    }

    public void setProjectMissionEndTime(Date projectMissionEndTime) {
        this.projectMissionEndTime = projectMissionEndTime;
    }

    public String getProjectMissionDescription() {
        return projectMissionDescription;
    }

    public void setProjectMissionDescription(String projectMissionDescription) {
        this.projectMissionDescription = projectMissionDescription == null ? null : projectMissionDescription.trim();
    }

    public String getProjectGProjectId() {
        return projectGProjectId;
    }

    public void setProjectGProjectId(String projectGProjectId) {
        this.projectGProjectId = projectGProjectId == null ? null : projectGProjectId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projectMissionId=").append(projectMissionId);
        sb.append(", projectMissionCreateTime=").append(projectMissionCreateTime);
        sb.append(", projectMissionEndTime=").append(projectMissionEndTime);
        sb.append(", projectMissionDescription=").append(projectMissionDescription);
        sb.append(", projectGProjectId=").append(projectGProjectId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}