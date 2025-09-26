package com.lianok.docking.withdraw.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;

/**
 * @author lianok.com
 */
public class ApiHlWithdrawQueryOrderResponse extends DockingResponseBase {

    private String merchantNo;
    private String orderNo;
    private String businessOrderNo;
    private Integer orderStatus;

    private BigDecimal totalAmount;

    private String terminalType;

    private String receiveType;

    private String bankCardId;

    private String bankAccountNo;

    private String remark;

    private String feeDeductType;

    private String accountType;

    private BigDecimal actualAmount;

    private BigDecimal payAmount;

    private BigDecimal serviceFee;

    private String failReason;

    private String accountName;

    private String accountNo;

    private String bankName;

    private String bankCode;

    private String branchBankCode;

    private Integer isReversed;

    private String reverseTime;

    private String payTime;

    public String getMerchantNo() {
        return merchantNo;
    }
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOrderNo() {return orderNo;}
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBusinessOrderNo() {return businessOrderNo;}
    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public Integer getOrderStatus() {return orderStatus;}
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getTotalAmount() {return totalAmount;}
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTerminalType() {return terminalType;}
    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getReceiveType() {return receiveType;}
    public void setReceiveType(String receiveType) {
        this.receiveType = receiveType;
    }

    public String getBankCardId() {return bankCardId;}
    public void setBankCardId(String bankCardId) {
        this.bankCardId = bankCardId;
    }

    public String getBankAccountNo() {return bankAccountNo;}
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getRemark() {return remark;}
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFeeDeductType() {return feeDeductType;}
    public void setFeeDeductType(String feeDeductType) {
        this.feeDeductType = feeDeductType;
    }

    public String getAccountType() {return accountType;}
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getActualAmount() {return actualAmount;}
    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    public BigDecimal getPayAmount() {return payAmount;}
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getServiceFee() {return serviceFee;}
    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getFailReason() {return failReason;}
    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public String getAccountName() {return accountName;}
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNo() {return accountNo;}
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankName() {return bankName;}
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {return bankCode;}
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBranchBankCode() {return branchBankCode;}
    public void setBranchBankCode(String branchBankCode) {
        this.branchBankCode = branchBankCode;
    }

    public Integer getIsReversed() {return isReversed;}
    public void setIsReversed(Integer isReversed) {
        this.isReversed = isReversed;
    }

    public String getReverseTime() {return reverseTime;}
    public void setReverseTime(String reverseTime) {
        this.reverseTime = reverseTime;
    }

    public String getPayTime() {return payTime;}
    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

}
