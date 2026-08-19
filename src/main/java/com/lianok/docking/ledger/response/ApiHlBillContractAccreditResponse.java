package com.lianok.docking.ledger.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * 分账开通
 *
 * @author lianok.com
 */
public class ApiHlBillContractAccreditResponse extends DockingResponseBase {

    private String merchantNo;
    private String channelMerchantNo;
    private String contractUrl;

    private Integer shareCategory;
    private String bizCode;
    private String bizMsg;
    private Integer openStatus;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelMerchantNo() {
        return channelMerchantNo;
    }

    public void setChannelMerchantNo(String channelMerchantNo) {
        this.channelMerchantNo = channelMerchantNo;
    }

    public String getContractUrl() {
        return contractUrl;
    }

    public void setContractUrl(String contractUrl) {
        this.contractUrl = contractUrl;
    }

    public Integer getShareCategory() {
        return shareCategory;
    }

    public void setShareCategory(Integer shareCategory) {
        this.shareCategory = shareCategory;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizMsg() {
        return bizMsg;
    }

    public void setBizMsg(String bizMsg) {
        this.bizMsg = bizMsg;
    }

    public Integer getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(Integer openStatus) {
        this.openStatus = openStatus;
    }
}
