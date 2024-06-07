package com.lianok.entry.complaint.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.complaint.response.ApiHlComplaintNotifySetResponse;

/**
 * 设置投诉通知回调请求参数
 *
 * @author lianok.com
 */
public class ApiHlComplaintNotifySetRequest extends AbstractEntryRequest {

    /**
     * 火脸商户ID
     */
    private String merchantNo;

    /**
     * 投诉回调通知地址
     */
    private String notifyUrl;

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    @Override
    public String getResource() {
        return "api.hl.complaint.notify.set";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlComplaintNotifySetResponse.class;
    }
}
