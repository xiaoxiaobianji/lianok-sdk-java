package com.lianok.docking.b2b.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.b2b.response.ApiHlAppletB2bDownLoadBillResponse;


/**
 * @author lianok.com
 */
public class ApiHlAppletB2bDownLoadBillRequest extends AbstractDockingRequest {

    private String merchantNo;

    private String billDate;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    @Override
    public String getResource() {
        return "api.hl.applet.b2b.downloadbill";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAppletB2bDownLoadBillResponse.class;
    }
}
