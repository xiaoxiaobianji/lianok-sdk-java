package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankV2WithdrawalResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;

/**
 * @author lianok.com
 */
public class ApiHlBankV2WithdrawalRequest extends AbstractDockingRequest {

    private String businessNo;
    private BigDecimal amount;
    private String bankCardNo;
    private String memo;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.v2.withdrawal";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankV2WithdrawalResponse.class;
    }


}
