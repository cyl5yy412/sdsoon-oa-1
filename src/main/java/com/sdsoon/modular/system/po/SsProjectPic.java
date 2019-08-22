package com.sdsoon.modular.system.po;

import java.io.Serializable;

public class SsProjectPic implements Serializable {
    private String projectPicId;

    private String projectPicOldName;

    private String projectPicNewName;

    private String projectPicPath;

    private String projectGProjectId;

    private static final long serialVersionUID = 1L;

    public String getProjectPicId() {
        return projectPicId;
    }

    public void setProjectPicId(String projectPicId) {
        this.projectPicId = projectPicId == null ? null : projectPicId.trim();
    }

    public String getProjectPicOldName() {
        return projectPicOldName;
    }

    public void setProjectPicOldName(String projectPicOldName) {
        this.projectPicOldName = projectPicOldName == null ? null : projectPicOldName.trim();
    }

    public String getProjectPicNewName() {
        return projectPicNewName;
    }

    public void setProjectPicNewName(String projectPicNewName) {
        this.projectPicNewName = projectPicNewName == null ? null : projectPicNewName.trim();
    }

    public String getProjectPicPath() {
        return projectPicPath;
    }

    public void setProjectPicPath(String projectPicPath) {
        this.projectPicPath = projectPicPath == null ? null : projectPicPath.trim();
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
        sb.append(", projectPicId=").append(projectPicId);
        sb.append(", projectPicOldName=").append(projectPicOldName);
        sb.append(", projectPicNewName=").append(projectPicNewName);
        sb.append(", projectPicPath=").append(projectPicPath);
        sb.append(", projectGProjectId=").append(projectGProjectId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}