package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankEnterpriseOpenResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * 企业账户开户
 *
 * @author lianok.com
 */
public class ApiHlBankEnterpriseOpenRequest extends AbstractDockingRequest {

    private String ip;
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
     * 身份证人像图片
     */
    private String legalIdFrontUrl;

    /**
     * 身份证国徽图片
     */
    private String legalIdBackUrl;

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
     * 注册地址省
     */
    private String registerProvince;

    /**
     * 注册地址市
     */
    private String registerCity;

    /**
     * 注册地址区
     */
    private String registerDistrict;

    /**
     * 注册详细地址
     */
    private String registerAddress;

    /**
     * 注册资本,单位元
     */
    private String registeredCapital;

    /**
     * 经营地址省
     */
    private String operatingProvince;

    /**
     * 经营地址市
     */
    private String operatingCity;

    /**
     * 经营地址区
     */
    private String operatingDistrict;

    /**
     * 经营详细地址
     */
    private String operatingAddress;

    /**
     * 经营范围
     */
    private String businessScope;

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
     * 税务登记号
     */
    private String taxRegNo;

    /**
     * 组织机构代码
     */
    private String orgNo;

    /**
     * 营业执照副本url
     */
    private String businessLicenceUrl;

    /**
     * 税务登记证url
     */
    private String taxCertUrl;

    /**
     * 组织机构代码证url
     */
    private String orgCertUrl;

    /**
     * 开户许可证url
     */
    private String openAcctUrl;

    /**
     * 委托授权书url
     */
    private String authUrl;

    /**
     * 企业委托授权书url
     */
    private String corpAuthUrl;

    /**
     * 其他审核图片1url
     */
    private String expPicUrl1;

    /**
     * 其他审核图片2url
     */
    private String expPicUrl2;

    /**
     * 其他审核图片3url
     */
    private String expPicUrl3;

    /**
     * 备注
     */
    private String corpRemark;

    /**
     * 受益人姓名
     */
    private String beneficiaryName;

    /**
     * 受益人证件类型
     */
    private String beneficiaryIdType;

    /**
     * 受益人身份证编号/证件号
     */
    private String beneficiaryIdNo;

    /**
     * 受益人证件有效期(开始时间)
     */
    private String beneficiaryIdStartDate;

    /**
     * 受益人证件有效期(结束时间)/长期
     */
    private String beneficiaryIdEndDate;

    /**
     * 受益人身份证永久有效
     */
    private Boolean beneficiaryPermanent;

    /**
     * 受益人地址
     */
    private String beneficiaryAddress;

    /**
     * 1-企业；2-个人
     */
    private String holdType;

    /**
     * 控股股东/实际控制人姓名
     */
    private String holdName;

    /**
     * 控股股东/实际控制人证件类型
     */
    private String holdIdType;

    /**
     * 控股股东/实际控制人身份证编号/证件号
     */
    private String holdIdNo;

    /**
     * 控股股东/实际控制人证件有效期(开始时间)
     */
    private String holdIdStartDate;

    /**
     * 控股股东/实际控制人证件有效期(结束时间)
     */
    private String holdIdEndDate;

    /**
     * 控股股东/实际控制人证件永久有效
     */
    private Boolean holdPermanent;

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

    /**
     * 经办人邮箱
     */
    private String operatorEmail;

    /**
     * 经办人身份证人像图片
     */
    private String operatorIdFrontUrl;

    /**
     * 经办人身份证国徽图片
     */
    private String operatorIdBackUrl;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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

    public String getRegisterProvince() {
        return registerProvince;
    }

    public void setRegisterProvince(String registerProvince) {
        this.registerProvince = registerProvince;
    }

    public String getRegisterCity() {
        return registerCity;
    }

    public void setRegisterCity(String registerCity) {
        this.registerCity = registerCity;
    }

    public String getRegisterDistrict() {
        return registerDistrict;
    }

