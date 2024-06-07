package com.lianok.entry.complaint.request;

import com.lianok.core.entity.AbstractUploadRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.complaint.response.ApiHlComplaintUploadImageResponse;

/**
 * @author lianok.com
 */
public class ApiHlComplaintUploadImageRequest extends AbstractUploadRequest {

    @Override
    public String getFileTag() {
        return "complaint";
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
