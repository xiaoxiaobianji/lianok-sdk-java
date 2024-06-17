package com.lianok.docking.fund.pay.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author lianok.com
 */
public class ApiHlFundAccountOrderQueryResponse extends DockingResponseBase {

    private String orderNo;
    private String businessOrderNo;
    private String channelOrderNo;
    private String merchantNo;
    private String cashierNo;
    private BigDecimal totalAmount;
    private BigDecimal payAmount;
    private BigDecimal actualAmount;
    private BigDecimal serviceFee;
    private LocalDateTime payTime;
    private String payChannel;
    private Integer orderStatus;
    private String receiverAccountNo;
    private String receiverAccountName;
    private String receiverBankCode;
    private String bankAccountType;
    private String feeChargeSide;
    private String receiveType;
    private String terminalType;
    private String failReason;
    private Boolean isReversed;
    private LocalDateTime reverseTime;
    private String branchBankCode;
    private String comments;
    private String receiptComments;
    private String remark;

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

    public String getChannelOrderNo() {
        return channelOrderNo;
    }

    public void setChannelOrderNo(String channelOrderNo) {
        this.channelOrderNo = channelOrderNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getCashierNo() {
        return cashierNo;
    }

    public void setCashierNo(String cashierNo) {
        this.cashierNo = cashierNo;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getReceiverAccountNo() {
        return receiverAccountNo;
    }

    public void setReceiverAccountNo(String receiverAccountNo) {
        this.receiverAccountNo = receiverAccountNo;
    }

    public String getReceiverAccountName() {
        return receiverAccountName;
    }

    public void setReceiverAccountName(String receiverAccountName) {
        this.receiverAccountName = receiverAccountName;
    }

    public String getReceiverBankCode() {
        return receiverBankCode;
    }

    public void setReceiverBankCode(String receiverBankCode) {
        this.receiverBankCode = receiverBankCode;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public String getFeeChargeSide() {
        return feeChargeSide;
    }

    public void setFeeChargeSide(String feeChargeSide) {
        this.feeChargeSide = feeChargeSide;
    }

    public String getReceiveType() {
        return receiveType;
    }

    public void setReceiveType(String receiveType) {
        this.receiveType = receiveType;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public Boolean getReversed() {
        return isReversed;
    }

    public void setReversed(Boolean reversed) {
        isReversed = reversed;
    }

    public LocalDateTime getReverseTime() {
        return reverseTime;
    }

    public void setReverseTime(LocalDateTime reverseTime) {
        this.reverseTime = reverseTime;
    }

    public String getBranchBankCode() {
        return branchBankCode;
    }

    public void setBranchBankCode(String branchBankCode) {
        this.branchBankCode = branchBankCode;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getReceiptComments() {
        return receiptComments;
    }

    public void setReceiptComments(String receiptComments) {
        this.receiptComments = receiptComments;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
