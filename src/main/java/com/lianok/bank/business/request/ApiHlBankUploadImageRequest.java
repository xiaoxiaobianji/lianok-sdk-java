package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankUploadImageResponse;
import com.lianok.core.entity.AbstractUploadRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * 图片上传
 *
 * @author lianok.com
 */
public class ApiHlBankUploadImageRequest extends AbstractUploadRequest {

    /**
     * 固定值：bank
     *
     * @return
     */
    @Override
    public String getFileTag() {
        return "bank";
    }

    @Override
    public String getResource() {
        return "api.hl.bank.upload.image";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankUploadImageResponse.class;
    }
}
