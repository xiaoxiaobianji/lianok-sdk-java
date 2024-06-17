package com.lianok.docking.ledger.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillContractAccreditResponse;

/**
 * 分账开通
 *
 * @author lianok.com
 */
public class ApiHlBillContractAccreditRequest extends AbstractDockingRequest {

    private String merchantNo;
    private String channelCode;
    private Integer sharePercent;
    private Integer insertFlag;
    private String notifyUrl;
    private Integer feeRate;
    private Integer shareCategory;

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

    public Integer getSharePercent() {
        return sharePercent;
    }

    public void setSharePercent(Integer sharePercent) {
        this.sharePercent = sharePercent;
    }

    public Integer getInsertFlag() {
        return insertFlag;
    }

    public void setInsertFlag(Integer insertFlag) {
        this.insertFlag = insertFlag;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Integer getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(Integer feeRate) {
        this.feeRate = feeRate;
    }

    public Integer getShareCategory() {
        return shareCategory;
    }

    public void setShareCategory(Integer shareCategory) {
        this.shareCategory = shareCategory;
    }

    @Override
    public String getResource() {
        return "api.hl.bill.contract.accredit";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillContractAccreditResponse.class;
    }
}
