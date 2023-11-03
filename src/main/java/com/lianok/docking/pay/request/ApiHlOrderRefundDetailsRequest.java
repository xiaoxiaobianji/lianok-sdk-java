package com.lianok.docking.pay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.pay.response.ApiHlOrderRefundDetailsResponse;

/**
 * 退款详情
 */
public class ApiHlOrderRefundDetailsRequest extends AbstractDockingRequest {

    /**
     * 火脸退单号，
     * 火脸退单号可在火脸服务商后台-订单管理-交易流水或商家后台-订单管理-交易流水中查看。
     */
    private String refundNo;
    /**
     * 渠道退单号
     * 如乐刷退单号、随行付退单号等
     */
    private String channelRefundNo;
    /**
     * 对接商系统退单号，
     * 由对接商自行定义规范，最大长度不超过64
     * 与火脸退单号、渠道退单号请求3选1，都传优先判断火脸订单号正确性
     */
    private String businessRefundNo;
    /**
     * 商户ID，
     * 火脸商户ID，在火脸服务商后台-商户列表或商家后台-门店列表，可查看该字段
     */
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

    @Override
    public String getResource() {
        return "api.hl.order.refund.details";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlOrderRefundDetailsResponse.class;
    }
}
