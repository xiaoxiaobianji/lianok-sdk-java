package com.lianok.entry.alipay.entity;

/**
 * @author lianok.com
 */
public class PriceInfo {

    /**
     * 附加金额，单位：元，精确到小数点后两位。计算规则参考：https://opendocs.alipay.com/mini/077it9?pathHash=502012b2&ref=api#Q%EF%BC%9A%E5%88%9B%E5%BB%BA%E8%AE%A2%E5%8D%95%E6%97%B6%E7%9A%84%E4%BB%B7%E6%A0%BC%E5%85%AC%E5%BC%8F%E5%A6%82%E4%BD%95%E4%BC%A0%E9%80%92%EF%BC%9F
     */
    private String additionalPrice;

    /**
     * 商家优惠金额，单位：元，精确到小数点后两位
     */
    private String discountedPrice;

    /**
     * 运费，单位：元，精确到小数点后两位
     */
    private String freight;

    /**
     * 订单总价，单位：元,精确到小数点后两位
     */
    private String orderPrice;

    /**
     * 实收金额，商家在交易中实际收到的款项，单位：元，精确到小数点后两位
     */
    private String receiptAmount;

    public String getAdditionalPrice() {
        return additionalPrice;
    }

    public void setAdditionalPrice(String additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    public String getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(String discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(String receiptAmount) {
        this.receiptAmount = receiptAmount;
    }
}
