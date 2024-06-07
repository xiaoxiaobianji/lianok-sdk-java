package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.entity.AppItemAttr;
import com.lianok.entry.alipay.response.ApiHlAlipayAppDeliveryInfoSyncResponse;

import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlAlipayAppDeliveryInfoSyncRequest extends AbstractEntryRequest {
    /**
     * 商户号
     */
    private String merchantNo;

    private List<AppItemAttr> attrs;
    private String deliveryId;
    private String deliveryName;
    private String deliveryType;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public List<AppItemAttr> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<AppItemAttr> attrs) {
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
    public String getResource() {
        return "api.hl.alipay.app.delivery.info.sync";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayAppDeliveryInfoSyncResponse.class;
    }
}
