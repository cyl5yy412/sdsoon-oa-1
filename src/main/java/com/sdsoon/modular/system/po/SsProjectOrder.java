package com.sdsoon.modular.system.po;

import java.io.Serializable;
import java.util.Date;

public class SsProjectOrder implements Serializable {
    private String projectOrderId;

    private String projectOrderProducer;

    private String projectGProdId;

    private String projectOrderPart;

    private String projectOrderLeaderName;

    private String projectOrderLeaderPhone;

    private Integer projectOrderStatus;

    private Date projectOrderDate;

    private String projectOrderName;

    private String projectOrderDescription;

    private String projectGProjectId;

    private static final long serialVersionUID = 1L;

    public String getProjectOrderId() {
        return projectOrderId;
    }

    public void setProjectOrderId(String projectOrderId) {
        this.projectOrderId = projectOrderId == null ? null : projectOrderId.trim();
    }

    public String getProjectOrderProducer() {
        return projectOrderProducer;
    }

    public void setProjectOrderProducer(String projectOrderProducer) {
        this.projectOrderProducer = projectOrderProducer == null ? null : projectOrderProducer.trim();
    }

    public String getProjectGProdId() {
        return projectGProdId;
    }

    public void setProjectGProdId(String projectGProdId) {
        this.projectGProdId = projectGProdId == null ? null : projectGProdId.trim();
    }

    public String getProjectOrderPart() {
        return projectOrderPart;
    }

    public void setProjectOrderPart(String projectOrderPart) {
        this.projectOrderPart = projectOrderPart == null ? null : projectOrderPart.trim();
    }

    public String getProjectOrderLeaderName() {
        return projectOrderLeaderName;
    }

    public void setProjectOrderLeaderName(String projectOrderLeaderName) {
        this.projectOrderLeaderName = projectOrderLeaderName == null ? null : projectOrderLeaderName.trim();
    }

    public String getProjectOrderLeaderPhone() {
        return projectOrderLeaderPhone;
    }

    public void setProjectOrderLeaderPhone(String projectOrderLeaderPhone) {
        this.projectOrderLeaderPhone = projectOrderLeaderPhone == null ? null : projectOrderLeaderPhone.trim();
    }

    public Integer getProjectOrderStatus() {
        return projectOrderStatus;
    }

    public void setProjectOrderStatus(Integer projectOrderStatus) {
        this.projectOrderStatus = projectOrderStatus;
    }

    public Date getProjectOrderDate() {
        return projectOrderDate;
    }

    public void setProjectOrderDate(Date projectOrderDate) {
        this.projectOrderDate = projectOrderDate;
    }

    public String getProjectOrderName() {
        return projectOrderName;
    }

    public void setProjectOrderName(String projectOrderName) {
        this.projectOrderName = projectOrderName == null ? null : projectOrderName.trim();
    }

    public String getProjectOrderDescription() {
        return projectOrderDescription;
    }

    public void setProjectOrderDescription(String projectOrderDescription) {
        this.projectOrderDescription = projectOrderDescription == null ? null : projectOrderDescription.trim();
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
        sb.append(", projectOrderId=").append(projectOrderId);
        sb.append(", projectOrderProducer=").append(projectOrderProducer);
        sb.append(", projectGProdId=").append(projectGProdId);
        sb.append(", projectOrderPart=").append(projectOrderPart);
        sb.append(", projectOrderLeaderName=").append(projectOrderLeaderName);
        sb.append(", projectOrderLeaderPhone=").append(projectOrderLeaderPhone);
        sb.append(", projectOrderStatus=").append(projectOrderStatus);
        sb.append(", projectOrderDate=").append(projectOrderDate);
        sb.append(", projectOrderName=").append(projectOrderName);
        sb.append(", projectOrderDescription=").append(projectOrderDescription);
        sb.append(", projectGProjectId=").append(projectGProjectId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}