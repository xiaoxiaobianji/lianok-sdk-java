package com.lianok.docking.fund.settle.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlOrderDeferredSettlementConfirmResponse extends DockingResponseBase {

    private String merchantNo;
    private String orderNo;
    private String businessOrderNo;
    private String operatorAccount;
    private String deferredOrderNo;
    private String deferredAmount;
    private Integer revokeStatus;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
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

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getDeferredOrderNo() {
        return deferredOrderNo;
    }

    public void setDeferredOrderNo(String deferredOrderNo) {
        this.deferredOrderNo = deferredOrderNo;
    }

    public String getDeferredAmount() {
        return deferredAmount;
    }

    public void setDeferredAmount(String deferredAmount) {
        this.deferredAmount = deferredAmount;
    }

    public Integer getRevokeStatus() {
        return revokeStatus;
    }

    public void setRevokeStatus(Integer revokeStatus) {
        this.revokeStatus = revokeStatus;
    }
}
