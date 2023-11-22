package com.lianok.docking.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.AttributeVO;


public class ApiHlAlipayAppDeliveryTemplateQueryResponse extends DockingResponseBase {

    /**
     * 属性信息
     */
    private AttributeVO attrs;

    /**
     * 履约类型
     */
    private String deliveryType;

    /**
     * 履约模板ID
     */
    private String templateId;

    public AttributeVO getAttrs() {
        return attrs;
    }

    public void setAttrs(AttributeVO attrs) {
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
