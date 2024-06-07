package com.lianok.entry.merchant.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.merchant.response.ApiHlShopSettlePeriodSetResponse;

/**
 * 开通分时结算
 *
 * @author lianok.com
 */
public class ApiHlShopSettlePeriodSetRequest extends AbstractEntryRequest {

    /**
     * 商户编号
     */
    private String merchantNo;

    /**
     * 渠道编号
     */
    private String channelCode;

    /**
     * 申请变更的结算周期时刻点
     */
    private String applySettlePeriod;

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

    public String getApplySettlePeriod() {
        return applySettlePeriod;
    }

    public void setApplySettlePeriod(String applySettlePeriod) {
        this.applySettlePeriod = applySettlePeriod;
    }

    @Override
    public String getResource() {
        return "api.hl.shop.settle.period.set";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopSettlePeriodSetResponse.class;
    }
}
