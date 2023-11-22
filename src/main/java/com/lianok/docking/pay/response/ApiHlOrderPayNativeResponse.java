package com.lianok.docking.pay.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlOrderPayNativeResponse extends DockingResponseBase {

    /**
     * 支付二维码链接
     * 跳转链接发起付款
     */
    private String qrCodeUrl;
    /**
     * 对接商系统订单号
     * 由对接商自行定义规范，最大长度不超过64
     */
    private String businessOrderNo;
    /**
     * 火脸订单号
     */
    private String orderNo;
    /**
     *
     */
    private String operatorAccount;

    public String getQrCodeUrl() {
        return qrCodeUrl;
    }

    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }
}
