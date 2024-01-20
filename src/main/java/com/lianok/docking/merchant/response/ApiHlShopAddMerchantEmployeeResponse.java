package com.lianok.docking.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlShopAddMerchantEmployeeResponse extends DockingResponseBase {

    private String name;
    private String operatorAccount;
    private String refundPassword;
    private String merchantNo;
    private String shopNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getRefundPassword() {
        return refundPassword;
    }

    public void setRefundPassword(String refundPassword) {
        this.refundPassword = refundPassword;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }
}
