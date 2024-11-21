package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankV2InfoUpdateResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * 企业信息修改
 *
 * @author lianok.com
 */
public class ApiHlBankV2InfoUpdateRequest extends AbstractDockingRequest {

    private String businessNo;
    private String businessName;
    private String legalName;
    private String legalIdType;
    private String legalIdNo;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalIdType() {
        return legalIdType;
    }

    public void setLegalIdType(String legalIdType) {
        this.legalIdType = legalIdType;
    }

    public String getLegalIdNo() {
        return legalIdNo;
    }

    public void setLegalIdNo(String legalIdNo) {
        this.legalIdNo = legalIdNo;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.v2.infoupdate";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankV2InfoUpdateResponse.class;
    }
}
