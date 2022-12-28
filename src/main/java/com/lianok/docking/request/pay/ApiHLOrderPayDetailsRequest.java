package com.lianok.docking.request.pay;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.pay.ApiHLOrderPayDetailsResponse;

/**
 * 订单详情
 *
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

    /**
     * 火脸订单号，
     * 火脸订单号可在火脸服务商后台-订单管理-交易流水或商家后台-订单管理-交易流水中查看
     */
    @JSONField(name = "orderNo")
    private String orderNo;
    /**
     * 商户ID，
     * 火脸商户ID，在火脸服务商后台-商户列表或商家后台-门店列表，可查看该字段
     */
    @JSONField(name = "merchantNo")
    private String merchantNo;
    /**
     * 渠道订单号，
     * 如乐刷订单号、随行付订单号等
     */
    @JSONField(name = "channelOrderNo")
    private String channelOrderNo;
    /**
     * 对接商系统订单号，
     * 由对接商自行定义规范，最大长度不超过64
     * 与火脸订单号、渠道订单号请求3选1，都传优先以火脸订单号请求
     */
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
