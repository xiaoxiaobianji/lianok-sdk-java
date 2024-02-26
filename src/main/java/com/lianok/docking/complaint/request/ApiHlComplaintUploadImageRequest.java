package com.lianok.docking.complaint.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.complaint.response.ApiHlComplaintUploadImageResponse;

public class ApiHlComplaintUploadImageRequest extends AbstractDockingRequest {

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
        return "api.hl.complaint.upload.image";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlComplaintUploadImageResponse.class;
    }
}
