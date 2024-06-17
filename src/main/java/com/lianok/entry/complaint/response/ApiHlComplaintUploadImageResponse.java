package com.lianok.entry.complaint.response;


import com.lianok.core.entity.DockingResponseBase;

/**
 * 投诉图片
 *
 * @author lianok.com
 */
public class ApiHlComplaintUploadImageResponse extends DockingResponseBase {

    /**
     * 完整OSS地址
     */
    private String imgUrl;

    /**
     * 不含地区域名地址
     */
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
