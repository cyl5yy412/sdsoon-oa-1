package com.sdsoon.modular.system.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By Chr on 2019/9/26.
 */
public class OrderProdManage implements Serializable{
    private static final long serialVersionUID = 879454136457871750L;
    //manage
    private String projectId;

    private String projectName;

    //order
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

    //prod

    private String projectProdId;

    private String projectProdMissionName;

    private String projectProdName;

    private Date projectProdDate;

    private String projectProdLeaderName;

    private String projectProdLeaderPhone;

    private String projectGProjectId;

    private String projectProdProple;

    private Integer projectProdStatus;


    public OrderProdManage() {
    }

    public OrderProdManage(String projectId, String projectName, String projectOrderId, String projectOrderProducer, String projectGProdId, String projectOrderPart, String projectOrderLeaderName, String projectOrderLeaderPhone, Integer projectOrderStatus, Date projectOrderDate, String projectOrderName, String projectOrderDescription, String projectProdId, String projectProdMissionName, String projectProdName, Date projectProdDate, String projectProdLeaderName, String projectProdLeaderPhone, String projectGProjectId, String projectProdProple, Integer projectProdStatus) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectOrderId = projectOrderId;
        this.projectOrderProducer = projectOrderProducer;
        this.projectGProdId = projectGProdId;
        this.projectOrderPart = projectOrderPart;
        this.projectOrderLeaderName = projectOrderLeaderName;
        this.projectOrderLeaderPhone = projectOrderLeaderPhone;
        this.projectOrderStatus = projectOrderStatus;
        this.projectOrderDate = projectOrderDate;
        this.projectOrderName = projectOrderName;
        this.projectOrderDescription = projectOrderDescription;
        this.projectProdId = projectProdId;
        this.projectProdMissionName = projectProdMissionName;
        this.projectProdName = projectProdName;
        this.projectProdDate = projectProdDate;
        this.projectProdLeaderName = projectProdLeaderName;
        this.projectProdLeaderPhone = projectProdLeaderPhone;
        this.projectGProjectId = projectGProjectId;
        this.projectProdProple = projectProdProple;
        this.projectProdStatus = projectProdStatus;
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

    public String getProjectOrderId() {
        return projectOrderId;
    }

    public void setProjectOrderId(String projectOrderId) {
        this.projectOrderId = projectOrderId;
    }

    public String getProjectOrderProducer() {
        return projectOrderProducer;
    }

    public void setProjectOrderProducer(String projectOrderProducer) {
        this.projectOrderProducer = projectOrderProducer;
    }

    public String getProjectGProdId() {
        return projectGProdId;
    }

    public void setProjectGProdId(String projectGProdId) {
        this.projectGProdId = projectGProdId;
    }

    public String getProjectOrderPart() {
        return projectOrderPart;
    }

    public void setProjectOrderPart(String projectOrderPart) {
        this.projectOrderPart = projectOrderPart;
    }

    public String getProjectOrderLeaderName() {
        return projectOrderLeaderName;
    }

    public void setProjectOrderLeaderName(String projectOrderLeaderName) {
        this.projectOrderLeaderName = projectOrderLeaderName;
    }

    public String getProjectOrderLeaderPhone() {
        return projectOrderLeaderPhone;
    }

    public void setProjectOrderLeaderPhone(String projectOrderLeaderPhone) {
        this.projectOrderLeaderPhone = projectOrderLeaderPhone;
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
        this.projectOrderName = projectOrderName;
    }

    public String getProjectOrderDescription() {
        return projectOrderDescription;
    }

    public void setProjectOrderDescription(String projectOrderDescription) {
        this.projectOrderDescription = projectOrderDescription;
    }

    public String getProjectProdId() {
        return projectProdId;
    }

    public void setProjectProdId(String projectProdId) {
        this.projectProdId = projectProdId;
    }

    public String getProjectProdMissionName() {
        return projectProdMissionName;
    }

    public void setProjectProdMissionName(String projectProdMissionName) {
        this.projectProdMissionName = projectProdMissionName;
    }

    public String getProjectProdName() {
        return projectProdName;
    }

    public void setProjectProdName(String projectProdName) {
        this.projectProdName = projectProdName;
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
        this.projectProdLeaderName = projectProdLeaderName;
    }

    public String getProjectProdLeaderPhone() {
        return projectProdLeaderPhone;
    }

    public void setProjectProdLeaderPhone(String projectProdLeaderPhone) {
        this.projectProdLeaderPhone = projectProdLeaderPhone;
    }

    public String getProjectGProjectId() {
        return projectGProjectId;
    }

    public void setProjectGProjectId(String projectGProjectId) {
        this.projectGProjectId = projectGProjectId;
    }

    public String getProjectProdProple() {
        return projectProdProple;
    }

    public void setProjectProdProple(String projectProdProple) {
        this.projectProdProple = projectProdProple;
    }

    public Integer getProjectProdStatus() {
        return projectProdStatus;
    }

    public void setProjectProdStatus(Integer projectProdStatus) {
        this.projectProdStatus = projectProdStatus;
    }

}
