package com.lianok.docking.merchant.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.merchant.response.ApiHlShopUpdateRateInfoResponse;

import java.math.BigDecimal;

/**
 * 修改费率信息
 */
public class ApiHlShopUpdateRateInfoRequest extends AbstractDockingRequest {

    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 通道名称
     */
    private String channelCode;
    /**
     * 异步通知地址
     * 审核状态有变化时会发出通知
     */
    private String notifyUrl;
    /**
     * 支付宝费率
     */
    private BigDecimal alipayRate;
    /**
     * 微信费率
     */
    private BigDecimal wechatPayRate;
    /**
     * 云闪付费率1000以下
     */
    private BigDecimal cloudPayLe1000Rate;
    /**
     * 云闪付费率1000以上
     */
    private BigDecimal cloudPayGt1000Rate;

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

    public BigDecimal getAlipayRate() {
        return alipayRate;
    }

    public void setAlipayRate(BigDecimal alipayRate) {
        this.alipayRate = alipayRate;
    }

    public BigDecimal getWechatPayRate() {
        return wechatPayRate;
    }

    public void setWechatPayRate(BigDecimal wechatPayRate) {
        this.wechatPayRate = wechatPayRate;
    }

    public BigDecimal getCloudPayLe1000Rate() {
        return cloudPayLe1000Rate;
    }

    public void setCloudPayLe1000Rate(BigDecimal cloudPayLe1000Rate) {
        this.cloudPayLe1000Rate = cloudPayLe1000Rate;
    }

    public BigDecimal getCloudPayGt1000Rate() {
        return cloudPayGt1000Rate;
    }

    public void setCloudPayGt1000Rate(BigDecimal cloudPayGt1000Rate) {
        this.cloudPayGt1000Rate = cloudPayGt1000Rate;
    }

    @Override
    public Boolean getSignByJsonStringMethod() {
        return true;
    }

    @Override
    public String getResource() {
        return "api.hl.shop.update.rateInfo";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShopUpdateRateInfoResponse.class;
    }
}
