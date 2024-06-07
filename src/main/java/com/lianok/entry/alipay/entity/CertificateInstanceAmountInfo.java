package com.lianok.entry.alipay.entity;

/**
 * @author lianok.com
 */
public class CertificateInstanceAmountInfo {

    /**
     * 商品标注的原价，单位为元。
     */
    private String originalPrice;

    /**
     * 商品售价去除商家订单优惠后的商家实收，未计算收单费率等，单位为元。
     */
    private String receiptAmount;

    /**
     * 商品售卖的价格，单位为元。
     */
    private String salePrice;

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(String receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }
}
