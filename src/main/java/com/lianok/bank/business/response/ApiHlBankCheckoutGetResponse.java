package com.lianok.bank.business.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 提现详情
 *
 * @author lianok.com
 */
public class ApiHlBankCheckoutGetResponse extends DockingResponseBase {

    /**
     * 集团id
     */
    private Long firmId;

    /**
     * 银行类型，suning/wangshang
     */
    private String bankType;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 交易账户编号
     */
    private String businessNo;

    /**
     * 银行账户
     */
    private String businessBankAccount;

    /**
     * 银行卡号
     */
    private String bankCardNo;

    /**
     * 开户名
     */
    private String bankCardName;

    /**
     * 联行号
     */
    private String bankNo;

    /**
     * 支行名称
     */
    private String bankName;

    /**
     * 提现时间
     */
    private java.time.LocalDateTime checkoutTime;

    /**
     * 提现金额
     */
    private java.math.BigDecimal checkoutAmount;

    /**
     * 成功时间
     */
    private java.time.LocalDateTime successTime;

    /**
     * 摘要
     */
    private String memo;

    /**
     * 手续费金额
     */
    private java.math.BigDecimal feeAmount;

    /**
     * 0提现中 1-成功 2-失败 3-未提现 4-已提交(待确认)
     */
    private Integer status;

    /**
     * 失败原因
     */
    private String failMsg;

    public Long getFirmId() {
        return firmId;
    }

    public void setFirmId(Long firmId) {
        this.firmId = firmId;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getBusinessBankAccount() {
        return businessBankAccount;
    }

    public void setBusinessBankAccount(String businessBankAccount) {
        this.businessBankAccount = businessBankAccount;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBankCardName() {
        return bankCardName;
    }

    public void setBankCardName(String bankCardName) {
        this.bankCardName = bankCardName;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public LocalDateTime getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(LocalDateTime checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public BigDecimal getCheckoutAmount() {
        return checkoutAmount;
    }

    public void setCheckoutAmount(BigDecimal checkoutAmount) {
        this.checkoutAmount = checkoutAmount;
    }

    public LocalDateTime getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(LocalDateTime successTime) {
        this.successTime = successTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFailMsg() {
        return failMsg;
    }

    public void setFailMsg(String failMsg) {
        this.failMsg = failMsg;
    }
}
