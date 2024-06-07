package com.lianok.entry.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlShopEntryResponse extends DockingResponseBase {

    /**
     * 商户号
     */
    private String merchantNo;
    /**
     * 商户管理密码
     */
    private String refundPassword;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getRefundPassword() {
        return refundPassword;
    }

    public void setRefundPassword(String refundPassword) {
        this.refundPassword = refundPassword;
    }
}
