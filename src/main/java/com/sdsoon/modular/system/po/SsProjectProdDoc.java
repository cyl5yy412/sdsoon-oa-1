package com.sdsoon.modular.system.po;

import java.io.Serializable;

public class SsProjectProdDoc implements Serializable {
    private String prodDocId;

    private String prodDocOldName;

    private String prodDocNewName;

    private String prodDocPath;

    private String prodGProdId;

    private static final long serialVersionUID = 1L;

    public String getProdDocId() {
        return prodDocId;
    }

    public void setProdDocId(String prodDocId) {
        this.prodDocId = prodDocId == null ? null : prodDocId.trim();
    }

    public String getProdDocOldName() {
        return prodDocOldName;
    }

    public void setProdDocOldName(String prodDocOldName) {
        this.prodDocOldName = prodDocOldName == null ? null : prodDocOldName.trim();
    }

    public String getProdDocNewName() {
        return prodDocNewName;
    }

    public void setProdDocNewName(String prodDocNewName) {
        this.prodDocNewName = prodDocNewName == null ? null : prodDocNewName.trim();
    }

    public String getProdDocPath() {
        return prodDocPath;
    }

    public void setProdDocPath(String prodDocPath) {
        this.prodDocPath = prodDocPath == null ? null : prodDocPath.trim();
    }

    public String getProdGProdId() {
        return prodGProdId;
    }

    public void setProdGProdId(String prodGProdId) {
        this.prodGProdId = prodGProdId == null ? null : prodGProdId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prodDocId=").append(prodDocId);
        sb.append(", prodDocOldName=").append(prodDocOldName);
        sb.append(", prodDocNewName=").append(prodDocNewName);
        sb.append(", prodDocPath=").append(prodDocPath);
        sb.append(", prodGProdId=").append(prodGProdId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}