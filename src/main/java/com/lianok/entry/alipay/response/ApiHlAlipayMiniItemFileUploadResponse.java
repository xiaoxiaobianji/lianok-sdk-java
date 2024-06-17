package com.lianok.entry.alipay.response;

import com.lianok.core.entity.DockingResponseBase;


/**
 * @author lianok.com
 */
public class ApiHlAlipayMiniItemFileUploadResponse extends DockingResponseBase {
    /**
     * 文件在商品中心的素材标识（素材ID长期有效）
     */
    private String materialId;

    /**
     * 文件在商品中心的素材标示，创建/更新商品时使用
     */
    private String materialKey;

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getMaterialKey() {
        return materialKey;
    }

    public void setMaterialKey(String materialKey) {
        this.materialKey = materialKey;
    }
}
