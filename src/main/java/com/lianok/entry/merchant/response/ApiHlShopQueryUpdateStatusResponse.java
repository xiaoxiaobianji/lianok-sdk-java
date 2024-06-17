package com.lianok.entry.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlShopQueryUpdateStatusResponse extends DockingResponseBase {

    /**
     * 商户号
     */
    private String merchantNo;

    /**
     * 通道标识
     */
    private String channelCode;

    /**
     * 进件状态
     */
    private Integer status;
    /**
     * 驳回原因
     */
    private String rejectReason;


    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

   
}
