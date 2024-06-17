package com.lianok.entry.complaint.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlComplaintNotifyQueryResponse  extends DockingResponseBase {

    private String merchantNo;

    private String notifyUrl;

    private String cipherKey;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getCipherKey() {
        return cipherKey;
    }

    public void setCipherKey(String cipherKey) {
        this.cipherKey = cipherKey;
    }
}
