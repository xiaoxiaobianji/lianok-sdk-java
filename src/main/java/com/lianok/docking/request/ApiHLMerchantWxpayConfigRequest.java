package com.lianok.docking.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ApiHLMerchantWxpayConfigResponse;

/**
 * @author linshu
 * @create 2022/11/1 11:32
 */
public class ApiHLMerchantWxpayConfigRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.merchant.wxpayconfig";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLMerchantWxpayConfigResponse.class;
    }

    @JSONField(name = "merchantNo")
    private String merchantNo;
    @JSONField(name = "operatorAccount")
    private String operatorAccount;
    @JSONField(name = "appid")
    private String appId;
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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }
}
