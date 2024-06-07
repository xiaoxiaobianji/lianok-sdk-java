package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankBusinessGetResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * 交易账户详情
 *
 * @author lianok.com
 */
public class ApiHlBankBusinessGetRequest extends AbstractDockingRequest {

    private String businessNo;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.business.get";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankBusinessGetResponse.class;
    }
}
