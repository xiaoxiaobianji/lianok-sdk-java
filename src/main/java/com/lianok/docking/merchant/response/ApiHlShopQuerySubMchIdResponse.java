package com.lianok.docking.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlShopQuerySubMchIdResponse extends DockingResponseBase {

    private String merchantNo;
    private String channelCode;
    private String smid;
    private String wxPid;

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

    public String getSmid() {
        return smid;
    }

    public void setSmid(String smid) {
        this.smid = smid;
    }

    public String getWxPid() {
        return wxPid;
    }

    public void setWxPid(String wxPid) {
        this.wxPid = wxPid;
    }
}
