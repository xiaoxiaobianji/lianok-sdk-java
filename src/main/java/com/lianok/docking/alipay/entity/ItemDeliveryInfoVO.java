package com.lianok.docking.alipay.entity;

import java.util.List;

public class ItemDeliveryInfoVO {

    /**
     * 履约配置信息，通过alipay.open.app.delivery.template.query获取属性key列表，is_required=true时属性必填
     */
    private List<AppItemAttrVO> attrs;

    /**
     * 履约信息主键ID，建议调用方持久化方便后续查询编辑使用
     */
    private String deliveryId;

    /**
     * 履约名称
     */
    private String deliveryName;

    /**
     * 履约类型
     */
    private String deliveryType;

    public List<AppItemAttrVO> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<AppItemAttrVO> attrs) {
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
}
