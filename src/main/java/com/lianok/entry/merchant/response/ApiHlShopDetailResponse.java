package com.lianok.entry.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author lianok.com
 */
public class ApiHlShopDetailResponse extends DockingResponseBase {

    private String merchantNo;
    private String channelCode;
    private String agentNo;
    private String agentName;
    private String merchantName;
    private String merchantLoginAccount;
    private Integer merchantIsDisabled;
    private String relationSettleMerchant;
    private String contacter;
    private String phone;
    private String provinceCode;
    private String cityCode;
    private String areaCode;
    private String address;
    private String merchantType;
    private String merchantLicenseType;
    private String merchantLicenseTypeDesc;
    private String merchantLicenseFullName;
    private String merchantLicenseNo;
    private LocalDate merchantLicenseBegDate;
    private LocalDate merchantLicenseEndDate;
    private String lawPerson;
    private Integer lawCertificatesType;
    private String lawIdCard;
    private String lawMobile;
    private String lawAddress;
    private LocalDate idCardExpireDate;
    private LocalDate idCardBeginDate;
    private String settleType;
    private String bankAccountName;
    private String bankCardNo;
    private String bankArea;
    private String bankBelongBankCode;
    private String bankProvinceCode;
    private String bankCityCode;
    private String bankContactLine;
    private String bankBranchName;
    private String bankMobile;
    private String nonLawIdCardNo;
    private BigDecimal wechatPayRate;
    private BigDecimal alipayRate;
    private BigDecimal cloudPayGt1000Rate;
    private BigDecimal cloudPayLe1000Rate;
    private String scanCodeQuickPayStatus;
    private String scanCodeQuickPayType;
    private BigDecimal scanCodeQuickPayRate;
    private Integer isDisabled;
    private Integer status;
    private String channelMerchantNo;
    private String mccCode;
    private Long lng;
    private Long lat;
    private LocalDateTime createTime;
    private String fatherCode;
    private String grandpaCode;
    private String rejectReason;
    private String qrCodeUrl;
    private String pureOssUrl;
    private String settleCardStatus;
    private String settleCardReason;
    private Integer rateStatus;
    private Integer auditStatus;
    private Integer shortNameStatus;
    private String shortNameReason;
    private Integer baseInfoStatus;
    private Integer qualificationStatus;
    private String linkman;
    private String linkmanPhone;
    private String linkmanIdCardNo;
    private String email;
    private String alipayAccount;
    private String wechatAppletAppid;
    private String orgCode;
    private LocalDate orgPeriodBegin;
    private LocalDate orgPeriodEnd;
    private String signUrl;
    private Boolean isThreeCertInOne;
    private String cloudPayStatus;
    private String linkmanCertificatesType;
    private String idCardAddress;
    private LocalDate linkmanIdCardBeginDate;
    private LocalDate linkmanIdCardExpireDate;
    private String settleMethod;


    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getAgentNo() {
        return agentNo;
    }

