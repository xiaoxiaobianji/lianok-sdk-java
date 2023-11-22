package com.lianok.docking.alipay.entity;

import java.util.List;

public class PromoApplyInfoVO {

    /**
     * 营销申领商品明细列表
     */
    private List<PromoApplyItemInfoVO> promoApplyItemInfos;

    /**
     * 营销申领汇总列表
     */
    private List<PromoApplySummaryInfoVO> promoApplySummaryInfos;

    public List<PromoApplyItemInfoVO> getPromoApplyItemInfos() {
        return promoApplyItemInfos;
    }

    public void setPromoApplyItemInfos(List<PromoApplyItemInfoVO> promoApplyItemInfos) {
        this.promoApplyItemInfos = promoApplyItemInfos;
    }

    public List<PromoApplySummaryInfoVO> getPromoApplySummaryInfos() {
        return promoApplySummaryInfos;
    }

    public void setPromoApplySummaryInfos(List<PromoApplySummaryInfoVO> promoApplySummaryInfos) {
        this.promoApplySummaryInfos = promoApplySummaryInfos;
    }
}
