package com.lianok.docking.alipay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.AppItemAttrVO;
import com.lianok.docking.alipay.response.ApiHlAlipayAppDeliveryInfoSyncResponse;

import java.util.List;


public class ApiHlAlipayAppDeliveryInfoSyncRequest extends AbstractDockingRequest {
    /**
     * 商户号
     */
    private String merchantNo;

    private List<AppItemAttrVO> attrs;
    private String deliveryId;
    private String deliveryName;
    private String deliveryType;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public List<AppItemAttrVO> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<AppItemAttrVO> attrs) {
        this.attrs = attrs;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    @Override
    public Boolean getSignByObjectMethod() {
        return true;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.app.delivery.info.sync";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayAppDeliveryInfoSyncResponse.class;
    }
}
