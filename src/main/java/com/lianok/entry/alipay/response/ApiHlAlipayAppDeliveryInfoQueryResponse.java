package com.lianok.entry.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.entity.ItemDeliveryInfo;

import java.util.List;


/**
 * @author lianok.com
 */
public class ApiHlAlipayAppDeliveryInfoQueryResponse extends DockingResponseBase {

    /**
     * 履约信息列表
     */
    private List<ItemDeliveryInfo> deliveryInfos;

    public List<ItemDeliveryInfo> getDeliveryInfos() {
        return deliveryInfos;
    }

    public void setDeliveryInfos(List<ItemDeliveryInfo> deliveryInfos) {
        this.deliveryInfos = deliveryInfos;
    }
}
