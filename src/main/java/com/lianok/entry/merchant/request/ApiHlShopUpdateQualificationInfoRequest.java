package com.lianok.entry.merchant.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.merchant.response.ApiHlShopUpdateQualificationInfoResponse;

import java.time.LocalDate;

/**
 * 修改资质信息
 *
 * @author lianok.com
 */
public class ApiHlShopUpdateQualificationInfoRequest extends AbstractEntryRequest {

    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 通道标识
     * com.lianok.docking.enums.ChannelEnum
     */
    private String channelCode;
    /**
     * 商户类型
     */
    private String merchantType;
    /**
     * 异步通知地址
     * 审核状态有变化时会发出通知,不上传则根据默认回调地址进行通知
     */
    private String notifyUrl;
    /**
     * 法人证件正面照
     */
    private String idCardPortraitImg;
    /**
     * 法人证件反面照
     */
    private String idCardEmblemImg;
    /**
     * 证件有效开始日期
     */
    private LocalDate idCardBeginDate;
    /**
     * 证件有效结束日期
     */
    private LocalDate idCardExpireDate;
    /**
     * 营业执照有效开始日期
     */
    private LocalDate merchantLicenseBegDate;
    /**
     * 营业执照有效结束日期
     */
    private LocalDate merchantLicenseEndDate;
    /**
     * 营业执照注册地址
     * 商户类型为企业、个体工商必填
     */
    private String merchantLicenseAddress;
    /**
     * 营业执照图片
     * 商户类型为企业、个体工商必填
     */
    private String merchantLicenseImg;
    /**
     * 营业执照全称
     */
    private String merchantLicenseFullName;
    /**
     * 营业执照编码
     */
    private String merchantLicenseNo;

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

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
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

    public LocalDate getIdCardBeginDate() {
        return idCardBeginDate;
    }

    public void setIdCardBeginDate(LocalDate idCardBeginDate) {
        this.idCardBeginDate = idCardBeginDate;
    }

    public LocalDate getIdCardExpireDate() {
        return idCardExpireDate;
    }

    public void setIdCardExpireDate(LocalDate idCardExpireDate) {
        this.idCardExpireDate = idCardExpireDate;
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

    public String getMerchantLicenseAddress() {
        return merchantLicenseAddress;
    }

    public void setMerchantLicenseAddress(String merchantLicenseAddress) {
        this.merchantLicenseAddress = merchantLicenseAddress;
    }

    public String getMerchantLicenseImg() {
        return merchantLicenseImg;
    }

    public void setMerchantLicenseImg(String merchantLicenseImg) {
        this.merchantLicenseImg = merchantLicenseImg;
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

    @Override
    public String getResource() {
        return "api.hl.shop.updateQualificationInfo";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopUpdateQualificationInfoResponse.class;
    }
}
