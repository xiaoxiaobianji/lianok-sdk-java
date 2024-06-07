package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankCardUpdateResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * 账户银行卡修改
 *
 * @author lianok.com
 */
public class ApiHlBankCardUpdateRequest extends AbstractDockingRequest {

    private String ip;
    /**
     * 账号编号
     */
    private String businessNo;

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
     * 银行预留手机号
     */
    private String bankCardMobile;

    /**
     * 开户许可证url
     */
    private String openAcctUrl;

    /**
     * 开户许可证核准号或基本存款账户编号
     */
    private String openLicenceNo;

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

    public String getOpenAcctUrl() {
        return openAcctUrl;
    }

    public void setOpenAcctUrl(String openAcctUrl) {
        this.openAcctUrl = openAcctUrl;
    }

    public String getOpenLicenceNo() {
        return openLicenceNo;
    }

    public void setOpenLicenceNo(String openLicenceNo) {
        this.openLicenceNo = openLicenceNo;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.card.update";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankCardUpdateResponse.class;
    }
}
