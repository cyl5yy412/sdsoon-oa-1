package com.sdsoon.modular.system.vo.h;

import com.sdsoon.modular.system.po.SsProjectPic;

import java.io.Serializable;

/**
 * Created By Chr on 2019/9/12.
 */
public class PicVo extends SsProjectPic implements Serializable {

    private static final long serialVersionUID = 2033410644863790928L;

    private String imgUrl;

    public PicVo() {
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
