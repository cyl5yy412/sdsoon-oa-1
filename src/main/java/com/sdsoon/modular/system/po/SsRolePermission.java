package com.sdsoon.modular.system.po;

import java.io.Serializable;

public class SsRolePermission implements Serializable {
    private Integer rolePermGRoleId;

    private Integer rolePermGPermId;

    private static final long serialVersionUID = 1L;

    public Integer getRolePermGRoleId() {
        return rolePermGRoleId;
    }

    public void setRolePermGRoleId(Integer rolePermGRoleId) {
        this.rolePermGRoleId = rolePermGRoleId;
    }

    public Integer getRolePermGPermId() {
        return rolePermGPermId;
    }

    public void setRolePermGPermId(Integer rolePermGPermId) {
        this.rolePermGPermId = rolePermGPermId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rolePermGRoleId=").append(rolePermGRoleId);
        sb.append(", rolePermGPermId=").append(rolePermGPermId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}