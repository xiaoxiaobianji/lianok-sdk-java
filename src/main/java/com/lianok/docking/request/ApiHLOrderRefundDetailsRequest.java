package com.lianok.docking.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ApiHLOrderRefundDetailsResponse;

/**
 * @author linshu
 * @create 2022/8/22 17:56
 */
public class ApiHLOrderRefundDetailsRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.order.refund.details";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLOrderRefundDetailsResponse.class;
    }

    @JSONField(name = "refundNo")
    private String refundNo;
    @JSONField(name = "channelRefundNo")
    private String channelRefundNo;
    @JSONField(name = "businessRefundNo")
    private String businessRefundNo;
    @JSONField(name = "merchantNo")
    private String merchantNo;

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getChannelRefundNo() {
        return channelRefundNo;
    }

    public void setChannelRefundNo(String channelRefundNo) {
        this.channelRefundNo = channelRefundNo;
    }

    public String getBusinessRefundNo() {
        return businessRefundNo;
    }

    public void setBusinessRefundNo(String businessRefundNo) {
        this.businessRefundNo = businessRefundNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }
}
