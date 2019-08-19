package com.sdsoon.modular.system.po;

import java.io.Serializable;

public class SsPermission implements Serializable {
    private Integer permId;

    private String permName;

    private String permCode;

    private Integer permStatus;

    private String permDescription;

    private Integer permParentId;

    private static final long serialVersionUID = 1L;

    public Integer getPermId() {
        return permId;
    }

    public void setPermId(Integer permId) {
        this.permId = permId;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName == null ? null : permName.trim();
    }

    public String getPermCode() {
        return permCode;
    }

    public void setPermCode(String permCode) {
        this.permCode = permCode == null ? null : permCode.trim();
    }

    public Integer getPermStatus() {
        return permStatus;
    }

    public void setPermStatus(Integer permStatus) {
        this.permStatus = permStatus;
    }

    public String getPermDescription() {
        return permDescription;
    }

    public void setPermDescription(String permDescription) {
        this.permDescription = permDescription == null ? null : permDescription.trim();
    }

    public Integer getPermParentId() {
        return permParentId;
    }

    public void setPermParentId(Integer permParentId) {
        this.permParentId = permParentId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", permId=").append(permId);
        sb.append(", permName=").append(permName);
        sb.append(", permCode=").append(permCode);
        sb.append(", permStatus=").append(permStatus);
        sb.append(", permDescription=").append(permDescription);
        sb.append(", permParentId=").append(permParentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}