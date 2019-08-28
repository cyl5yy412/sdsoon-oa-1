package com.sdsoon.modular.system.po;

import java.io.Serializable;
import java.util.Date;

public class SsPro implements Serializable {
    private String proId;

    private Integer proStatus;

    private Date proCreateTime;

    private Date proEndTime;

    private String proLeaderName;

    private Integer proLevel;

    private String proName;

    private static final long serialVersionUID = 1L;

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId == null ? null : proId.trim();
    }

    public Integer getProStatus() {
        return proStatus;
    }

    public void setProStatus(Integer proStatus) {
        this.proStatus = proStatus;
    }

    public Date getProCreateTime() {
        return proCreateTime;
    }

    public void setProCreateTime(Date proCreateTime) {
        this.proCreateTime = proCreateTime;
    }

    public Date getProEndTime() {
        return proEndTime;
    }

    public void setProEndTime(Date proEndTime) {
        this.proEndTime = proEndTime;
    }

    public String getProLeaderName() {
        return proLeaderName;
    }

    public void setProLeaderName(String proLeaderName) {
        this.proLeaderName = proLeaderName == null ? null : proLeaderName.trim();
    }

    public Integer getProLevel() {
        return proLevel;
    }

    public void setProLevel(Integer proLevel) {
        this.proLevel = proLevel;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proId=").append(proId);
        sb.append(", proStatus=").append(proStatus);
        sb.append(", proCreateTime=").append(proCreateTime);
        sb.append(", proEndTime=").append(proEndTime);
        sb.append(", proLeaderName=").append(proLeaderName);
        sb.append(", proLevel=").append(proLevel);
        sb.append(", proName=").append(proName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}