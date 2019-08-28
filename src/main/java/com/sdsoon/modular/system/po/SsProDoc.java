package com.sdsoon.modular.system.po;

import java.io.Serializable;

public class SsProDoc implements Serializable {
    private String proDocId;

    private String proNewDocName;

    private String proOldDocName;

    private String proPath;

    private String proDocGProId;

    private static final long serialVersionUID = 1L;

    public String getProDocId() {
        return proDocId;
    }

    public void setProDocId(String proDocId) {
        this.proDocId = proDocId == null ? null : proDocId.trim();
    }

    public String getProNewDocName() {
        return proNewDocName;
    }

    public void setProNewDocName(String proNewDocName) {
        this.proNewDocName = proNewDocName == null ? null : proNewDocName.trim();
    }

    public String getProOldDocName() {
        return proOldDocName;
    }

    public void setProOldDocName(String proOldDocName) {
        this.proOldDocName = proOldDocName == null ? null : proOldDocName.trim();
    }

    public String getProPath() {
        return proPath;
    }

    public void setProPath(String proPath) {
        this.proPath = proPath == null ? null : proPath.trim();
    }

    public String getProDocGProId() {
        return proDocGProId;
    }

    public void setProDocGProId(String proDocGProId) {
        this.proDocGProId = proDocGProId == null ? null : proDocGProId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proDocId=").append(proDocId);
        sb.append(", proNewDocName=").append(proNewDocName);
        sb.append(", proOldDocName=").append(proOldDocName);
        sb.append(", proPath=").append(proPath);
        sb.append(", proDocGProId=").append(proDocGProId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}