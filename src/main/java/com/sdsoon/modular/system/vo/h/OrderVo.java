package com.sdsoon.modular.system.vo.h;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By Chr on 2019/9/26.
 */
public class OrderVo implements Serializable {
    private static final long serialVersionUID = -1356164917165579534L;
    //order
    private String projectOrderId;

    private String projectOrderProducer;

    private String projectGProdId;
    private String projectProdId;

    private String projectOrderPart;

    private String projectOrderLeaderName;

    private String projectOrderLeaderPhone;

    private Integer projectOrderStatus;
    private String projectOrderStatusS;

    private Date projectOrderDate;

    private String projectOrderName;

    private String projectOrderDescription;

    private String projectGProjectId;
    private String projectId;

    public OrderVo() {
    }

    public OrderVo(String projectOrderId, String projectOrderProducer, String projectGProdId, String projectProdId, String projectOrderPart, String projectOrderLeaderName, String projectOrderLeaderPhone, Integer projectOrderStatus, String projectOrderStatusS, Date projectOrderDate, String projectOrderName, String projectOrderDescription, String projectGProjectId, String projectId) {
        this.projectOrderId = projectOrderId;
        this.projectOrderProducer = projectOrderProducer;
        this.projectGProdId = projectGProdId;
        this.projectProdId = projectProdId;
        this.projectOrderPart = projectOrderPart;
        this.projectOrderLeaderName = projectOrderLeaderName;
        this.projectOrderLeaderPhone = projectOrderLeaderPhone;
        this.projectOrderStatus = projectOrderStatus;
        this.projectOrderStatusS = projectOrderStatusS;
        this.projectOrderDate = projectOrderDate;
        this.projectOrderName = projectOrderName;
        this.projectOrderDescription = projectOrderDescription;
        this.projectGProjectId = projectGProjectId;
        this.projectId = projectId;
    }

    public String getProjectProdId() {
        return projectProdId;
    }

    public void setProjectProdId(String projectProdId) {
        this.projectProdId = projectProdId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public String getProjectGProjectId() {
        return projectGProjectId;
    }

    public void setProjectGProjectId(String projectGProjectId) {
        this.projectGProjectId = projectGProjectId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectOrderStatusS() {
        return projectOrderStatusS;
    }

    public void setProjectOrderStatusS(String projectOrderStatusS) {
        this.projectOrderStatusS = projectOrderStatusS;
    }
}
