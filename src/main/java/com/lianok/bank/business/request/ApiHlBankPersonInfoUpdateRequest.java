package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankPersonInfoUpdateResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

import java.time.LocalDateTime;

/**
 * 个人账户基础信息修改
 *
 * @author lianok.com
 */
public class ApiHlBankPersonInfoUpdateRequest extends AbstractDockingRequest {

    private String ip;
    /**
     * 账户编号
     */
    private String businessNo;

    /**
     * 交易户名称
     */
    private String businessName;


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
    private java.time.LocalDateTime userIdStartDate;

    /**
     * 证件有效期(结束时间)/长期
     */
    private java.time.LocalDateTime userIdEndDate;

    /**
     * 是否永久有效
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

    public LocalDateTime getUserIdStartDate() {
        return userIdStartDate;
    }

    public void setUserIdStartDate(LocalDateTime userIdStartDate) {
        this.userIdStartDate = userIdStartDate;
    }

    public LocalDateTime getUserIdEndDate() {
        return userIdEndDate;
    }

    public void setUserIdEndDate(LocalDateTime userIdEndDate) {
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

    @Override
    public String getResource() {
        return "api.hl.bank.person.info.update";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankPersonInfoUpdateResponse.class;
    }
}
