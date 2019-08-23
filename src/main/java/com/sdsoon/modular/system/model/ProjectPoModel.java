package com.sdsoon.modular.system.model;

import com.sdsoon.modular.system.po.SsProjectDoc;
import com.sdsoon.modular.system.po.SsProjectMission;
import com.sdsoon.modular.system.po.SsProjectPic;

import java.io.Serializable;
import java.util.List;

/**
 * Created By Chr on 2019/8/23.
 */
public class ProjectPoModel implements Serializable {

    private static final long serialVersionUID = -1585984369319398981L;

    //manage
    private String projectId;

    private String projectName;

    private String projectDescription;

    private String projectTechnology;

    private String projectStandard;

    private String projectLeaderName;

    private String projectLeaderPhone;
    //mission
    List<SsProjectMission> projectMissions;
    //pic
    List<SsProjectPic> projectPics;
    //doc
    List<SsProjectDoc> projectDocs;

    public ProjectPoModel() {
    }

    public ProjectPoModel(String projectId, String projectName, String projectDescription, String projectTechnology, String projectStandard, String projectLeaderName, String projectLeaderPhone, List<SsProjectMission> projectMissions, List<SsProjectPic> projectPics, List<SsProjectDoc> projectDocs) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectTechnology = projectTechnology;
        this.projectStandard = projectStandard;
        this.projectLeaderName = projectLeaderName;
        this.projectLeaderPhone = projectLeaderPhone;
        this.projectMissions = projectMissions;
        this.projectPics = projectPics;
        this.projectDocs = projectDocs;
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

    public List<SsProjectMission> getProjectMissions() {
        return projectMissions;
    }

    public void setProjectMissions(List<SsProjectMission> projectMissions) {
        this.projectMissions = projectMissions;
    }

    public List<SsProjectPic> getProjectPics() {
        return projectPics;
    }

    public void setProjectPics(List<SsProjectPic> projectPics) {
        this.projectPics = projectPics;
    }

    public List<SsProjectDoc> getProjectDocs() {
        return projectDocs;
    }

    public void setProjectDocs(List<SsProjectDoc> projectDocs) {
        this.projectDocs = projectDocs;
    }
}
