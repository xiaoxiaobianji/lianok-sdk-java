package com.lianok.docking.b2b.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.b2b.response.ApiHlAppletB2bPreAppletB2bResponse;


/**
 * @author lianok.com
 */
public class ApiHlAppletB2bPreAppletB2bRequest extends AbstractDockingRequest {

    private String merchantNo;

    private String operatorAccount;

    private String signData;

    private String sessionKey;

    private String businessOrderNo;

    private String notifyUrl;

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

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
    

    @Override
    public String getResource() {
        return "api.hl.applet.b2b.preAppletB2b";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAppletB2bPreAppletB2bResponse.class;
    }
}
