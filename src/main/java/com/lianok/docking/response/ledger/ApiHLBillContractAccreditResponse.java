package com.lianok.docking.response.ledger;

import com.lianok.docking.DockingResponseBase;

/**
 * 分账开通
 *
 * @author linshu
 * @create 2022/11/2 11:12
 */
public class ApiHLBillContractAccreditResponse extends DockingResponseBase {

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
