package com.lianok.entry.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.entity.Attribute;

/**
 * @author lianok.com
 */
public class ApiHlAlipayAppDeliveryTemplateQueryResponse extends DockingResponseBase {

    /**
     * 属性信息
     */
    private Attribute attrs;

    /**
     * 履约类型
     */
    private String deliveryType;

    /**
     * 履约模板ID
     */
    private String templateId;

    public Attribute getAttrs() {
        return attrs;
    }

    public void setAttrs(Attribute attrs) {
        this.attrs = attrs;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }
}
