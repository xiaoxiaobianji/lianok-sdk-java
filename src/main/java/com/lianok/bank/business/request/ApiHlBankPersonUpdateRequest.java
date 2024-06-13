package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankPersonUpdateResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * 个人账户驳回修改
 *
 * @author lianok.com
 */
public class ApiHlBankPersonUpdateRequest extends AbstractDockingRequest {


    private String ip;

    /**
     * 交易账户编号
     */
    private String businessNo;
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
     * 身份证人像图片
     */
    private String userIdFrontUrl;

    /**
     * 身份证国徽图片
     */
    private String userIdBackUrl;

    /**
     * 地址
     */
    private String userAddress;

    /**
     * 职业
     */
    private String userProfession;

    /**
     * 备注
     */
    private String userRemark;

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

    public String getUserIdFrontUrl() {
        return userIdFrontUrl;
    }

    public void setUserIdFrontUrl(String userIdFrontUrl) {
        this.userIdFrontUrl = userIdFrontUrl;
    }

    public String getUserIdBackUrl() {
        return userIdBackUrl;
    }

    public void setUserIdBackUrl(String userIdBackUrl) {
        this.userIdBackUrl = userIdBackUrl;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserProfession() {
        return userProfession;
    }

    public void setUserProfession(String userProfession) {
        this.userProfession = userProfession;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.person.update";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankPersonUpdateResponse.class;
    }
}
