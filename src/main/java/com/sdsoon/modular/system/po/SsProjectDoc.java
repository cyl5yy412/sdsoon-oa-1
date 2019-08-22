package com.sdsoon.modular.system.po;

import java.io.Serializable;

public class SsProjectDoc implements Serializable {
    private String projectDocId;

    private String projectDocOldName;

    private String projectDocNewName;

    private String projectDocPath;

    private String projectGProjectId;

    private static final long serialVersionUID = 1L;

    public String getProjectDocId() {
        return projectDocId;
    }

    public void setProjectDocId(String projectDocId) {
        this.projectDocId = projectDocId == null ? null : projectDocId.trim();
    }

    public String getProjectDocOldName() {
        return projectDocOldName;
    }

    public void setProjectDocOldName(String projectDocOldName) {
        this.projectDocOldName = projectDocOldName == null ? null : projectDocOldName.trim();
    }

    public String getProjectDocNewName() {
        return projectDocNewName;
    }

    public void setProjectDocNewName(String projectDocNewName) {
        this.projectDocNewName = projectDocNewName == null ? null : projectDocNewName.trim();
    }

    public String getProjectDocPath() {
        return projectDocPath;
    }

    public void setProjectDocPath(String projectDocPath) {
        this.projectDocPath = projectDocPath == null ? null : projectDocPath.trim();
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
        sb.append(", projectDocId=").append(projectDocId);
        sb.append(", projectDocOldName=").append(projectDocOldName);
        sb.append(", projectDocNewName=").append(projectDocNewName);
        sb.append(", projectDocPath=").append(projectDocPath);
        sb.append(", projectGProjectId=").append(projectGProjectId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}