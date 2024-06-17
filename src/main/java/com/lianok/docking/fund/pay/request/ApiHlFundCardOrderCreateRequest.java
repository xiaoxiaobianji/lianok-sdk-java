package com.lianok.docking.fund.pay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.fund.pay.response.ApiHlFundCardOrderCreateResponse;

import java.math.BigDecimal;

/**
 * 代付-打款到银行卡
 *
 * @author lianok.com
 */
public class ApiHlFundCardOrderCreateRequest extends AbstractDockingRequest {

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
     * 转账类型
     */
    private Integer orderType;
    /**
     * 银行账号
     */
    private String receiverAccountNo;
    /**
     * 开户名
     */
    private String receiverAccountName;
    /**
     * 开户行编号，对公必填
     */
    private String receiverBankCode;
    /**
     * 支行编码，对公必填
     */
    private String branchBankCode;
    /**
     * 收款方账户类型
     */
    private String bankAccountType;
    /**
     * 证件编号，对私必填
     */
    private String idNo;
    /**
     * 证件类型，对私必填
     */
    private String idType;
    /**
     * 证件有效开始时间，对私必填
     * 格式：yyyy-MM-dd
     */
    private String idBeginDate;
    /**
     * 证件有效到期时间，对私必填
     * 格式：yyyy-MM-dd
     */
    private String idEndDate;
    /**
     * 银行附言
     */
    private String comments;
    /**
     * 订单备注
     */
    private String remark;
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

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
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

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdBeginDate() {
        return idBeginDate;
    }

    public void setIdBeginDate(String idBeginDate) {
        this.idBeginDate = idBeginDate;
    }

    public String getIdEndDate() {
        return idEndDate;
    }

    public void setIdEndDate(String idEndDate) {
        this.idEndDate = idEndDate;
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

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    @Override
    public String getResource() {
        return "api.hl.fund.card.order.create";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlFundCardOrderCreateResponse.class;
    }
}
