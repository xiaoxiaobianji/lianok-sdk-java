package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankV2OpenResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlBankV2OpenRequest extends AbstractDockingRequest {

    /**
     * 账户类型
     * person=个人个体工商=individual,企业商户=enterprise
     */
    private String businessType;
    /**
     * 交易户名称
     */
    private String businessName;

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
     * 预留手机号
     */
    private String bankCardMobile;


    /**
     * 姓名
     */
    private String userName;

    /**
     * 身份证类型
     */
    private String userIdType;

    /**
     * 身份证编号
     */
    private String userIdNo;

    /**
     * 证件有效期(开始时间)
     */
    private String userIdStartDate;

    /**
     * 证件有效期(结束时间)/长期
     */
    private String userIdEndDate;

    /**
     * 身份证永久有效
     */
    private Boolean userPermanent;

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
    private String legalIdStartDate;

    /**
     * 证件有效期(结束时间)/长期
     */
    private String legalIdEndDate;

    /**
     * 0-结束时间点 1-永久有效
     */
    private Boolean legalPermanent;

    /**
     * 企业名称
     */
    private String corpName;

    /**
     * 企业证件类别 1-三证三号；2-三证合一；0-个体工商户；
     */
    private String corpType;

    /**
     * 证件类型 20-统一社会信用代码
     */
    private String corpIdType;

    /**
     * 统一社会信用代码
     */
    private String businessLicenceNo;

    /**
     * 营业期限开始日期
     */
    private String businessLicenceStartDate;

    /**
     * 营业期限结束日期
     */
    private String businessLicenceEndDate;

    /**
     * 营业执照是否永久有效
     */
    private Boolean corpPermanent;

    /**
     * 企业联系电话
     */
    private String corpContractPhone;

    /**
     * 经办人姓名
     */
    private String operatorName;

    /**
     * 经办人身份证类型
     * 固定值：10
     */
    private String operatorIdType;

    /**
     * 经办人身份证编号
     */
    private String operatorIdNo;

    /**
     * 经办人证件有效期(开始时间)
     */
    private String operatorIdStartDate;

    /**
     * 经办人证件有效期(结束时间)
     */
    private String operatorIdEndDate;

    /**
     * 经办人身份证永久有效
     */
    private Boolean operatorPermanent;

    /**
     * 经办人手机号
     */
    private String operatorPhone;

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

    public String getBankCardMobile() {
        return bankCardMobile;
    }

    public void setBankCardMobile(String bankCardMobile) {
        this.bankCardMobile = bankCardMobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserIdType() {
        return userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getUserIdNo() {
        return userIdNo;
    }

    public void setUserIdNo(String userIdNo) {
        this.userIdNo = userIdNo;
    }

    public String getUserIdStartDate() {
        return userIdStartDate;
    }

    public void setUserIdStartDate(String userIdStartDate) {
        this.userIdStartDate = userIdStartDate;
    }

    public String getUserIdEndDate() {
        return userIdEndDate;
    }

    public void setUserIdEndDate(String userIdEndDate) {
        this.userIdEndDate = userIdEndDate;
    }

    public Boolean getUserPermanent() {
        return userPermanent;
    }

    public void setUserPermanent(Boolean userPermanent) {
        this.userPermanent = userPermanent;
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

    public String getLegalIdStartDate() {
        return legalIdStartDate;
    }

    public void setLegalIdStartDate(String legalIdStartDate) {
        this.legalIdStartDate = legalIdStartDate;
    }

    public String getLegalIdEndDate() {
        return legalIdEndDate;
    }

    public void setLegalIdEndDate(String legalIdEndDate) {
        this.legalIdEndDate = legalIdEndDate;
    }

    public Boolean getLegalPermanent() {
        return legalPermanent;
    }

    public void setLegalPermanent(Boolean legalPermanent) {
        this.legalPermanent = legalPermanent;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getCorpType() {
        return corpType;
    }

    public void setCorpType(String corpType) {
        this.corpType = corpType;
    }

    public String getCorpIdType() {
        return corpIdType;
    }

    public void setCorpIdType(String corpIdType) {
        this.corpIdType = corpIdType;
    }

    public String getBusinessLicenceNo() {
        return businessLicenceNo;
    }

    public void setBusinessLicenceNo(String businessLicenceNo) {
        this.businessLicenceNo = businessLicenceNo;
    }

    public String getBusinessLicenceStartDate() {
        return businessLicenceStartDate;
    }

    public void setBusinessLicenceStartDate(String businessLicenceStartDate) {
        this.businessLicenceStartDate = businessLicenceStartDate;
    }

    public String getBusinessLicenceEndDate() {
        return businessLicenceEndDate;
    }

    public void setBusinessLicenceEndDate(String businessLicenceEndDate) {
        this.businessLicenceEndDate = businessLicenceEndDate;
    }

    public Boolean getCorpPermanent() {
        return corpPermanent;
    }

    public void setCorpPermanent(Boolean corpPermanent) {
        this.corpPermanent = corpPermanent;
    }

    public String getCorpContractPhone() {
        return corpContractPhone;
    }

    public void setCorpContractPhone(String corpContractPhone) {
        this.corpContractPhone = corpContractPhone;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorIdType() {
        return operatorIdType;
    }

    public void setOperatorIdType(String operatorIdType) {
        this.operatorIdType = operatorIdType;
    }

    public String getOperatorIdNo() {
        return operatorIdNo;
    }

    public void setOperatorIdNo(String operatorIdNo) {
        this.operatorIdNo = operatorIdNo;
    }

    public String getOperatorIdStartDate() {
        return operatorIdStartDate;
    }

    public void setOperatorIdStartDate(String operatorIdStartDate) {
        this.operatorIdStartDate = operatorIdStartDate;
    }

    public String getOperatorIdEndDate() {
        return operatorIdEndDate;
    }

    public void setOperatorIdEndDate(String operatorIdEndDate) {
        this.operatorIdEndDate = operatorIdEndDate;
    }

    public Boolean getOperatorPermanent() {
        return operatorPermanent;
    }

    public void setOperatorPermanent(Boolean operatorPermanent) {
        this.operatorPermanent = operatorPermanent;
    }

    public String getOperatorPhone() {
        return operatorPhone;
    }

    public void setOperatorPhone(String operatorPhone) {
        this.operatorPhone = operatorPhone;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.v2.open";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankV2OpenResponse.class;
    }
}
