package com.lianok.docking.fund.pay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.fund.pay.response.ApiHlFundAccountOrderCreateResponse;

import java.math.BigDecimal;

/**
 * 代付-个人
 *
 * @author lianok.com
 */
public class ApiHlFundAccountOrderCreateRequest extends AbstractDockingRequest {

    /**
     * 对接商系统订单号
     */
    private String businessOrderNo;
    /**
     * 付款金额
     */
    private BigDecimal payAmount;
    /**
     * 商户ID
     */
    private String merchantNo;
    /**
     * 操作者账号
     */
    private String operatorAccount;
    /**
     * 通道标识
     */
    private String channelCode;
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
     * 支行编码
     */
    private String branchBankCode;
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
     * 银行附言
     */
    private String comments;
    /**
     * 订单备注
     */
    private String remark;
    /**
     * 回单备注
     */
    private String receiptComments;
    /**
     * 异步通知地址
     */
    private String notifyUrl;

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

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

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
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

    public String getBranchBankCode() {
        return branchBankCode;
    }

    public void setBranchBankCode(String branchBankCode) {
        this.branchBankCode = branchBankCode;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReceiptComments() {
        return receiptComments;
    }

    public void setReceiptComments(String receiptComments) {
        this.receiptComments = receiptComments;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    @Override
    public String getResource() {
        return "api.hl.fund.account.order.create";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlFundAccountOrderCreateResponse.class;
    }
}
