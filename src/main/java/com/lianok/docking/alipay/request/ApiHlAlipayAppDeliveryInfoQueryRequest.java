package com.lianok.docking.alipay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.response.ApiHlAlipayAppDeliveryInfoQueryResponse;

import java.util.List;

public class ApiHlAlipayAppDeliveryInfoQueryRequest extends AbstractDockingRequest {
    /**
     * 商户号
     */
    private String merchantNo;
    private List<String> deliveryIds;
    private String deliveryType;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public List<String> getDeliveryIds() {
        return deliveryIds;
    }

    public void setDeliveryIds(List<String> deliveryIds) {
        this.deliveryIds = deliveryIds;
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
        return "api.hl.alipay.app.delivery.info.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayAppDeliveryInfoQueryResponse.class;
    }
}
