package com.lianok.entry.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * 当前正在使用的 分时结算周期信息
 * @author lianok.com
 */
public class ApiHlShopSettlePeriodUsedResponse extends DockingResponseBase {

    /**
     * 商户编号
     */
    private String merchantNo;

    /**
     * 渠道编号
     */
    private String channelCode;

    /**
     * 当前正在使用的分时结算时刻点
     */
    private String settlePeriod;

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

    public String getSettlePeriod() {
        return settlePeriod;
    }

    public void setSettlePeriod(String settlePeriod) {
        this.settlePeriod = settlePeriod;
    }
}
