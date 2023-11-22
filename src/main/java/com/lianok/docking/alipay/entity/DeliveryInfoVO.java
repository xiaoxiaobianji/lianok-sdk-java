package com.lianok.docking.alipay.entity;

import java.util.List;

public class DeliveryInfoVO {
    private String deliveryId;
    private List<DeliveryItemInfoVO> itemInfoList;
    private String waybillId;

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public List<DeliveryItemInfoVO> getItemInfoList() {
        return itemInfoList;
    }

    public void setItemInfoList(List<DeliveryItemInfoVO> itemInfoList) {
        this.itemInfoList = itemInfoList;
    }

    public String getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(String waybillId) {
        this.waybillId = waybillId;
    }
}
