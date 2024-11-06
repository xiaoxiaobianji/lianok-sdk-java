package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankV2RechargeStatusResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlBankV2RechargeStatusRequest extends AbstractDockingRequest {

    private String orderNo;
    private String businessNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.v2.rechargestatus";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankV2RechargeStatusResponse.class;
    }
}
