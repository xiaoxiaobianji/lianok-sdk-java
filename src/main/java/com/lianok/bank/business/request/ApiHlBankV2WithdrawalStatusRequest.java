package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankV2WithdrawalStatusResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlBankV2WithdrawalStatusRequest extends AbstractDockingRequest {

    private String businessNo;
    private String orderNo;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.v2.withdrawalstatus";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankV2WithdrawalStatusResponse.class;
    }


}
