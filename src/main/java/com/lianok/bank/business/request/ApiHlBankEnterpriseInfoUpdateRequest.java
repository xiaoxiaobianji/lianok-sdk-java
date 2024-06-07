package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankEnterpriseInfoUpdateResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

import java.time.LocalDateTime;

/**
 * 企业基础信息修改
 *
 * @author lianok.com
 */
public class ApiHlBankEnterpriseInfoUpdateRequest extends AbstractDockingRequest {

    private String ip;
    /**
     * 修改时传入
     */
    private String businessNo;

    /**
     * 交易户名称
     */
    private String businessName;


    /**
     * 姓名
     */
    private String legalName;

    /**
     * 身份证类型
     */
    private String legalIdType;

    /**
     * 身份证编号
     */
    private String legalIdNo;

    /**
     * 证件有效期(开始时间)
     */
    private java.time.LocalDateTime legalIdStartDate;

    /**
     * 证件有效期(结束时间)/长期
     */
    private java.time.LocalDateTime legalIdEndDate;

    /**
     * 是否永久有效
     */
    private Boolean legalPermanent;

    /**
     * 身份证人像图片
     */
    private String legalIdFrontUrl;

    /**
     * 身份证国徽图片
     */
    private String legalIdBackUrl;

    /**
     * 企业联系电话
     */
    private String corpContractPhone;

    /**
     * 营业执照副本url
     */
    private String businessLicenceUrl;

    /**
     * 注册资本,单位元
     */
    private String registeredCapital;

    /**
     * 经营范围
     */
    private String businessScope;

    /**
     * 营业期限开始日期
     */
    private java.time.LocalDateTime businessLicenceStartDate;

    /**
     * 营业期限结束日期
     */
    private java.time.LocalDateTime businessLicenceEndDate;

    /**
     * 是否永久有效
     */
    private Boolean corpPermanent;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalIdType() {
        return legalIdType;
    }

    public void setLegalIdType(String legalIdType) {
        this.legalIdType = legalIdType;
    }

    public String getLegalIdNo() {
        return legalIdNo;
    }

    public void setLegalIdNo(String legalIdNo) {
        this.legalIdNo = legalIdNo;
    }

    public LocalDateTime getLegalIdStartDate() {
        return legalIdStartDate;
    }

    public void setLegalIdStartDate(LocalDateTime legalIdStartDate) {
        this.legalIdStartDate = legalIdStartDate;
    }

    public LocalDateTime getLegalIdEndDate() {
        return legalIdEndDate;
    }

    public void setLegalIdEndDate(LocalDateTime legalIdEndDate) {
        this.legalIdEndDate = legalIdEndDate;
    }

    public Boolean getLegalPermanent() {
        return legalPermanent;
    }

    public void setLegalPermanent(Boolean legalPermanent) {
        this.legalPermanent = legalPermanent;
    }

    public String getLegalIdFrontUrl() {
        return legalIdFrontUrl;
    }

    public void setLegalIdFrontUrl(String legalIdFrontUrl) {
        this.legalIdFrontUrl = legalIdFrontUrl;
    }

    public String getLegalIdBackUrl() {
        return legalIdBackUrl;
    }

    public void setLegalIdBackUrl(String legalIdBackUrl) {
        this.legalIdBackUrl = legalIdBackUrl;
    }

    public String getCorpContractPhone() {
        return corpContractPhone;
    }

    public void setCorpContractPhone(String corpContractPhone) {
        this.corpContractPhone = corpContractPhone;
    }

    public String getBusinessLicenceUrl() {
        return businessLicenceUrl;
    }

    public void setBusinessLicenceUrl(String businessLicenceUrl) {
        this.businessLicenceUrl = businessLicenceUrl;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public LocalDateTime getBusinessLicenceStartDate() {
        return businessLicenceStartDate;
    }

    public void setBusinessLicenceStartDate(LocalDateTime businessLicenceStartDate) {
        this.businessLicenceStartDate = businessLicenceStartDate;
    }

    public LocalDateTime getBusinessLicenceEndDate() {
        return businessLicenceEndDate;
    }

    public void setBusinessLicenceEndDate(LocalDateTime businessLicenceEndDate) {
        this.businessLicenceEndDate = businessLicenceEndDate;
    }

    public Boolean getCorpPermanent() {
        return corpPermanent;
    }

    public void setCorpPermanent(Boolean corpPermanent) {
        this.corpPermanent = corpPermanent;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.enterprise.info.update";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankEnterpriseInfoUpdateResponse.class;
    }
}
