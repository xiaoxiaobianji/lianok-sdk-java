package com.lianok.docking.request.pay;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.pay.ApiHLOrderRefundDetailsResponse;

/**
 * 退款详情
 *
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

    /**
     * 火脸退单号，
     * 火脸退单号可在火脸服务商后台-订单管理-交易流水或商家后台-订单管理-交易流水中查看。
     */
    @JSONField(name = "refundNo")
    private String refundNo;
    /**
     * 渠道退单号
     * 如乐刷退单号、随行付退单号等
     */
    @JSONField(name = "channelRefundNo")
    private String channelRefundNo;
    /**
     * 对接商系统退单号，
     * 由对接商自行定义规范，最大长度不超过64
     * 与火脸退单号、渠道退单号请求3选1，都传优先判断火脸订单号正确性
     */
    @JSONField(name = "businessRefundNo")
    private String businessRefundNo;
    /**
     * 商户ID，
     * 火脸商户ID，在火脸服务商后台-商户列表或商家后台-门店列表，可查看该字段
     */
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
