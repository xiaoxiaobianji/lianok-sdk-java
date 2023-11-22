package com.lianok.docking.alipay.entity;

import java.util.List;

public class ItemSkuCreateVO {
    private String barcode;
    private Long originalPrice;
    private String outSkuId;
    private String priceUnit;
    private String salePrice;
    private String saleStatus;
    private List<ItemSkuAttrVO> skuAttrs;
    private String stockNum;
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

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
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

    public String getStockNum() {
        return stockNum;
    }

    public void setStockNum(String stockNum) {
        this.stockNum = stockNum;
    }

    public String getThumbImg() {
        return thumbImg;
    }

    public void setThumbImg(String thumbImg) {
        this.thumbImg = thumbImg;
    }
}
