package com.sdsoon.modular.system.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By Chr on 2019/8/28.
 */
public class SsProVo implements Serializable {
    private static final long serialVersionUID = 6927498849314193204L;

    private String proId;

    private Integer proStatus;

    private Date proCreateTime;

    private Date proEndTime;

    private String proLeaderName;

    private Integer proLevel;

    private String proName;

    private String proDocId;

    private String proNewDocName;

    private String proOldDocName;

    private String proPath;

    private String proDocGProId;

    public SsProVo() {
    }

    public SsProVo(String proId, Integer proStatus, Date proCreateTime, Date proEndTime, String proLeaderName, Integer proLevel, String proName, String proDocId, String proNewDocName, String proOldDocName, String proPath, String proDocGProId) {
        this.proId = proId;
        this.proStatus = proStatus;
        this.proCreateTime = proCreateTime;
        this.proEndTime = proEndTime;
        this.proLeaderName = proLeaderName;
        this.proLevel = proLevel;
        this.proName = proName;
        this.proDocId = proDocId;
        this.proNewDocName = proNewDocName;
        this.proOldDocName = proOldDocName;
        this.proPath = proPath;
        this.proDocGProId = proDocGProId;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
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
        this.proLeaderName = proLeaderName;
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
        this.proName = proName;
    }

    public String getProDocId() {
        return proDocId;
    }

    public void setProDocId(String proDocId) {
        this.proDocId = proDocId;
    }

    public String getProNewDocName() {
        return proNewDocName;
    }

    public void setProNewDocName(String proNewDocName) {
        this.proNewDocName = proNewDocName;
    }

    public String getProOldDocName() {
        return proOldDocName;
    }

    public void setProOldDocName(String proOldDocName) {
        this.proOldDocName = proOldDocName;
    }

    public String getProPath() {
        return proPath;
    }

    public void setProPath(String proPath) {
        this.proPath = proPath;
    }

    public String getProDocGProId() {
        return proDocGProId;
    }

    public void setProDocGProId(String proDocGProId) {
        this.proDocGProId = proDocGProId;
    }
}
