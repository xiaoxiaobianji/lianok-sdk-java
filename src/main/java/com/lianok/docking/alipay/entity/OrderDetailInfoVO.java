package com.lianok.docking.alipay.entity;

import java.util.List;

public class OrderDetailInfoVO {

    /**
     * 商品列表
     */
    private List<OrderItemInfoVO> itemInfos;

    /**
     * 支付信息
     */
    private PayInfoVO payInfo;

    /**
     * 价格信息
     */
    private PriceInfoVO priceInfo;

    /**
     * 优惠申领信息
     */
    private PromoApplyInfoVO promoApplyInfo;

    public List<OrderItemInfoVO> getItemInfos() {
        return itemInfos;
    }

    public void setItemInfos(List<OrderItemInfoVO> itemInfos) {
        this.itemInfos = itemInfos;
    }

    public PayInfoVO getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(PayInfoVO payInfo) {
        this.payInfo = payInfo;
    }

    public PriceInfoVO getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(PriceInfoVO priceInfo) {
        this.priceInfo = priceInfo;
    }

    public PromoApplyInfoVO getPromoApplyInfo() {
        return promoApplyInfo;
    }

    public void setPromoApplyInfo(PromoApplyInfoVO promoApplyInfo) {
        this.promoApplyInfo = promoApplyInfo;
    }
}
