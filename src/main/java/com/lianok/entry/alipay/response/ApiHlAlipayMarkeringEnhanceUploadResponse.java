package com.lianok.entry.alipay.response;

import com.lianok.core.entity.DockingResponseBase;


/**
 * @author lianok.com
 */
public class ApiHlAlipayMarkeringEnhanceUploadResponse extends DockingResponseBase {

    /**
     * 图片是否优化过。若上传选择需要优化，且上传的图片不符合规范，会对图片进行优化。
     */
    private Boolean imageEnhanced;

    /**
     * 图片唯一资源ID
     */
    private String imageId;

    /**
     * 图片上传后返回的链接
     */
    private String imageUrl;

    public Boolean getImageEnhanced() {
        return imageEnhanced;
    }

    public void setImageEnhanced(Boolean imageEnhanced) {
        this.imageEnhanced = imageEnhanced;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
