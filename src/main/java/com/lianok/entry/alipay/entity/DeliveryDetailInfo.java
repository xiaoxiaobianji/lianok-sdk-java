package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class DeliveryDetailInfo {

    private List<DeliveryInfo> deliveryList;
    private String finishAllDelivery;

    public List<DeliveryInfo> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(List<DeliveryInfo> deliveryList) {
        this.deliveryList = deliveryList;
    }

    public String getFinishAllDelivery() {
        return finishAllDelivery;
    }

    public void setFinishAllDelivery(String finishAllDelivery) {
        this.finishAllDelivery = finishAllDelivery;
    }
}
