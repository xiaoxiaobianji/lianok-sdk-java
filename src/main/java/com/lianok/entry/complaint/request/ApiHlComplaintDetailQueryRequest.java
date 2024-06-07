package com.lianok.entry.complaint.request;


import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.complaint.response.ApiHlComplaintDetailResponse;

/**
 * @author lianok.com
 */
public class ApiHlComplaintDetailQueryRequest extends AbstractEntryRequest {

    private String merchantNo;

    private String huolianComplaintNo;

    @Override
    public String getResource() {
        return "api.hl.complaint.detail.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlComplaintDetailResponse.class;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getHuolianComplaintNo() {
        return huolianComplaintNo;
    }

    public void setHuolianComplaintNo(String huolianComplaintNo) {
        this.huolianComplaintNo = huolianComplaintNo;
    }
}
