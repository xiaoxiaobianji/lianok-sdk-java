package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.response.ApiHlAlipayMiniOrderDeliveryReceiveResponse;


/**
 * @author lianok.com
 */
public class ApiHlAlipayMiniOrderDeliveryReceiveRequest extends AbstractEntryRequest {
    /**
     * 商户号
     */
    private String merchantNo;
    /**
     * 火脸订单号
     */
    private String outOrderId;
    /**
     * 组件单号
     */
    private String orderId;
    /**
     * 用户标识
     */
    private String userId;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.mini.order.delivery.receive";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayMiniOrderDeliveryReceiveResponse.class;
    }
}