    public void setAgentNo(String agentNo) {
        this.agentNo = agentNo;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantLoginAccount() {
        return merchantLoginAccount;
    }

    public void setMerchantLoginAccount(String merchantLoginAccount) {
        this.merchantLoginAccount = merchantLoginAccount;
    }

    public Integer getMerchantIsDisabled() {
        return merchantIsDisabled;
    }

    public void setMerchantIsDisabled(Integer merchantIsDisabled) {
        this.merchantIsDisabled = merchantIsDisabled;
    }

    public String getRelationSettleMerchant() {
        return relationSettleMerchant;
    }

    public void setRelationSettleMerchant(String relationSettleMerchant) {
        this.relationSettleMerchant = relationSettleMerchant;
    }

    public String getContacter() {
        return contacter;
    }

    public void setContacter(String contacter) {
        this.contacter = contacter;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

    public String getMerchantLicenseType() {
        return merchantLicenseType;
    }

    public void setMerchantLicenseType(String merchantLicenseType) {
        this.merchantLicenseType = merchantLicenseType;
    }

    public String getMerchantLicenseTypeDesc() {
        return merchantLicenseTypeDesc;
    }

    public void setMerchantLicenseTypeDesc(String merchantLicenseTypeDesc) {
        this.merchantLicenseTypeDesc = merchantLicenseTypeDesc;
    }

    public String getMerchantLicenseFullName() {
        return merchantLicenseFullName;
    }

    public void setMerchantLicenseFullName(String merchantLicenseFullName) {
        this.merchantLicenseFullName = merchantLicenseFullName;
    }

    public String getMerchantLicenseNo() {
        return merchantLicenseNo;
    }

    public void setMerchantLicenseNo(String merchantLicenseNo) {
        this.merchantLicenseNo = merchantLicenseNo;
    }

    public LocalDate getMerchantLicenseBegDate() {
        return merchantLicenseBegDate;
    }

    public void setMerchantLicenseBegDate(LocalDate merchantLicenseBegDate) {
        this.merchantLicenseBegDate = merchantLicenseBegDate;
    }

    public LocalDate getMerchantLicenseEndDate() {
        return merchantLicenseEndDate;
    }

    public void setMerchantLicenseEndDate(LocalDate merchantLicenseEndDate) {
        this.merchantLicenseEndDate = merchantLicenseEndDate;
    }

    public String getLawPerson() {
        return lawPerson;
    }

    public void setLawPerson(String lawPerson) {
        this.lawPerson = lawPerson;
    }

    public Integer getLawCertificatesType() {
        return lawCertificatesType;
    }

    public void setLawCertificatesType(Integer lawCertificatesType) {
        this.lawCertificatesType = lawCertificatesType;
    }

    public String getLawIdCard() {
        return lawIdCard;
    }

    public void setLawIdCard(String lawIdCard) {
        this.lawIdCard = lawIdCard;
    }

    public String getLawMobile() {
        return lawMobile;
    }

    public void setLawMobile(String lawMobile) {
        this.lawMobile = lawMobile;
    }

    public String getLawAddress() {
        return lawAddress;
    }

    public void setLawAddress(String lawAddress) {
        this.lawAddress = lawAddress;
    }

    public LocalDate getIdCardExpireDate() {
        return idCardExpireDate;
    }

    public void setIdCardExpireDate(LocalDate idCardExpireDate) {
        this.idCardExpireDate = idCardExpireDate;
    }

    public LocalDate getIdCardBeginDate() {
        return idCardBeginDate;
    }

    public void setIdCardBeginDate(LocalDate idCardBeginDate) {
        this.idCardBeginDate = idCardBeginDate;
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBankArea() {
        return bankArea;
    }

    public void setBankArea(String bankArea) {
        this.bankArea = bankArea;
    }

    public String getBankBelongBankCode() {
        return bankBelongBankCode;
    }

    public void setBankBelongBankCode(String bankBelongBankCode) {
        this.bankBelongBankCode = bankBelongBankCode;
    }

    public String getBankProvinceCode() {
        return bankProvinceCode;
    }

    public void setBankProvinceCode(String bankProvinceCode) {
        this.bankProvinceCode = bankProvinceCode;
    }

    public String getBankCityCode() {
        return bankCityCode;
    }

    public void setBankCityCode(String bankCityCode) {
        this.bankCityCode = bankCityCode;
    }

    public String getBankContactLine() {
        return bankContactLine;
    }

    public void setBankContactLine(String bankContactLine) {
        this.bankContactLine = bankContactLine;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public String getBankMobile() {
        return bankMobile;
    }

    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile;
    }

    public String getNonLawIdCardNo() {
        return nonLawIdCardNo;
    }

    public void setNonLawIdCardNo(String nonLawIdCardNo) {
        this.nonLawIdCardNo = nonLawIdCardNo;
    }

    public BigDecimal getWechatPayRate() {
        return wechatPayRate;
    }

    public void setWechatPayRate(BigDecimal wechatPayRate) {
        this.wechatPayRate = wechatPayRate;
    }

    public BigDecimal getAlipayRate() {
        return alipayRate;
    }

    public void setAlipayRate(BigDecimal alipayRate) {
        this.alipayRate = alipayRate;
    }

    public BigDecimal getCloudPayGt1000Rate() {
        return cloudPayGt1000Rate;
    }

    public void setCloudPayGt1000Rate(BigDecimal cloudPayGt1000Rate) {
        this.cloudPayGt1000Rate = cloudPayGt1000Rate;
    }

    public BigDecimal getCloudPayLe1000Rate() {
        return cloudPayLe1000Rate;
    }

    public void setCloudPayLe1000Rate(BigDecimal cloudPayLe1000Rate) {
        this.cloudPayLe1000Rate = cloudPayLe1000Rate;
    }

    public String getScanCodeQuickPayStatus() {
        return scanCodeQuickPayStatus;
    }

    public void setScanCodeQuickPayStatus(String scanCodeQuickPayStatus) {
        this.scanCodeQuickPayStatus = scanCodeQuickPayStatus;
    }

    public String getScanCodeQuickPayType() {
        return scanCodeQuickPayType;
    }

    public void setScanCodeQuickPayType(String scanCodeQuickPayType) {
        this.scanCodeQuickPayType = scanCodeQuickPayType;
    }

    public BigDecimal getScanCodeQuickPayRate() {
        return scanCodeQuickPayRate;
    }

    public void setScanCodeQuickPayRate(BigDecimal scanCodeQuickPayRate) {
        this.scanCodeQuickPayRate = scanCodeQuickPayRate;
    }

    public Integer getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getChannelMerchantNo() {
        return channelMerchantNo;
    }

    public void setChannelMerchantNo(String channelMerchantNo) {
        this.channelMerchantNo = channelMerchantNo;
    }

    public String getMccCode() {
        return mccCode;
    }

    public void setMccCode(String mccCode) {
        this.mccCode = mccCode;
    }

    public Long getLng() {
        return lng;
    }

    public void setLng(Long lng) {
        this.lng = lng;
    }

    public Long getLat() {
        return lat;
    }

    public void setLat(Long lat) {
        this.lat = lat;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getFatherCode() {
        return fatherCode;
    }

    public void setFatherCode(String fatherCode) {
        this.fatherCode = fatherCode;
    }

    public String getGrandpaCode() {
        return grandpaCode;
    }

    public void setGrandpaCode(String grandpaCode) {
        this.grandpaCode = grandpaCode;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getQrCodeUrl() {
        return qrCodeUrl;
    }

    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
    }

    public String getPureOssUrl() {
        return pureOssUrl;
    }

    public void setPureOssUrl(String pureOssUrl) {
        this.pureOssUrl = pureOssUrl;
    }

    public String getSettleCardStatus() {
        return settleCardStatus;
    }

    public void setSettleCardStatus(String settleCardStatus) {
        this.settleCardStatus = settleCardStatus;
    }

    public String getSettleCardReason() {
        return settleCardReason;
    }

    public void setSettleCardReason(String settleCardReason) {
        this.settleCardReason = settleCardReason;
    }

    public Integer getRateStatus() {
        return rateStatus;
    }

    public void setRateStatus(Integer rateStatus) {
        this.rateStatus = rateStatus;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getShortNameStatus() {
        return shortNameStatus;
    }

    public void setShortNameStatus(Integer shortNameStatus) {
        this.shortNameStatus = shortNameStatus;
    }

    public String getShortNameReason() {
        return shortNameReason;
    }

    public void setShortNameReason(String shortNameReason) {
        this.shortNameReason = shortNameReason;
    }

    public Integer getBaseInfoStatus() {
        return baseInfoStatus;
    }

    public void setBaseInfoStatus(Integer baseInfoStatus) {
        this.baseInfoStatus = baseInfoStatus;
    }

    public Integer getQualificationStatus() {
        return qualificationStatus;
    }

    public void setQualificationStatus(Integer qualificationStatus) {
        this.qualificationStatus = qualificationStatus;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkmanPhone() {
        return linkmanPhone;
    }

    public void setLinkmanPhone(String linkmanPhone) {
        this.linkmanPhone = linkmanPhone;
    }

    public String getLinkmanIdCardNo() {
        return linkmanIdCardNo;
    }

    public void setLinkmanIdCardNo(String linkmanIdCardNo) {
        this.linkmanIdCardNo = linkmanIdCardNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlipayAccount() {
        return alipayAccount;
    }

    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }

    public String getWechatAppletAppid() {
        return wechatAppletAppid;
    }

    public void setWechatAppletAppid(String wechatAppletAppid) {
        this.wechatAppletAppid = wechatAppletAppid;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public LocalDate getOrgPeriodBegin() {
        return orgPeriodBegin;
    }

    public void setOrgPeriodBegin(LocalDate orgPeriodBegin) {
        this.orgPeriodBegin = orgPeriodBegin;
    }

    public LocalDate getOrgPeriodEnd() {
        return orgPeriodEnd;
    }

    public void setOrgPeriodEnd(LocalDate orgPeriodEnd) {
        this.orgPeriodEnd = orgPeriodEnd;
    }

    public String getSignUrl() {
        return signUrl;
    }

    public void setSignUrl(String signUrl) {
        this.signUrl = signUrl;
    }

    public Boolean getThreeCertInOne() {
        return isThreeCertInOne;
    }

    public void setThreeCertInOne(Boolean threeCertInOne) {
        isThreeCertInOne = threeCertInOne;
    }

    public String getCloudPayStatus() {
        return cloudPayStatus;
    }

    public void setCloudPayStatus(String cloudPayStatus) {
        this.cloudPayStatus = cloudPayStatus;
    }

    public String getLinkmanCertificatesType() {
        return linkmanCertificatesType;
    }

    public void setLinkmanCertificatesType(String linkmanCertificatesType) {
        this.linkmanCertificatesType = linkmanCertificatesType;
    }

    public String getIdCardAddress() {
        return idCardAddress;
    }

    public void setIdCardAddress(String idCardAddress) {
        this.idCardAddress = idCardAddress;
    }

    public LocalDate getLinkmanIdCardBeginDate() {
        return linkmanIdCardBeginDate;
    }

    public void setLinkmanIdCardBeginDate(LocalDate linkmanIdCardBeginDate) {
        this.linkmanIdCardBeginDate = linkmanIdCardBeginDate;
    }

    public LocalDate getLinkmanIdCardExpireDate() {
        return linkmanIdCardExpireDate;
    }

    public void setLinkmanIdCardExpireDate(LocalDate linkmanIdCardExpireDate) {
        this.linkmanIdCardExpireDate = linkmanIdCardExpireDate;
    }

    public String getSettleMethod() {
        return settleMethod;
    }

    public void setSettleMethod(String settleMethod) {
        this.settleMethod = settleMethod;
    }
}
