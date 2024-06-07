package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class DeliveryInfo {

    private String deliveryId;
    private List<DeliveryItemInfo> itemInfoList;
    private String waybillId;

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public List<DeliveryItemInfo> getItemInfoList() {
        return itemInfoList;
    }

    public void setItemInfoList(List<DeliveryItemInfo> itemInfoList) {
        this.itemInfoList = itemInfoList;
    }

    public String getWaybillId() {
        return waybillId;
    }

    public void setWaybillId(String waybillId) {
        this.waybillId = waybillId;
    }
}
