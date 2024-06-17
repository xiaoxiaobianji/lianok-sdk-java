package com.lianok.entry.alipay.entity;

/**
 * @author lianok.com
 */
public class LocalItemSkuQuery {

    /**
     * sku原价，分为单位
     */
    private Long originalPrice;

    /**
     * sku售价，分为单位
     */
    private Long salePrice;

    /**
     * sku售卖状态，包含以下两种状态： 已下架(DELISTING) 可售卖(AVAILABLE)
     */
    private String saleStatus;

    /**
     * 支付宝平台侧商品sku的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
     */
    private String skuId;

    /**
     * sku库存
     */
    private Long stockNum;

    public Long getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Long getStockNum() {
        return stockNum;
    }

    public void setStockNum(Long stockNum) {
        this.stockNum = stockNum;
    }
}
