package com.lianok.docking.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ApiHLMerchantSwitchChannelResponse;

/**
 * 开通小程序支付
 *
 * @author linshu
 * @create 2022/11/1 11:17
 */
public class ApiHLMerchantSwitchChannelRequest extends DockingRequestBase {

    @Override
    public String getApiName() {
        return "api.hl.merchant.switchChannel";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLMerchantSwitchChannelResponse.class;
    }

    @JSONField(name = "merchantNo")
    private String merchantNo;
    @JSONField(name = "operatorAccount")
    private String operatorAccount;
    @JSONField(name = "payWay")
    private String payWay;
    @JSONField(name = "payStyle")
    private String payStyle;
    @JSONField(name = "channelCode")
    private String channelCode;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getPayStyle() {
        return payStyle;
    }

    public void setPayStyle(String payStyle) {
        this.payStyle = payStyle;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

}
