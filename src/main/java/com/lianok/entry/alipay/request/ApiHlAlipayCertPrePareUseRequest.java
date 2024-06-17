package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.response.ApiHlAlipayCertPrePareUseResponse;

/**
 * @author lianok.com
 */
public class ApiHlAlipayCertPrePareUseRequest extends AbstractEntryRequest {
    /**
     * 商户号
     */
    private String merchantNo;

    private String code;
    private String encryptedData;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEncryptedData() {
        return encryptedData;
    }

    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.cert.pre.pare.use";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayCertPrePareUseResponse.class;
    }
}
