package com.lianok.docking.merchant.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.merchant.response.ApiHlShopQueryWxAuthorizeStateResponse;

/**
 * @author linshu
 * @create 2024/1/19 16:54
 */
public class ApiHlShopQueryWxAuthorizeStateRequest extends AbstractDockingRequest {

    private String merchantNo;
    private String channelCode;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    @Override
    public Boolean getSignByJsonStringMethod() {
        return true;
    }

    @Override
    public String getResource() {
        return "api.hl.shop.queryWxAuthorizeState";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopQueryWxAuthorizeStateResponse.class;
    }
}
