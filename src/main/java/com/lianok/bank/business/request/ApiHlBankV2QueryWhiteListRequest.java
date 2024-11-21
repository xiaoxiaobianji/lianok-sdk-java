package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankV2QueryWhiteListResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlBankV2QueryWhiteListRequest extends AbstractDockingRequest {

    private String businessNo;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.v2.querywhitelist";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankV2QueryWhiteListResponse.class;
    }


}