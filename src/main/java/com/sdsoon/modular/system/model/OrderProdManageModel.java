package com.sdsoon.modular.system.model;

import com.sdsoon.modular.system.vo.h.OrderVo;

import java.io.Serializable;

/**
 * Created By Chr on 2019/9/26.
 */
public class OrderProdManageModel extends OrderVo implements Serializable {
    private static final long serialVersionUID = -580301533469368466L;

    //project
    private String projectId;

    private String projectName;
    //prod
    private String projectProdId;
    private String projectGProdId;
    private String projectProdName;
    //



    public OrderProdManageModel() {
    }

    public OrderProdManageModel(String projectId, String projectName, String projectProdId, String projectGProdId, String projectProdName) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectProdId = projectProdId;
        this.projectGProdId = projectGProdId;
        this.projectProdName = projectProdName;
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

    @Override
    public String getProjectGProdId() {
        return projectGProdId;
    }

    @Override
    public void setProjectGProdId(String projectGProdId) {
        this.projectGProdId = projectGProdId;
    }

    public String getProjectProdName() {
        return projectProdName;
    }

    public void setProjectProdName(String projectProdName) {
        this.projectProdName = projectProdName;
    }
}
