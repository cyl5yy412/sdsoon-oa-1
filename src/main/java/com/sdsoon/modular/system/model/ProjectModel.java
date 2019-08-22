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
    //mission
    List<ProjectMissionModel> projectMissions;
    //doc
    List<MultipartFile> docFiles;
    //pic
    List<MultipartFile> picFiles;


    public ProjectModel() {
    }

    public ProjectModel(String projectId, String projectName, String projectDescription, String projectTechnology, String projectStandard, String projectLeaderName, String projectLeaderPhone, List<ProjectMissionModel> projectMissions, List<MultipartFile> docFiles, List<MultipartFile> picFiles) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectTechnology = projectTechnology;
        this.projectStandard = projectStandard;
        this.projectLeaderName = projectLeaderName;
        this.projectLeaderPhone = projectLeaderPhone;
        this.projectMissions = projectMissions;
        this.docFiles = docFiles;
        this.picFiles = picFiles;
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

    public List<ProjectMissionModel> getProjectMissions() {
        return projectMissions;
    }

    public void setProjectMissions(List<ProjectMissionModel> projectMissions) {
        this.projectMissions = projectMissions;
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