    public void setRegisterDistrict(String registerDistrict) {
        this.registerDistrict = registerDistrict;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getOperatingProvince() {
        return operatingProvince;
    }

    public void setOperatingProvince(String operatingProvince) {
        this.operatingProvince = operatingProvince;
    }

    public String getOperatingCity() {
        return operatingCity;
    }

    public void setOperatingCity(String operatingCity) {
        this.operatingCity = operatingCity;
    }

    public String getOperatingDistrict() {
        return operatingDistrict;
    }

    public void setOperatingDistrict(String operatingDistrict) {
        this.operatingDistrict = operatingDistrict;
    }

    public String getOperatingAddress() {
        return operatingAddress;
    }

    public void setOperatingAddress(String operatingAddress) {
        this.operatingAddress = operatingAddress;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
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

    public String getTaxRegNo() {
        return taxRegNo;
    }

    public void setTaxRegNo(String taxRegNo) {
        this.taxRegNo = taxRegNo;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getBusinessLicenceUrl() {
        return businessLicenceUrl;
    }

    public void setBusinessLicenceUrl(String businessLicenceUrl) {
        this.businessLicenceUrl = businessLicenceUrl;
    }

    public String getTaxCertUrl() {
        return taxCertUrl;
    }

    public void setTaxCertUrl(String taxCertUrl) {
        this.taxCertUrl = taxCertUrl;
    }

    public String getOrgCertUrl() {
        return orgCertUrl;
    }

    public void setOrgCertUrl(String orgCertUrl) {
        this.orgCertUrl = orgCertUrl;
    }

    public String getOpenAcctUrl() {
        return openAcctUrl;
    }

    public void setOpenAcctUrl(String openAcctUrl) {
        this.openAcctUrl = openAcctUrl;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    public String getCorpAuthUrl() {
        return corpAuthUrl;
    }

    public void setCorpAuthUrl(String corpAuthUrl) {
        this.corpAuthUrl = corpAuthUrl;
    }

    public String getExpPicUrl1() {
        return expPicUrl1;
    }

    public void setExpPicUrl1(String expPicUrl1) {
        this.expPicUrl1 = expPicUrl1;
    }

    public String getExpPicUrl2() {
        return expPicUrl2;
    }

    public void setExpPicUrl2(String expPicUrl2) {
        this.expPicUrl2 = expPicUrl2;
    }

    public String getExpPicUrl3() {
        return expPicUrl3;
    }

    public void setExpPicUrl3(String expPicUrl3) {
        this.expPicUrl3 = expPicUrl3;
    }

    public String getCorpRemark() {
        return corpRemark;
    }

    public void setCorpRemark(String corpRemark) {
        this.corpRemark = corpRemark;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getBeneficiaryIdType() {
        return beneficiaryIdType;
    }

    public void setBeneficiaryIdType(String beneficiaryIdType) {
        this.beneficiaryIdType = beneficiaryIdType;
    }

    public String getBeneficiaryIdNo() {
        return beneficiaryIdNo;
    }

    public void setBeneficiaryIdNo(String beneficiaryIdNo) {
        this.beneficiaryIdNo = beneficiaryIdNo;
    }

    public String getBeneficiaryIdStartDate() {
        return beneficiaryIdStartDate;
    }

    public void setBeneficiaryIdStartDate(String beneficiaryIdStartDate) {
        this.beneficiaryIdStartDate = beneficiaryIdStartDate;
    }

    public String getBeneficiaryIdEndDate() {
        return beneficiaryIdEndDate;
    }

    public void setBeneficiaryIdEndDate(String beneficiaryIdEndDate) {
        this.beneficiaryIdEndDate = beneficiaryIdEndDate;
    }

    public Boolean getBeneficiaryPermanent() {
        return beneficiaryPermanent;
    }

    public void setBeneficiaryPermanent(Boolean beneficiaryPermanent) {
        this.beneficiaryPermanent = beneficiaryPermanent;
    }

    public String getBeneficiaryAddress() {
        return beneficiaryAddress;
    }

    public void setBeneficiaryAddress(String beneficiaryAddress) {
        this.beneficiaryAddress = beneficiaryAddress;
    }

    public String getHoldType() {
        return holdType;
    }

    public void setHoldType(String holdType) {
        this.holdType = holdType;
    }

    public String getHoldName() {
        return holdName;
    }

    public void setHoldName(String holdName) {
        this.holdName = holdName;
    }

    public String getHoldIdType() {
        return holdIdType;
    }

    public void setHoldIdType(String holdIdType) {
        this.holdIdType = holdIdType;
    }

    public String getHoldIdNo() {
        return holdIdNo;
    }

    public void setHoldIdNo(String holdIdNo) {
        this.holdIdNo = holdIdNo;
    }

    public String getHoldIdStartDate() {
        return holdIdStartDate;
    }

    public void setHoldIdStartDate(String holdIdStartDate) {
        this.holdIdStartDate = holdIdStartDate;
    }

    public String getHoldIdEndDate() {
        return holdIdEndDate;
    }

    public void setHoldIdEndDate(String holdIdEndDate) {
        this.holdIdEndDate = holdIdEndDate;
    }

    public Boolean getHoldPermanent() {
        return holdPermanent;
    }

    public void setHoldPermanent(Boolean holdPermanent) {
        this.holdPermanent = holdPermanent;
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

    public String getOperatorEmail() {
        return operatorEmail;
    }

    public void setOperatorEmail(String operatorEmail) {
        this.operatorEmail = operatorEmail;
    }

    public String getOperatorIdFrontUrl() {
        return operatorIdFrontUrl;
    }

    public void setOperatorIdFrontUrl(String operatorIdFrontUrl) {
        this.operatorIdFrontUrl = operatorIdFrontUrl;
    }

    public String getOperatorIdBackUrl() {
        return operatorIdBackUrl;
    }

    public void setOperatorIdBackUrl(String operatorIdBackUrl) {
        this.operatorIdBackUrl = operatorIdBackUrl;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.enterprise.open";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankEnterpriseOpenResponse.class;
    }
}
