package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankV2CheckResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;

/**
 * @author lianok.com
 */
public class ApiHlBankV2CheckRequest extends AbstractDockingRequest {

    private String businessNo;
    private BigDecimal authAmount;
    private String sms;
    private String flowNo;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public BigDecimal getAuthAmount() {
        return authAmount;
    }

    public void setAuthAmount(BigDecimal authAmount) {
        this.authAmount = authAmount;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getFlowNo() {
        return flowNo;
    }

    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.v2.check";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankV2CheckResponse.class;
    }
}
