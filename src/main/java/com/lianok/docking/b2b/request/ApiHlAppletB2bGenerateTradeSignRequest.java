package com.lianok.docking.b2b.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.b2b.response.ApiHlAppletB2bGenerateTradeSignResponse;


/**
 * @author lianok.com
 */
public class ApiHlAppletB2bGenerateTradeSignRequest extends AbstractDockingRequest {

    private String merchantNo;

    private String operatorAccount;

    public String signData;

    public String sessionKey;

    private String businessOrderNo;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getSignData() {
        return signData;
    }

    public void setSignData(String signData) {
        this.signData = signData;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }
    

    @Override
    public String getResource() {
        return "api.hl.applet.b2b.preAppletB2b";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAppletB2bGenerateTradeSignResponse.class;
    }
}
