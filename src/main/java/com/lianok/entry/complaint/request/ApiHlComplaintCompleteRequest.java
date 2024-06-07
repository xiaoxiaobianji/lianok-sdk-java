package com.lianok.entry.complaint.request;


import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlComplaintCompleteRequest extends AbstractEntryRequest {


    private String merchantNo;

    private String huolianComplaintNo;

    private String operatorUserAccount;

    @Override
    public String getResource() {
        return "api.hl.complaint.complete";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return DockingResponseBase.class;
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

    public String getOperatorUserAccount() {
        return operatorUserAccount;
    }

    public void setOperatorUserAccount(String operatorUserAccount) {
        this.operatorUserAccount = operatorUserAccount;
    }
}
