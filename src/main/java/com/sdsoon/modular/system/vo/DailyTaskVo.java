package com.sdsoon.modular.system.vo;

import java.io.Serializable;

/**
 * Created By Chr on 2019/8/13.
 */
public class DailyTaskVo implements Serializable {
    private static final long serialVersionUID = -6953995339370904806L;

    private Integer dailyStatus;

    private Integer dailyCategory;

    private String dailyCreateTime;

    private String dailyDescriptioin;

    public DailyTaskVo() {
    }

    public DailyTaskVo(Integer dailyStatus, Integer dailyCategory, String dailyCreateTime, String dailyDescriptioin) {
        this.dailyStatus = dailyStatus;
        this.dailyCategory = dailyCategory;
        this.dailyCreateTime = dailyCreateTime;
        this.dailyDescriptioin = dailyDescriptioin;
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
