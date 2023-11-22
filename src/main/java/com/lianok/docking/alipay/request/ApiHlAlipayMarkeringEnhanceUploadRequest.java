package com.lianok.docking.alipay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.response.ApiHlAlipayMarkeringEnhanceUploadResponse;


public class ApiHlAlipayMarkeringEnhanceUploadRequest extends AbstractDockingRequest {

    /**
     * 商户号
     */
    private String merchantNo;
    private String base64Encode;

    /**
     * 图片上传场景
     * 商品主图场景: ITEM_HEAD_IMG
     * 商品子图场景: ITEM_IMAGE_LIST
     * 商品SKU图场景: ITEM_SKU_THUMB_IMG
     * 商品详情图场景: ITEM_DESCINFO_IMG
     */
    private String uploadScene;
    /**
     * 营销图片优化上传接口
     */
    private Boolean needEnhance;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getBase64Encode() {
        return base64Encode;
    }

    public void setBase64Encode(String base64Encode) {
        this.base64Encode = base64Encode;
    }

    public String getUploadScene() {
        return uploadScene;
    }

    public void setUploadScene(String uploadScene) {
        this.uploadScene = uploadScene;
    }

    public Boolean getNeedEnhance() {
        return needEnhance;
    }

    public void setNeedEnhance(Boolean needEnhance) {
        this.needEnhance = needEnhance;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.markering.enhance.upload";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayMarkeringEnhanceUploadResponse.class;
    }
}
