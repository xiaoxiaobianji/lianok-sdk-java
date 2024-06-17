package com.lianok.docking.pay.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlOrderPayBankResponse extends DockingResponseBase {

    /**
     * 支付跳转链接(收银台)
     */
    private String payUrl;
    /**
     * 系统对接流水单号
     */
    private String businessOrderNo;
    /**
     * 操作者账号
     */
    private String operatorAccount;
    /**
     * 火脸订单号
     */
    private String orderNo;

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
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
}
