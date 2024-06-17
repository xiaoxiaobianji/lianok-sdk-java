package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.response.ApiHlAlipayCertConfirmResponse;

/**
 * @author lianok.com
 */
public class ApiHlAlipayCertConfirmRequest extends AbstractEntryRequest {
    /**
     * 商户号
     */
    private String merchantNo;
    private String certificateId;
    private String code;
    private String orderId;
    private String reason;
    private String result;
    private String userId;
    private String userOpenId;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserOpenId() {
        return userOpenId;
    }

    public void setUserOpenId(String userOpenId) {
        this.userOpenId = userOpenId;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.cert.confirm";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayCertConfirmResponse.class;
    }
}
