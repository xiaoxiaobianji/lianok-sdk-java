package com.lianok.docking.merchant.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.merchant.response.ApiHlShopEntryResponse;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 商户进件
 * <p>
 * 对接商可通过此接口发起商户进件，商户资料被驳回时，也调用此接口再次发起进件;
 */
public class ApiHlShopEntryRequest extends AbstractDockingRequest {

    private String channelCode;
    private String notifyUrl;
    private String loginAccount;
    private Integer entryType;
    private String merchantType;
    private String lawPerson;
    private String lawIdCard;
    private String idCardPortraitImg;
    private String idCardEmblemImg;
    private LocalDate idCardExpireDate;
    private LocalDate idCardBeginDate;
    private Integer lawCertificatesType;
    private String merchantLicenseFullName;
    private String merchantLicenseImg;
    private String merchantLicenseNo;
    private String merchantLicenseAddress;
    private LocalDate merchantLicenseBegDate;
    private LocalDate merchantLicenseEndDate;
    private String merchantName;
    private String merchantShortName;
    private String phone;
    private String provinceCode;
    private String cityCode;
    private String areaCode;
    private String address;
    private String merchantImg;
    private String merchantFaceImg;
    private String merchantInnerImg;
    @JSONField(name = "merchantCashdeskImg")
    private String merchantCashDeskImg;
    private String mccCode;
    private String consignmentImg;
    private String settleType;
    private String bankAccountName;
    private String bankContactLine;
    private String bankCardNo;
    private String bankName;
    private String bankBranchName;
    private String bankMobile;
    private String bankCardImg;
    private String bankArea;
    private String bankOpenAccountLicenseImg;
    private String nonLawIdCardPortraitImg;
    private String nonLawIdCardEmblemImg;
    private String nonLawSettleAuthImg;
    private String nonLawIdCardNo;
    private BigDecimal wechatPayRate;
    private BigDecimal alipayRate;
    private String cloudPayStatus;
    private BigDecimal cloudPayLe1000Rate;
    private BigDecimal cloudPayGt1000Rate;

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public Integer getEntryType() {
        return entryType;
    }

