package com.lianok.docking.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.ItemDeliveryInfoVO;

import java.util.List;


public class ApiHlAlipayAppDeliveryInfoQueryResponse extends DockingResponseBase {

    /**
     * 履约信息列表
     */
    private List<ItemDeliveryInfoVO> deliveryInfos;

    public List<ItemDeliveryInfoVO> getDeliveryInfos() {
        return deliveryInfos;
    }

    public void setDeliveryInfos(List<ItemDeliveryInfoVO> deliveryInfos) {
        this.deliveryInfos = deliveryInfos;
    }
}
