package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankV2UnbindCardResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlBankV2UnbindCardRequest extends AbstractDockingRequest {

    private String businessNo;
    private String bankCardNo;
    private String bankCardName;

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

    @Override
    public String getResource() {
        return "api.hl.bank.v2.unbindcard";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankV2UnbindCardResponse.class;
    }
}
