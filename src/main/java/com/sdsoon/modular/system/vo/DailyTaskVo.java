package com.sdsoon.modular.system.vo;

import java.io.Serializable;

/**
 * Created By Chr on 2019/8/13.
 */
public class DailyTaskVo implements Serializable {
    private static final long serialVersionUID = -6953995339370904806L;
    private String dailyTaskId;
    private Integer dailyStatus;

    private String dailyCategory;

    private String dailyCreateTime;

    private String dailyDescriptioin;

    public DailyTaskVo() {
    }

    public DailyTaskVo(String dailyTaskId, Integer dailyStatus, String dailyCategory, String dailyCreateTime, String dailyDescriptioin) {
        this.dailyTaskId = dailyTaskId;
        this.dailyStatus = dailyStatus;
        this.dailyCategory = dailyCategory;
        this.dailyCreateTime = dailyCreateTime;
        this.dailyDescriptioin = dailyDescriptioin;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDailyTaskId() {
        return dailyTaskId;
    }

    public void setDailyTaskId(String dailyTaskId) {
        this.dailyTaskId = dailyTaskId;
    }

    public Integer getDailyStatus() {
        return dailyStatus;
    }

    public void setDailyStatus(Integer dailyStatus) {
        this.dailyStatus = dailyStatus;
    }

    public String getDailyCategory() {
        return dailyCategory;
    }

    public void setDailyCategory(String dailyCategory) {
        this.dailyCategory = dailyCategory;
    }

    public String getDailyCreateTime() {
        return dailyCreateTime;
    }

    public void setDailyCreateTime(String dailyCreateTime) {
        this.dailyCreateTime = dailyCreateTime;
    }

    public String getDailyDescriptioin() {
        return dailyDescriptioin;
    }

    public void setDailyDescriptioin(String dailyDescriptioin) {
        this.dailyDescriptioin = dailyDescriptioin;
    }
}
