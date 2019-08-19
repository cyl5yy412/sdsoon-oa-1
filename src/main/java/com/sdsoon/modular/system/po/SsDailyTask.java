package com.sdsoon.modular.system.po;

import java.io.Serializable;
import java.util.Date;

public class SsDailyTask implements Serializable {
    private String dailyTaskId;

    private Integer dailyStatus;

    private Integer dailyCategory;

    private Date dailyCreateTime;

    private String dailyDescriptioin;

    private static final long serialVersionUID = 1L;

    public String getDailyTaskId() {
        return dailyTaskId;
    }

    public void setDailyTaskId(String dailyTaskId) {
        this.dailyTaskId = dailyTaskId == null ? null : dailyTaskId.trim();
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

    public Date getDailyCreateTime() {
        return dailyCreateTime;
    }

    public void setDailyCreateTime(Date dailyCreateTime) {
        this.dailyCreateTime = dailyCreateTime;
    }

    public String getDailyDescriptioin() {
        return dailyDescriptioin;
    }

    public void setDailyDescriptioin(String dailyDescriptioin) {
        this.dailyDescriptioin = dailyDescriptioin == null ? null : dailyDescriptioin.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dailyTaskId=").append(dailyTaskId);
        sb.append(", dailyStatus=").append(dailyStatus);
        sb.append(", dailyCategory=").append(dailyCategory);
        sb.append(", dailyCreateTime=").append(dailyCreateTime);
        sb.append(", dailyDescriptioin=").append(dailyDescriptioin);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}