package com.lianok.docking.alipay.entity;

import java.util.List;

public class ItemAttrGroupVO {

    /**
     * 商品属性列表
     */
    private List<AttributeVO> itemAttrList;

    /**
     * 商品属性列表 当前字段已废弃(商品模板标准升级，废弃改字段，请使用item_attr_list替换)
     */
    @Deprecated
    private List<AttributeVO> productAttrList;

    /**
     * 销售属性列表 当前字段已废弃(商品模板标准升级，废弃改字段，请使用sku_attr_list替换)
     */
    @Deprecated
    private List<AttributeVO> saleAttrList;

    /**
     * SKU属性列表
     */
    private List<AttributeVO> skuAttrList;

    public List<AttributeVO> getItemAttrList() {
        return itemAttrList;
    }

    public void setItemAttrList(List<AttributeVO> itemAttrList) {
        this.itemAttrList = itemAttrList;
    }

    public List<AttributeVO> getProductAttrList() {
        return productAttrList;
    }

    public void setProductAttrList(List<AttributeVO> productAttrList) {
        this.productAttrList = productAttrList;
    }

    public List<AttributeVO> getSaleAttrList() {
        return saleAttrList;
    }

    public void setSaleAttrList(List<AttributeVO> saleAttrList) {
        this.saleAttrList = saleAttrList;
    }

    public List<AttributeVO> getSkuAttrList() {
        return skuAttrList;
    }

    public void setSkuAttrList(List<AttributeVO> skuAttrList) {
        this.skuAttrList = skuAttrList;
    }
}
