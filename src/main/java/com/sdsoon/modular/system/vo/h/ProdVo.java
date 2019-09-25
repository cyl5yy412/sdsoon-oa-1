package com.sdsoon.modular.system.vo.h;

import java.io.Serializable;

/**
 * Created By Chr on 2019/9/25.
 */
public class ProdVo implements Serializable {
    private static final long serialVersionUID = -4634457635796227481L;

    private String projectProdId;

    private String projectProdMissionName;

    private String projectProdName;

    private String projectProdDate;

    private String projectProdLeaderName;

    private String projectProdLeaderPhone;

    //id 和gid==同一属性
    private String projectGProjectId;
    private String projectId;

    private String projectProdProple;

    private Integer projectProdStatus;

    //prod doc
    private String prodDocId;

    private String prodDocOldName;

    private String prodDocNewName;

    private String prodDocPath;

    private String prodGProdId;

    public ProdVo() {
    }

    public ProdVo(String projectProdId, String projectProdMissionName, String projectProdName, String projectProdDate, String projectProdLeaderName, String projectProdLeaderPhone, String projectGProjectId, String projectId, String projectProdProple, Integer projectProdStatus, String prodDocId, String prodDocOldName, String prodDocNewName, String prodDocPath, String prodGProdId) {
        this.projectProdId = projectProdId;
        this.projectProdMissionName = projectProdMissionName;
        this.projectProdName = projectProdName;
        this.projectProdDate = projectProdDate;
        this.projectProdLeaderName = projectProdLeaderName;
        this.projectProdLeaderPhone = projectProdLeaderPhone;
        this.projectGProjectId = projectGProjectId;
        this.projectId = projectId;
        this.projectProdProple = projectProdProple;
        this.projectProdStatus = projectProdStatus;
        this.prodDocId = prodDocId;
        this.prodDocOldName = prodDocOldName;
        this.prodDocNewName = prodDocNewName;
        this.prodDocPath = prodDocPath;
        this.prodGProdId = prodGProdId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProdDocId() {
        return prodDocId;
    }

    public void setProdDocId(String prodDocId) {
        this.prodDocId = prodDocId;
    }

    public String getProdDocOldName() {
        return prodDocOldName;
    }

    public void setProdDocOldName(String prodDocOldName) {
        this.prodDocOldName = prodDocOldName;
    }

    public String getProdDocNewName() {
        return prodDocNewName;
    }

    public void setProdDocNewName(String prodDocNewName) {
        this.prodDocNewName = prodDocNewName;
    }

    public String getProdDocPath() {
        return prodDocPath;
    }

    public void setProdDocPath(String prodDocPath) {
        this.prodDocPath = prodDocPath;
    }

    public String getProdGProdId() {
        return prodGProdId;
    }

    public void setProdGProdId(String prodGProdId) {
        this.prodGProdId = prodGProdId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public String getProjectProdDate() {
        return projectProdDate;
    }

    public void setProjectProdDate(String projectProdDate) {
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
