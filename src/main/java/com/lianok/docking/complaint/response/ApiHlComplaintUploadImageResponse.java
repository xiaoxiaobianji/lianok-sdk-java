package com.lianok.docking.complaint.response;


import com.lianok.core.entity.DockingResponseBase;

public class ApiHlComplaintUploadImageResponse extends DockingResponseBase {

    private String imgUrl;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
