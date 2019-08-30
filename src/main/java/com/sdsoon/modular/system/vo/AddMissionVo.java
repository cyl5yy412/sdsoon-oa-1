package com.sdsoon.modular.system.vo;


import com.sdsoon.modular.system.model.ProjectMissionModel;

import java.io.Serializable;
import java.util.List;

/**
 * Created By Chr on 2019/8/30.
 */
public class AddMissionVo implements Serializable {
    private static final long serialVersionUID = -2541012809784364611L;
    List<ProjectMissionModel> missions;

    public AddMissionVo() {
    }

    public AddMissionVo(List<ProjectMissionModel> missions) {
        this.missions = missions;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<ProjectMissionModel> getMissions() {
        return missions;
    }

    public void setMissions(List<ProjectMissionModel> missions) {
        this.missions = missions;
    }
}
