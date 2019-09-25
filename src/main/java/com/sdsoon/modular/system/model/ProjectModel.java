package com.sdsoon.modular.system.model;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.List;

/**
 * Created By Chr on 2019/8/22.
 */
public class ProjectModel implements Serializable {

    private static final long serialVersionUID = 3328508504390757358L;

    //manage
    private String projectId;

    private String projectName;

    private String projectDescription;

    private String projectTechnology;

    private String projectStandard;

    private String projectLeaderName;

    private String projectLeaderPhone;

    private String date;

    private Integer projectStatus;

    private Integer projectLevel;

    private String projectDocInfo;
    private String projectPeopleName;
    //投产状态
    private Integer projectProdStatus;

    //doc
    List<MultipartFile> docFiles;
    //pic
    List<MultipartFile> picFiles;


    public ProjectModel() {
    }

    public ProjectModel(String projectId, String projectName, String projectDescription, String projectTechnology, String projectStandard, String projectLeaderName, String projectLeaderPhone, String date, Integer projectStatus, Integer projectLevel, String projectDocInfo, String projectPeopleName, Integer projectProdStatus, List<MultipartFile> docFiles, List<MultipartFile> picFiles) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectTechnology = projectTechnology;
        this.projectStandard = projectStandard;
        this.projectLeaderName = projectLeaderName;
        this.projectLeaderPhone = projectLeaderPhone;
        this.date = date;
        this.projectStatus = projectStatus;
        this.projectLevel = projectLevel;
        this.projectDocInfo = projectDocInfo;
        this.projectPeopleName = projectPeopleName;
        this.projectProdStatus = projectProdStatus;
        this.docFiles = docFiles;
        this.picFiles = picFiles;
    }

    public Integer getProjectProdStatus() {
        return projectProdStatus;
    }

    public void setProjectProdStatus(Integer projectProdStatus) {
        this.projectProdStatus = projectProdStatus;
    }

    public String getProjectPeopleName() {
        return projectPeopleName;
    }

    public void setProjectPeopleName(String projectPeopleName) {
        this.projectPeopleName = projectPeopleName;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public List<MultipartFile> getDocFiles() {
        return docFiles;
    }

    public void setDocFiles(List<MultipartFile> docFiles) {
        this.docFiles = docFiles;
    }

    public List<MultipartFile> getPicFiles() {
        return picFiles;
    }

    public void setPicFiles(List<MultipartFile> picFiles) {
        this.picFiles = picFiles;
    }
}
