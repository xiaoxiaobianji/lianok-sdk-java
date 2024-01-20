package com.lianok.docking.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlShopQueryWxAuthorizeStateResponse extends DockingResponseBase {

    private String merchantNo;
    private String merchantId;
    private String wxPid;
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

    public String getWxPid() {
        return wxPid;
    }

    public void setWxPid(String wxPid) {
        this.wxPid = wxPid;
    }

    public String getAuthorizeState() {
        return authorizeState;
    }

    public void setAuthorizeState(String authorizeState) {
        this.authorizeState = authorizeState;
    }
}
