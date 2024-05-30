package com.lianok.docking.complaint.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.complaint.response.ApiHlComplaintNotifyQueryResponse;

public class ApiHlComplaintNotifyQueryRequest extends AbstractDockingRequest {

    private String merchantNo;

    @Override
    public Boolean getSignByJsonStringMethod() {
        return true;
    }

    @Override
    public String getResource() {
        return "api.hl.complaint.notify.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlComplaintNotifyQueryResponse.class;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }
}
