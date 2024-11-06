package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankBusinessCancelResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * 账户撤销
 *
 * @author lianok.com
 */
public class ApiHlBankBusinessCancelRequest extends AbstractDockingRequest {

    private String businessNo;
    private String reason;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.business.cancel";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankBusinessCancelResponse.class;
    }
}
