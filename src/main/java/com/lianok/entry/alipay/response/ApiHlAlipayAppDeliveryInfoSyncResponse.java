package com.lianok.entry.alipay.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlAlipayAppDeliveryInfoSyncResponse extends DockingResponseBase {

    /**
     * 履约信息ID
     */
    private String deliveryId;

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }
}
