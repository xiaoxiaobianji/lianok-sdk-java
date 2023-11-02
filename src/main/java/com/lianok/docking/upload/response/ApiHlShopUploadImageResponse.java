package com.lianok.docking.upload.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlShopUploadImageResponse extends DockingResponseBase {

    private String imgUrl;

    private String uploadKey;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getUploadKey() {
        return uploadKey;
    }

    public void setUploadKey(String uploadKey) {
        this.uploadKey = uploadKey;
    }
}
