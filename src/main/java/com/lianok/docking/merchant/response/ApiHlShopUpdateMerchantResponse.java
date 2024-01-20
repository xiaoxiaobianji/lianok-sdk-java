package com.lianok.docking.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlShopUpdateMerchantResponse extends DockingResponseBase {

    private String merchantNo;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }
}
