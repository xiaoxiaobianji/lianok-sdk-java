package com.lianok.docking.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ApiHLOrderPayDetailsResponse;

/**
 * @author linshu
 * @create 2022/8/22 17:56
 */
public class ApiHLOrderPayDetailsRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.order.pay.details";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLOrderPayDetailsResponse.class;
    }

    @JSONField(name = "orderNo")
    private String orderNo;
    @JSONField(name = "merchantNo")
    private String merchantNo;
    @JSONField(name = "channelOrderNo")
    private String channelOrderNo;
    @JSONField(name = "businessOrderNo")
    private String businessOrderNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

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
}
