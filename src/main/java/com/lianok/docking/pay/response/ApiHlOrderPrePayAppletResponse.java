package com.lianok.docking.pay.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlOrderPrePayAppletResponse extends DockingResponseBase {

    private String merchantNo;
    private String operatorAccount;
    private String orderNo;
    private String businessOrderNo;
    private String appId;
    private String miniProgramId;
    private String miniProgramPath;
    private String payPath;

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

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getMiniProgramId() {
        return miniProgramId;
    }

    public void setMiniProgramId(String miniProgramId) {
        this.miniProgramId = miniProgramId;
    }

    public String getMiniProgramPath() {
        return miniProgramPath;
    }

    public void setMiniProgramPath(String miniProgramPath) {
        this.miniProgramPath = miniProgramPath;
    }

    public String getPayPath() {
        return payPath;
    }

    public void setPayPath(String payPath) {
        this.payPath = payPath;
    }
}
