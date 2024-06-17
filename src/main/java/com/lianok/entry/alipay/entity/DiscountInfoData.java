package com.lianok.entry.alipay.entity;

/**
 * @author lianok.com
 */
public class DiscountInfoData {
    private String discountAmount;
    private String discountName;
    private String discountPageLink;
    private Long discountQuantity;
    private String externalDiscountId;

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public String getDiscountPageLink() {
        return discountPageLink;
    }

    public void setDiscountPageLink(String discountPageLink) {
        this.discountPageLink = discountPageLink;
    }

    public Long getDiscountQuantity() {
        return discountQuantity;
    }

    public void setDiscountQuantity(Long discountQuantity) {
        this.discountQuantity = discountQuantity;
    }

    public String getExternalDiscountId() {
        return externalDiscountId;
    }

    public void setExternalDiscountId(String externalDiscountId) {
        this.externalDiscountId = externalDiscountId;
    }
}
