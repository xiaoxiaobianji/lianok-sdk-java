package com.lianok.docking.alipay.entity;

import java.util.List;

public class ItemSkuSearchVO {

    /**
     * sku条形码
     */
    private String barcode;

    /**
     * sku原价，分为单位
     */
    private Long originalPrice;

    /**
     * 商家侧sku ID，要求 APPID 下全局唯一。
     */
    private String outSkuId;

    /**
     * sku价格单位
     */
    private String priceUnit;

    /**
     * sku售价，分为单位
     */
    private Long salePrice;

    /**
     * sku售卖状态，包含以下两种状态： 已下架(DELISTING) 可售卖(AVAILABLE)
     */
    private String saleStatus;

    /**
     * sku销售属性
     */
    private List<ItemSkuAttrVO> skuAttrs;

    /**
     * 支付宝平台侧商品sku的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
     */
    private String skuId;

    /**
     * sku库存，目前支持库存区间为0-99999
     */
    private Long stockNum;

    /**
     * 图片url，宽高为400px*400px，宽高比1:1。
     */
    private String thumbImg;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Long getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getOutSkuId() {
        return outSkuId;
    }

    public void setOutSkuId(String outSkuId) {
        this.outSkuId = outSkuId;
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
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

    public List<ItemSkuAttrVO> getSkuAttrs() {
        return skuAttrs;
    }

    public void setSkuAttrs(List<ItemSkuAttrVO> skuAttrs) {
        this.skuAttrs = skuAttrs;
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

    public String getThumbImg() {
        return thumbImg;
    }

    public void setThumbImg(String thumbImg) {
        this.thumbImg = thumbImg;
    }
}
