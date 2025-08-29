package com.lianok.docking.balanceApply.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlBalanceApplyQueryApplyStatusResponse extends DockingResponseBase {

    private String merchantNo;
    private String requestNo;
    private String ledgerNo;
    private String status;

    private String type;

    private String receiverName;
    private String licenceNo;
    private String bankCode;
    private String bankCardNo;
    private String label;
    private String mobile;
    private String legalName;
    private String legalLicenceNo;
    private String receiverSignUrl;
    private String merchantSignUrl;
    private String auditOpinion;


    public String getMerchantNo() {
        return merchantNo;
    }
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getRequestNo() {
        return requestNo;
    }
    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getLedgerNo() {
        return ledgerNo;
    }
    public void setLedgerNo(String ledgerNo) {
        this.ledgerNo = ledgerNo;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getReceiverName() {
        return receiverName;
    }
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getLicenceNo() {
        return licenceNo;
    }
    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    public String getBankCode() {
        return bankCode;
    }
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }
    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLegalName() {
        return legalName;
    }
    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalLicenceNo() {
        return legalLicenceNo;
    }
    public void setLegalLicenceNo(String legalLicenceNo) {
        this.legalLicenceNo = legalLicenceNo;
    }

    public String getReceiverSignUrl() {
        return receiverSignUrl;
    }
    public void setReceiverSignUrl(String receiverSignUrl) {
        this.receiverSignUrl = receiverSignUrl;
    }

    public String getMerchantSignUrl() {
        return merchantSignUrl;
    }
    public void setMerchantSignUrl(String merchantSignUrl) {
        this.merchantSignUrl = merchantSignUrl;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }
    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }
}
