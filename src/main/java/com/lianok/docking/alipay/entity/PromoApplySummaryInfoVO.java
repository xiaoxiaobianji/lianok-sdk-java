package com.lianok.docking.alipay.entity;

public class PromoApplySummaryInfoVO {

    /**
     * 优惠申领金额或者数量，金额时单位：分。需要根据budget_type字段区分金额和数量
     */
    private String applyAmount;

    /**
     * 优惠申领的预算类型
     */
    private String budgetType;

    /**
     * 支付宝会员等级
     */
    private String memberLevel;

    /**
     * 营销优惠子类型
     */
    private String promotionSubType;

    /**
     * 营销优惠类型
     */
    private String promotionType;

    public String getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(String applyAmount) {
        this.applyAmount = applyAmount;
    }

    public String getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    public String getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel;
    }

    public String getPromotionSubType() {
        return promotionSubType;
    }

    public void setPromotionSubType(String promotionSubType) {
        this.promotionSubType = promotionSubType;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }
}
