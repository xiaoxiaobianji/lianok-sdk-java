package com.lianok.docking.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlShopQueryZfbAuthorizeStateResponse extends DockingResponseBase {

    private String merchantNo;
    private String merchantId;
    private String smid;
    private String authorizeState;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getSmid() {
        return smid;
    }

    public void setSmid(String smid) {
        this.smid = smid;
    }

    public String getAuthorizeState() {
        return authorizeState;
    }

    public void setAuthorizeState(String authorizeState) {
        this.authorizeState = authorizeState;
    }
}
