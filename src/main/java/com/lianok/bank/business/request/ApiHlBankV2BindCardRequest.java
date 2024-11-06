package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankV2BindCardResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlBankV2BindCardRequest extends AbstractDockingRequest {

    private String businessNo;
    private String bankCardNo;
    private String bankCardName;
    private String bankNo;
    private String bankName;
    private String bankCardMobile;

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

    @Override
    public String getResource() {
        return "api.hl.bank.v2.bindcard";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankV2BindCardResponse.class;
    }
}
