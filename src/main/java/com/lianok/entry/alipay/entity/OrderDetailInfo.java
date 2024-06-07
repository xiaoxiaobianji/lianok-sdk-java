package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class OrderDetailInfo {

    /**
     * 商品列表
     */
    private List<OrderItemInfo> itemInfos;

    /**
     * 支付信息
     */
    private PayInfo payInfo;

    /**
     * 价格信息
     */
    private PriceInfo priceInfo;

    /**
     * 优惠申领信息
     */
    private PromoApplyInfo promoApplyInfo;

    public List<OrderItemInfo> getItemInfos() {
        return itemInfos;
    }

    public void setItemInfos(List<OrderItemInfo> itemInfos) {
        this.itemInfos = itemInfos;
    }

    public PayInfo getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(PayInfo payInfo) {
        this.payInfo = payInfo;
    }

    public PriceInfo getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
    }

    public PromoApplyInfo getPromoApplyInfo() {
        return promoApplyInfo;
    }

    public void setPromoApplyInfo(PromoApplyInfo promoApplyInfo) {
        this.promoApplyInfo = promoApplyInfo;
    }
}
