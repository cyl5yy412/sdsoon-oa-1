package com.sdsoon.modular.system.model;

import com.sdsoon.modular.system.po.SsProjectOrder;
import com.sdsoon.modular.system.po.SsProjectProd;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 这里选(1)
 * (1)一个项目对应多个投产任务,一个项目对应多个订单
 * (2)一个项目对应多个投产任务,一个投产任务对应多个订单
 * <p>
 * Created By Chr on 2019/9/26.
 */
public class ProjectOrderModel implements Serializable {
    private static final long serialVersionUID = -2479912426968363416L;

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
    private String projectPeopleName;
    //投产状态
    private Integer projectProdStatus;

    //多个投产任务
    List<SsProjectProd> prods;
    //多个订单
    List<SsProjectOrder> orders;

    public ProjectOrderModel() {
    }

    public ProjectOrderModel(String projectId, String projectName, String projectDescription, String projectTechnology, String projectStandard, String projectLeaderName, String projectLeaderPhone, Date projectCreateTime, Date projectEndTime, Integer projectStatus, Integer projectLevel, String projectDocInfo, String projectPeopleName, Integer projectProdStatus, List<SsProjectProd> prods, List<SsProjectOrder> orders) {
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
        this.projectPeopleName = projectPeopleName;
        this.projectProdStatus = projectProdStatus;
        this.prods = prods;
        this.orders = orders;
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

    public String getProjectPeopleName() {
        return projectPeopleName;
    }

    public void setProjectPeopleName(String projectPeopleName) {
        this.projectPeopleName = projectPeopleName;
    }

    public Integer getProjectProdStatus() {
        return projectProdStatus;
    }

    public void setProjectProdStatus(Integer projectProdStatus) {
        this.projectProdStatus = projectProdStatus;
    }

    public List<SsProjectProd> getProds() {
        return prods;
    }

    public void setProds(List<SsProjectProd> prods) {
        this.prods = prods;
    }

    public List<SsProjectOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<SsProjectOrder> orders) {
        this.orders = orders;
    }
}
