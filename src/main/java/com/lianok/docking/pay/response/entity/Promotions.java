package com.lianok.docking.pay.response.entity;

import java.math.BigDecimal;

/**
 * @author lianok.com
 */
public class Promotions {
    private Integer type;
    private String typeDesc;
    private Integer isSellerDiscount;
    private String scope;
    private String scopeDesc;
    private String source;
    private String promotionId;
    private String promotionName;
    private BigDecimal amount;
    private BigDecimal officialContributeAmount;
    private BigDecimal merchantContributeAmount;
    private BigDecimal otherContributeAmount;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Integer getIsSellerDiscount() {
        return isSellerDiscount;
    }

    public void setIsSellerDiscount(Integer isSellerDiscount) {
        this.isSellerDiscount = isSellerDiscount;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getScopeDesc() {
        return scopeDesc;
    }

    public void setScopeDesc(String scopeDesc) {
        this.scopeDesc = scopeDesc;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getOfficialContributeAmount() {
        return officialContributeAmount;
    }

    public void setOfficialContributeAmount(BigDecimal officialContributeAmount) {
        this.officialContributeAmount = officialContributeAmount;
    }

    public BigDecimal getMerchantContributeAmount() {
        return merchantContributeAmount;
    }

    public void setMerchantContributeAmount(BigDecimal merchantContributeAmount) {
        this.merchantContributeAmount = merchantContributeAmount;
    }

    public BigDecimal getOtherContributeAmount() {
        return otherContributeAmount;
    }

    public void setOtherContributeAmount(BigDecimal otherContributeAmount) {
        this.otherContributeAmount = otherContributeAmount;
    }
}
