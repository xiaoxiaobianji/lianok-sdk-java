package com.lianok.entry.merchant.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.merchant.response.ApiHlShopQueryZfbAuthorizeStateResponse;

/**
 * @author lianok.com
 */
public class ApiHlShopQueryZfbAuthorizeStateRequest extends AbstractEntryRequest {

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
    public String getResource() {
        return "api.hl.shop.queryZfbAuthorizeState";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopQueryZfbAuthorizeStateResponse.class;
    }
}
