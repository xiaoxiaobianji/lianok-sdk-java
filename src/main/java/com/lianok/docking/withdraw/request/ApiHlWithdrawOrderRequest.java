package com.lianok.docking.withdraw.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.withdraw.response.ApiHlWithdrawCardListResponse;
import com.lianok.docking.withdraw.response.ApiHlWithdrawOrderResponse;

import java.math.BigDecimal;

/**
 * 易分账-发起提现
 *
 * @author lianok.com
 */
public class ApiHlWithdrawOrderRequest extends AbstractDockingRequest {

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

    private String businessOrderNo;

    private String receiveType;

    private BigDecimal orderAmount;

    private String bankCardId;

    private String bankAccountNo;

    private String remark;

    private String terminalType;

    private String feeDeductType;

    private String accountType;

    private String withdrawModel;

    private String macAddress;



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

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public String getReceiveType() {
        return receiveType;
    }

    public void setReceiveType(String receiveType) {
        this.receiveType = receiveType;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(String bankCardId) {
        this.bankCardId = bankCardId;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getFeeDeductType() {
        return feeDeductType;
    }

    public void setFeeDeductType(String feeDeductType) {
        this.feeDeductType = feeDeductType;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getWithdrawModel() {
        return withdrawModel;
    }

    public void setWithdrawModel(String withdrawModel) {
        this.withdrawModel = withdrawModel;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    @Override
    public String getResource() {
        return "api.hl.withdraw.order";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlWithdrawOrderResponse.class;
    }
}
