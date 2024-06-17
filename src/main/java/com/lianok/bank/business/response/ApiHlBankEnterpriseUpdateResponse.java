package com.lianok.bank.business.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * 企业账户驳回修改
 *
 * @author lianok.com
 */
public class ApiHlBankEnterpriseUpdateResponse extends DockingResponseBase {

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
     * 审核状态
     * 0-待审核 1-审核中 4-审核成功 5-审核驳回 6-待打款验证 7-打款验证失败
     */
    private Integer status;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFailMessage() {
        return failMessage;
    }

    public void setFailMessage(String failMessage) {
        this.failMessage = failMessage;
    }
}
