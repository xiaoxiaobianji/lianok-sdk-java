package com.lianok.docking.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlShopQuerySubMchIdResponse extends DockingResponseBase {

    private String merchantNo;
    private String channelCode;
    private String alipayMerchantNo;
    private String wechatMerchantNo;

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

    public String getAlipayMerchantNo() {
        return alipayMerchantNo;
    }

    public void setAlipayMerchantNo(String alipayMerchantNo) {
        this.alipayMerchantNo = alipayMerchantNo;
    }

    public String getWechatMerchantNo() {
        return wechatMerchantNo;
    }

    public void setWechatMerchantNo(String wechatMerchantNo) {
        this.wechatMerchantNo = wechatMerchantNo;
    }
}
