package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.response.ApiHlAlipayAppDeliveryTemplateQueryResponse;

import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlAlipayAppDeliveryTemplateQueryRequest extends AbstractEntryRequest {
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
    public String getResource() {
        return "api.hl.alipay.app.delivery.template.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayAppDeliveryTemplateQueryResponse.class;
    }
}
