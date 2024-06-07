package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class ItemAttrGroup {

    /**
     * 商品属性列表
     */
    private List<Attribute> itemAttrList;

    /**
     * 商品属性列表 当前字段已废弃(商品模板标准升级，废弃改字段，请使用item_attr_list替换)
     */
    @Deprecated
    private List<Attribute> productAttrList;

    /**
     * 销售属性列表 当前字段已废弃(商品模板标准升级，废弃改字段，请使用sku_attr_list替换)
     */
    @Deprecated
    private List<Attribute> saleAttrList;

    /**
     * SKU属性列表
     */
    private List<Attribute> skuAttrList;

    public List<Attribute> getItemAttrList() {
        return itemAttrList;
    }

    public void setItemAttrList(List<Attribute> itemAttrList) {
        this.itemAttrList = itemAttrList;
    }

    public List<Attribute> getProductAttrList() {
        return productAttrList;
    }

    public void setProductAttrList(List<Attribute> productAttrList) {
        this.productAttrList = productAttrList;
    }

    public List<Attribute> getSaleAttrList() {
        return saleAttrList;
    }

    public void setSaleAttrList(List<Attribute> saleAttrList) {
        this.saleAttrList = saleAttrList;
    }

    public List<Attribute> getSkuAttrList() {
        return skuAttrList;
    }

    public void setSkuAttrList(List<Attribute> skuAttrList) {
        this.skuAttrList = skuAttrList;
    }
}
