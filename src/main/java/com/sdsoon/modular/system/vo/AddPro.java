package com.sdsoon.modular.system.vo;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * Created By Chr on 2019/8/27.
 */
public class AddPro implements Serializable {
    private static final long serialVersionUID = -8286920006797812685L;

    private String proName;
    private String date;
    private String proStatus;
    private String proLevel;
    private String proLeader;
    private MultipartFile file;


    public AddPro() {
    }

    public AddPro(String proName, String date, String proStatus, String proLevel, String proLeader, MultipartFile file) {
        this.proName = proName;
        this.date = date;
        this.proStatus = proStatus;
        this.proLevel = proLevel;
        this.proLeader = proLeader;
        this.file = file;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProStatus() {
        return proStatus;
    }

    public void setProStatus(String proStatus) {
        this.proStatus = proStatus;
    }

    public String getProLevel() {
        return proLevel;
    }

    public void setProLevel(String proLevel) {
        this.proLevel = proLevel;
    }

    public String getProLeader() {
        return proLeader;
    }

    public void setProLeader(String proLeader) {
        this.proLeader = proLeader;
    }
}
