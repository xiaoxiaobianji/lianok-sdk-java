package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class PromoApplyInfo {

    /**
     * 营销申领商品明细列表
     */
    private List<PromoApplyItemInfo> promoApplyItemInfos;

    /**
     * 营销申领汇总列表
     */
    private List<PromoApplySummaryInfo> promoApplySummaryInfos;

    public List<PromoApplyItemInfo> getPromoApplyItemInfos() {
        return promoApplyItemInfos;
    }

    public void setPromoApplyItemInfos(List<PromoApplyItemInfo> promoApplyItemInfos) {
        this.promoApplyItemInfos = promoApplyItemInfos;
    }

    public List<PromoApplySummaryInfo> getPromoApplySummaryInfos() {
        return promoApplySummaryInfos;
    }

    public void setPromoApplySummaryInfos(List<PromoApplySummaryInfo> promoApplySummaryInfos) {
        this.promoApplySummaryInfos = promoApplySummaryInfos;
    }
}
