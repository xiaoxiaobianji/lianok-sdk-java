package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class PromoApplyItemInfo {

    /**
     * 支付宝平台侧商品ID
     */
    private String itemId;

    /**
     * 商品申领明细列表
     */
    private List<PromoApplyItemDetailInfo> promoApplyItemDetailInfos;

    /**
     * 支付宝侧商品skuid
     */
    private String skuId;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public List<PromoApplyItemDetailInfo> getPromoApplyItemDetailInfos() {
        return promoApplyItemDetailInfos;
    }

    public void setPromoApplyItemDetailInfos(List<PromoApplyItemDetailInfo> promoApplyItemDetailInfos) {
        this.promoApplyItemDetailInfos = promoApplyItemDetailInfos;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
}
