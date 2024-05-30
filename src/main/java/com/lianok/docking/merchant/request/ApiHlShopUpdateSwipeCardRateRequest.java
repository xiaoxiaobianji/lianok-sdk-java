package com.lianok.docking.merchant.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.merchant.response.ApiHlShopUpdateSwipeCardRateResponse;

import java.math.BigDecimal;

/**
 * 修改刷卡费率
 */
public class ApiHlShopUpdateSwipeCardRateRequest extends AbstractDockingRequest {

    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 通道标识
     * com.lianok.docking.enums.ChannelEnum
     */
    private String channelCode;
    /**
     * 回调地址
     */
    private String notifyUrl;
    /**
     * 刷卡费率类型 目前只能传1
     */
    private Integer swipeType;
    /**
     * 借记卡费率
     */
    private BigDecimal unionDebitRate;
    /**
     * 贷记卡费率
     */
    private BigDecimal unionCreditRate;

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

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Integer getSwipeType() {
        return swipeType;
    }

    public void setSwipeType(Integer swipeType) {
        this.swipeType = swipeType;
    }

    public BigDecimal getUnionDebitRate() {
        return unionDebitRate;
    }

    public void setUnionDebitRate(BigDecimal unionDebitRate) {
        this.unionDebitRate = unionDebitRate;
    }

    public BigDecimal getUnionCreditRate() {
        return unionCreditRate;
    }

    public void setUnionCreditRate(BigDecimal unionCreditRate) {
        this.unionCreditRate = unionCreditRate;
    }

    @Override
    public Boolean getSignByJsonStringMethod() {
        return true;
    }

    @Override
    public String getResource() {
        return "api.hl.shop.updateSwipeCardRate";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopUpdateSwipeCardRateResponse.class;
    }
}
