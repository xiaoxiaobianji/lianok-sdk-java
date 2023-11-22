package com.lianok.docking.alipay.entity;

import java.util.List;

public class DeliveryDetailInfoVO {
    private List<DeliveryInfoVO> deliveryList;
    private String finishAllDelivery;

    public List<DeliveryInfoVO> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(List<DeliveryInfoVO> deliveryList) {
        this.deliveryList = deliveryList;
    }

    public String getFinishAllDelivery() {
        return finishAllDelivery;
    }

    public void setFinishAllDelivery(String finishAllDelivery) {
        this.finishAllDelivery = finishAllDelivery;
    }
}
