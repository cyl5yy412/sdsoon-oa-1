package com.sdsoon.modular.system.po;

import java.io.Serializable;
import java.util.Date;

public class SsProjectProd implements Serializable {
    private String projectProdId;

    private String projectProdMissionName;

    private String projectProdName;

    private Date projectProdDate;

    private String projectProdLeaderName;

    private String projectProdLeaderPhone;

    private String projectGProjectId;

    private String projectProdProple;

    private Integer projectProdStatus;

    private static final long serialVersionUID = 1L;

    public String getProjectProdId() {
        return projectProdId;
    }

    public void setProjectProdId(String projectProdId) {
        this.projectProdId = projectProdId == null ? null : projectProdId.trim();
    }

    public String getProjectProdMissionName() {
        return projectProdMissionName;
    }

    public void setProjectProdMissionName(String projectProdMissionName) {
        this.projectProdMissionName = projectProdMissionName == null ? null : projectProdMissionName.trim();
    }

    public String getProjectProdName() {
        return projectProdName;
    }

    public void setProjectProdName(String projectProdName) {
        this.projectProdName = projectProdName == null ? null : projectProdName.trim();
    }

    public Date getProjectProdDate() {
        return projectProdDate;
    }

    public void setProjectProdDate(Date projectProdDate) {
        this.projectProdDate = projectProdDate;
    }

    public String getProjectProdLeaderName() {
        return projectProdLeaderName;
    }

    public void setProjectProdLeaderName(String projectProdLeaderName) {
        this.projectProdLeaderName = projectProdLeaderName == null ? null : projectProdLeaderName.trim();
    }

    public String getProjectProdLeaderPhone() {
        return projectProdLeaderPhone;
    }

    public void setProjectProdLeaderPhone(String projectProdLeaderPhone) {
        this.projectProdLeaderPhone = projectProdLeaderPhone == null ? null : projectProdLeaderPhone.trim();
    }

    public String getProjectGProjectId() {
        return projectGProjectId;
    }

    public void setProjectGProjectId(String projectGProjectId) {
        this.projectGProjectId = projectGProjectId == null ? null : projectGProjectId.trim();
    }

    public String getProjectProdProple() {
        return projectProdProple;
    }

    public void setProjectProdProple(String projectProdProple) {
        this.projectProdProple = projectProdProple == null ? null : projectProdProple.trim();
    }

    public Integer getProjectProdStatus() {
        return projectProdStatus;
    }

    public void setProjectProdStatus(Integer projectProdStatus) {
        this.projectProdStatus = projectProdStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projectProdId=").append(projectProdId);
        sb.append(", projectProdMissionName=").append(projectProdMissionName);
        sb.append(", projectProdName=").append(projectProdName);
        sb.append(", projectProdDate=").append(projectProdDate);
        sb.append(", projectProdLeaderName=").append(projectProdLeaderName);
        sb.append(", projectProdLeaderPhone=").append(projectProdLeaderPhone);
        sb.append(", projectGProjectId=").append(projectGProjectId);
        sb.append(", projectProdProple=").append(projectProdProple);
        sb.append(", projectProdStatus=").append(projectProdStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}