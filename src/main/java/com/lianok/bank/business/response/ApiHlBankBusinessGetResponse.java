package com.lianok.bank.business.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;

/**
 * 交易账户详情
 *
 * @author lianok.com
 */
public class ApiHlBankBusinessGetResponse extends DockingResponseBase {

    /**
     * 集团id
     */
    private Long firmId;

    /**
     * 交易账户编号
     */
    private String businessNo;

    /**
     * 银行类型，suning/wangshang
     */
    private String bankType;

    /**
     * 商户类型，person=个人个体工商=individual,企业商户=enterprise
     */
    private String businessType;

    /**
     * 交易户名称
     */
    private String businessName;

    /**
     * 银行账户
     */
    private String businessBankAccount;

    /**
     * 保证金(冲退/在途)金额(单位:元)
     */
    private java.math.BigDecimal accountDepositAmount;

    /**
     * 账户正常金额(单位:元)
     */
    private java.math.BigDecimal accountNormalAmount;

    /**
     * 账户冻结金额(单位:元)
     */
    private java.math.BigDecimal accountBlockAmount;

    /**
     * 入件审核状态0-待审核 3-审核中 4-审核成功 5-审核驳回 6-待打款验证 7-打款验证失败
     */
    private Integer contractStatus;

    /**
     * 失败原因
     */
    private String failMessage;

    public Long getFirmId() {
        return firmId;
    }

    public void setFirmId(Long firmId) {
        this.firmId = firmId;
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessBankAccount() {
        return businessBankAccount;
    }

    public void setBusinessBankAccount(String businessBankAccount) {
        this.businessBankAccount = businessBankAccount;
    }

    public BigDecimal getAccountDepositAmount() {
        return accountDepositAmount;
    }

    public void setAccountDepositAmount(BigDecimal accountDepositAmount) {
        this.accountDepositAmount = accountDepositAmount;
    }

    public BigDecimal getAccountNormalAmount() {
        return accountNormalAmount;
    }

    public void setAccountNormalAmount(BigDecimal accountNormalAmount) {
        this.accountNormalAmount = accountNormalAmount;
    }

    public BigDecimal getAccountBlockAmount() {
        return accountBlockAmount;
    }

    public void setAccountBlockAmount(BigDecimal accountBlockAmount) {
        this.accountBlockAmount = accountBlockAmount;
    }

    public Integer getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
    }

    public String getFailMessage() {
        return failMessage;
    }

    public void setFailMessage(String failMessage) {
        this.failMessage = failMessage;
    }
}
