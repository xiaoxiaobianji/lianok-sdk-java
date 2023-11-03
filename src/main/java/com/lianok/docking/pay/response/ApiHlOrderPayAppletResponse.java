package com.lianok.docking.pay.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlOrderPayAppletResponse extends DockingResponseBase {

    private String merchantNo;
    private String operatorAccount;
    private String orderNo;
    private String businessOrderNo;
    private String jsPayInfo;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getJsPayInfo() {
        return jsPayInfo;
    }

    public void setJsPayInfo(String jsPayInfo) {
        this.jsPayInfo = jsPayInfo;
    }
}
