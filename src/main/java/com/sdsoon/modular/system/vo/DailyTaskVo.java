package com.sdsoon.modular.system.vo;

import java.io.Serializable;

/**
 * Created By Chr on 2019/8/13.
 */
public class DailyTaskVo implements Serializable {
    private static final long serialVersionUID = -6953995339370904806L;
    private String dailyTaskId;
    private Integer dailyStatus;

    private Integer dailyCategory;
    private String dailyCategoryV;

    private String dailyCreateTime;

    private String dailyDescriptioin;

    public DailyTaskVo() {
    }

    public DailyTaskVo(String dailyTaskId, Integer dailyStatus, Integer dailyCategory, String dailyCategoryV, String dailyCreateTime, String dailyDescriptioin) {
        this.dailyTaskId = dailyTaskId;
        this.dailyStatus = dailyStatus;
        this.dailyCategory = dailyCategory;
        this.dailyCategoryV = dailyCategoryV;
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

    public Integer getDailyCategory() {
        return dailyCategory;
    }

    public void setDailyCategory(Integer dailyCategory) {
        this.dailyCategory = dailyCategory;
    }

    public String getDailyCategoryV() {
        return dailyCategoryV;
    }

    public void setDailyCategoryV(String dailyCategoryV) {
        this.dailyCategoryV = dailyCategoryV;
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
