package com.lianok.bank.business.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * 图片上传
 *
 * @author lianok.com
 */
public class ApiHlBankUploadImageResponse extends DockingResponseBase {

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
