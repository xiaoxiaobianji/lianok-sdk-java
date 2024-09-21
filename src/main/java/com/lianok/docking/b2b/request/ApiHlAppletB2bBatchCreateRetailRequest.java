package com.lianok.docking.b2b.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.b2b.response.ApiHlAppletB2bBatchCreateRetailResponse;


/**
 * @author lianok.com
 */
public class ApiHlAppletB2bBatchCreateRetailRequest extends AbstractDockingRequest {

    private String merchantNo;

    public String retailInfoLists;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getRetailInfoLists() {
        return retailInfoLists;
    }

    public void setRetailInfoLists(String retailInfoLists) {
        this.retailInfoLists = retailInfoLists;
    }

    @Override
    public String getResource() {
        return "api.hl.applet.b2b.batchCreateStore";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAppletB2bBatchCreateRetailResponse.class;
    }
}
