package com.lianok.docking.notification;

import java.math.BigDecimal;

/**
 * 代付异步通知
 */
public class FundOrderNotification {

    /**
     * 火脸订单号
     */
    private String orderNo;
    /**
     * 对接商系统订单号
     */
    private String businessOrderNo;
    /**
     * 上游订单号
     */
    private String channelOrderNo;
    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 收银员编号
     */
    private String cashierNo;
    /**
     * 总金额
     */
    private BigDecimal totalAmount;
    /**
     * 付款金额和手续费（若有）
     */
    private BigDecimal payAmount;
    /**
     * 收款银行账户入账金额
     */
    private BigDecimal actualAmount;
    /**
     * 手续费
     */
    private BigDecimal serviceFee;
    /**
     * 成功时间
     */
    private String payTime;
    /**
     * 通道标识
     */
    private String payChannel;
    /**
     * 状态
     */
    private Integer orderStatus;
    /**
     * 收款方银行账号
     */
    private String receiverAccountNo;
    /**
     * 收款方开户名
     */
    private String receiverAccountName;
    /**
     * 开户行编号
     */
    private String receiverBankCode;
    /**
     * 收款方账户类型
     */
    private String bankAccountType;
    /**
     * 手续费承担方
     */
    private String feeChargeSide;
    /**
     * 到账类型
     */
    private String receiveType;
    /**
     * 终端类型
     */
    private String terminalType;
    /**
     * 失败原因
     */
    private String failReason;
    /**
     * 是否冲正
     */
    private Boolean isReversed;
    /**
     * 银行通知冲退的时间
     */
    private String reverseTime;
    /**
     * 支行编码
     */
    private String branchBankCode;
    /**
     * 银行附言
     */
    private String comments;
    /**
     * 回单备注
     */
    private String receiptComments;
    /**
     * 订单备注
     */
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

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
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

    public String getReverseTime() {
        return reverseTime;
    }

    public void setReverseTime(String reverseTime) {
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
