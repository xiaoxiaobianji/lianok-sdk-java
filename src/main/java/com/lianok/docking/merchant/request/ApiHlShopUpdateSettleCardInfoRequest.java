package com.lianok.docking.merchant.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.merchant.response.ApiHlShopUpdateSettleCardInfoResponse;

/**
 * 修改结算信息
 */
public class ApiHlShopUpdateSettleCardInfoRequest extends AbstractDockingRequest {

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
     * 回调地址
     */
    private String notifyUrl;
    /**
     * 商户类型
     */
    private String merchantType;
    /**
     * 结算类型
     */
    private String settleType;
    /**
     * 开户名
     */
    private String bankAccountName;
    /**
     * 联行号
     */
    private String bankContactLine;
    /**
     * 银行卡号
     */
    private String bankCardNo;
    /**
     * 卡户支行地区
     */
    private String bankArea;
    /**
     * 开户总行
     */
    private String bankName;
    /**
     * 开户支行
     */
    private String bankBranchName;
    /**
     * 银行预留手机号
     */
    private String bankMobile;
    /**
     * 银行卡照片
     */
    private String bankCardImg;
    /**
     * 开户许可证
     * 对公法人需上传
     */
    private String bankOpenAccountLicenseImg;
    /**
     * 非法人身份证人像照
     * 对私非法人需上传
     */
    private String nonLawIdCardPortraitImg;
    /**
     * 非法人身份证国徽照
     * 对私非法人需上传
     */
    private String nonLawIdCardEmblemImg;
    /**
     * 非法人结算授权照
     * 对私非法人需上传
     */
    private String nonLawSettleAuthImg;
    /**
     * 非法人身份证号码
     * 对私非法人需上传
     */
    private String nonLawIdCardNo;

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

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType;
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

    public String getBankArea() {
        return bankArea;
    }

    public void setBankArea(String bankArea) {
        this.bankArea = bankArea;
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

    @Override
    public String getResource() {
        return "api.hl.shop.updateSettleCardInfo";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopUpdateSettleCardInfoResponse.class;
    }
}
