package com.lianok.docking.upload.request;

import com.lianok.core.entity.AbstractUploadRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.upload.response.ApiHlShopUploadImageResponse;

/**
 * 图片上传
 *
 * @author lianok.com
 */
public class ApiHlShopUploadImageRequest extends AbstractUploadRequest {

    @Override
    public String getResource() {
        return "api.hl.shop.uploadImage";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopUploadImageResponse.class;
    }
}
