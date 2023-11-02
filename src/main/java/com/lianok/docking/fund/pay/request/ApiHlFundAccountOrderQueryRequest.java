package com.lianok.docking.fund.pay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.fund.pay.response.ApiHlFundAccountOrderQueryResponse;

/**
 * 代付订单详情
 */
public class ApiHlFundAccountOrderQueryRequest extends AbstractDockingRequest {

    /**
     * 商户ID
     */
    private String merchantNo;
    /**
     * 渠道订单号
     */
    private String channelOrderNo;
    /**
     * 对接商系统订单号
     */
    private String businessOrderNo;
    /**
     * 火脸订单号
     */
    private String orderNo;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelOrderNo() {
        return channelOrderNo;
    }

    public void setChannelOrderNo(String channelOrderNo) {
        this.channelOrderNo = channelOrderNo;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String getResource() {
        return "api.hl.fund.account.order.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlFundAccountOrderQueryResponse.class;
    }
}