    public void setEntryType(Integer entryType) {
        this.entryType = entryType;
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

    public String getLawPerson() {
        return lawPerson;
    }

    public void setLawPerson(String lawPerson) {
        this.lawPerson = lawPerson;
    }

    public String getLawIdCard() {
        return lawIdCard;
    }

    public void setLawIdCard(String lawIdCard) {
        this.lawIdCard = lawIdCard;
    }

    public String getIdCardPortraitImg() {
        return idCardPortraitImg;
    }

    public void setIdCardPortraitImg(String idCardPortraitImg) {
        this.idCardPortraitImg = idCardPortraitImg;
    }

    public String getIdCardEmblemImg() {
        return idCardEmblemImg;
    }

    public void setIdCardEmblemImg(String idCardEmblemImg) {
        this.idCardEmblemImg = idCardEmblemImg;
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

    public Integer getLawCertificatesType() {
        return lawCertificatesType;
    }

    public void setLawCertificatesType(Integer lawCertificatesType) {
        this.lawCertificatesType = lawCertificatesType;
    }

    public String getMerchantLicenseFullName() {
        return merchantLicenseFullName;
    }

    public void setMerchantLicenseFullName(String merchantLicenseFullName) {
        this.merchantLicenseFullName = merchantLicenseFullName;
    }

    public String getMerchantLicenseImg() {
        return merchantLicenseImg;
    }

    public void setMerchantLicenseImg(String merchantLicenseImg) {
        this.merchantLicenseImg = merchantLicenseImg;
    }

    public String getMerchantLicenseNo() {
        return merchantLicenseNo;
    }

    public void setMerchantLicenseNo(String merchantLicenseNo) {
        this.merchantLicenseNo = merchantLicenseNo;
    }

    public String getMerchantLicenseAddress() {
        return merchantLicenseAddress;
    }

    public void setMerchantLicenseAddress(String merchantLicenseAddress) {
        this.merchantLicenseAddress = merchantLicenseAddress;
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

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantShortName() {
        return merchantShortName;
    }

    public void setMerchantShortName(String merchantShortName) {
        this.merchantShortName = merchantShortName;
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

    public String getMerchantImg() {
        return merchantImg;
    }

    public void setMerchantImg(String merchantImg) {
        this.merchantImg = merchantImg;
    }

    public String getMerchantFaceImg() {
        return merchantFaceImg;
    }

    public void setMerchantFaceImg(String merchantFaceImg) {
        this.merchantFaceImg = merchantFaceImg;
    }

    public String getMerchantInnerImg() {
        return merchantInnerImg;
    }

    public void setMerchantInnerImg(String merchantInnerImg) {
        this.merchantInnerImg = merchantInnerImg;
    }

    public String getMerchantCashDeskImg() {
        return merchantCashDeskImg;
    }

    public void setMerchantCashDeskImg(String merchantCashDeskImg) {
        this.merchantCashDeskImg = merchantCashDeskImg;
    }

    public String getMccCode() {
        return mccCode;
    }

    public void setMccCode(String mccCode) {
        this.mccCode = mccCode;
    }

    public String getConsignmentImg() {
        return consignmentImg;
    }

    public void setConsignmentImg(String consignmentImg) {
        this.consignmentImg = consignmentImg;
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

    public String getBankContactLine() {
        return bankContactLine;
    }

    public void setBankContactLine(String bankContactLine) {
        this.bankContactLine = bankContactLine;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
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

    public String getBankCardImg() {
        return bankCardImg;
    }

    public void setBankCardImg(String bankCardImg) {
        this.bankCardImg = bankCardImg;
    }

    public String getBankArea() {
        return bankArea;
    }

    public void setBankArea(String bankArea) {
        this.bankArea = bankArea;
    }

    public String getBankOpenAccountLicenseImg() {
        return bankOpenAccountLicenseImg;
    }

    public void setBankOpenAccountLicenseImg(String bankOpenAccountLicenseImg) {
        this.bankOpenAccountLicenseImg = bankOpenAccountLicenseImg;
    }

    public String getNonLawIdCardPortraitImg() {
        return nonLawIdCardPortraitImg;
    }

    public void setNonLawIdCardPortraitImg(String nonLawIdCardPortraitImg) {
        this.nonLawIdCardPortraitImg = nonLawIdCardPortraitImg;
    }

    public String getNonLawIdCardEmblemImg() {
        return nonLawIdCardEmblemImg;
    }

    public void setNonLawIdCardEmblemImg(String nonLawIdCardEmblemImg) {
        this.nonLawIdCardEmblemImg = nonLawIdCardEmblemImg;
    }

    public String getNonLawSettleAuthImg() {
        return nonLawSettleAuthImg;
    }

    public void setNonLawSettleAuthImg(String nonLawSettleAuthImg) {
        this.nonLawSettleAuthImg = nonLawSettleAuthImg;
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

    public String getCloudPayStatus() {
        return cloudPayStatus;
    }

    public void setCloudPayStatus(String cloudPayStatus) {
        this.cloudPayStatus = cloudPayStatus;
    }

    public BigDecimal getCloudPayLe1000Rate() {
        return cloudPayLe1000Rate;
    }

    public void setCloudPayLe1000Rate(BigDecimal cloudPayLe1000Rate) {
        this.cloudPayLe1000Rate = cloudPayLe1000Rate;
    }

    public BigDecimal getCloudPayGt1000Rate() {
        return cloudPayGt1000Rate;
    }

    public void setCloudPayGt1000Rate(BigDecimal cloudPayGt1000Rate) {
        this.cloudPayGt1000Rate = cloudPayGt1000Rate;
    }

    @Override
    public Boolean getSignByJsonStringMethod() {
        return true;
    }

    @Override
    public String getResource() {
        return "api.hl.shop.entry";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopEntryResponse.class;
    }
}
