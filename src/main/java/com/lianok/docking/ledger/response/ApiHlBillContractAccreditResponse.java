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
}
