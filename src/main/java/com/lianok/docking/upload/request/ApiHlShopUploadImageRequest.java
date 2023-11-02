package com.lianok.docking.upload.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.upload.response.ApiHlShopUploadImageResponse;

/**
 * 图片上传
 */
public class ApiHlShopUploadImageRequest extends AbstractDockingRequest {

    @JSONField(serialize = false)
    private String fileName;

    @JSONField(serialize = false)
    private byte[] file;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    @Override
    public String getResource() {
        return "api.hl.shop.uploadImage";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopUploadImageResponse.class;
    }
}
