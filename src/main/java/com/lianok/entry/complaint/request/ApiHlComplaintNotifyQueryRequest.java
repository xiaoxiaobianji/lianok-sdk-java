package com.lianok.entry.complaint.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.complaint.response.ApiHlComplaintNotifyQueryResponse;

/**
 * @author lianok.com
 */
public class ApiHlComplaintNotifyQueryRequest extends AbstractEntryRequest {

    private String merchantNo;

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
