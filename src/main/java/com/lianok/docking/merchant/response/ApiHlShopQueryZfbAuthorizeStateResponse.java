package com.lianok.docking.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlShopQueryZfbAuthorizeStateResponse extends DockingResponseBase {

    private String merchantNo;
    private String channelMerchantNo;
    private String alipayMerchantNo;
    private String authorizeState;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelMerchantNo() {
        return channelMerchantNo;
    }

    public void setChannelMerchantNo(String channelMerchantNo) {
        this.channelMerchantNo = channelMerchantNo;
    }

    public String getAlipayMerchantNo() {
        return alipayMerchantNo;
    }

    public void setAlipayMerchantNo(String alipayMerchantNo) {
        this.alipayMerchantNo = alipayMerchantNo;
    }

    public String getAuthorizeState() {
        return authorizeState;
    }

    public void setAuthorizeState(String authorizeState) {
        this.authorizeState = authorizeState;
    }
}
