package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.response.ApiHlAlipayCertBatchQueryResponse;

import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlAlipayCertBatchQueryRequest extends AbstractEntryRequest {
    /**
     * 商户号
     */
    private String merchantNo;

    private List<String> certificateIdList;
    /** @deprecated */
    @Deprecated
    private List<String> codeList;
    private String openId;
    private String orderId;
    private String userId;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public List<String> getCertificateIdList() {
        return certificateIdList;
    }

    public void setCertificateIdList(List<String> certificateIdList) {
        this.certificateIdList = certificateIdList;
    }

    public List<String> getCodeList() {
        return codeList;
    }

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.cert.batch.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayCertBatchQueryResponse.class;
    }
}
