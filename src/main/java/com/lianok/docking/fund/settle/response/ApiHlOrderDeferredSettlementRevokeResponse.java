package com.lianok.docking.fund.settle.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;

/**
 * @author lianok.com
 */
public class ApiHlOrderDeferredSettlementRevokeResponse extends DockingResponseBase {

    private String merchantNo;
    private String orderNo;
    private String businessOrderNo;
    private String operatorAccount;
    private String deferredOrderNo;
    private BigDecimal deferredAmount;
    private Integer deferredStatus;
    private String message;

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

    public BigDecimal getDeferredAmount() {
        return deferredAmount;
    }

    public void setDeferredAmount(BigDecimal deferredAmount) {
        this.deferredAmount = deferredAmount;
    }

    public Integer getDeferredStatus() {
        return deferredStatus;
    }

    public void setDeferredStatus(Integer deferredStatus) {
        this.deferredStatus = deferredStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
