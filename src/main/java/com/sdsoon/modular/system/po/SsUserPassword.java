package com.sdsoon.modular.system.po;

import java.io.Serializable;

public class SsUserPassword implements Serializable {
    private String gUserId;

    private String encryptPassword;

    private static final long serialVersionUID = 1L;

    public String getgUserId() {
        return gUserId;
    }

    public void setgUserId(String gUserId) {
        this.gUserId = gUserId == null ? null : gUserId.trim();
    }

    public String getEncryptPassword() {
        return encryptPassword;
    }

    public void setEncryptPassword(String encryptPassword) {
        this.encryptPassword = encryptPassword == null ? null : encryptPassword.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gUserId=").append(gUserId);
        sb.append(", encryptPassword=").append(encryptPassword);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}