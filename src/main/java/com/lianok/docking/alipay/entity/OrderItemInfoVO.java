package com.lianok.docking.alipay.entity;

import java.util.List;

public class OrderItemInfoVO {

    /**
     * 商品数量
     */
    private Long itemCnt;

    /**
     * 支付宝平台侧商品ID
     */
    private String itemId;

    /**
     * 商品退款信息
     */
    private ItemRefundInfoVO itemRefundInfo;

    /**
     * 本地生活商品凭证信息列表
     */
    private List<OrderCertificateInfoVO> orderCertificateInfos;

    /**
     * 商户商品ID
     */
    private String outItemId;

    /**
     * 商户商品sku_id
     */
    private String outSkuId;

    /**
     * 商品单价，单位：元,精确到小数点后两位，可以跟上传商品接口的价格不一致
     */
    private String salePrice;

    /**
     * 支付宝侧商品skuid
     */
    private String skuId;

    public Long getItemCnt() {
        return itemCnt;
    }

    public void setItemCnt(Long itemCnt) {
        this.itemCnt = itemCnt;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public ItemRefundInfoVO getItemRefundInfo() {
        return itemRefundInfo;
    }

    public void setItemRefundInfo(ItemRefundInfoVO itemRefundInfo) {
        this.itemRefundInfo = itemRefundInfo;
    }

    public List<OrderCertificateInfoVO> getOrderCertificateInfos() {
        return orderCertificateInfos;
    }

    public void setOrderCertificateInfos(List<OrderCertificateInfoVO> orderCertificateInfos) {
        this.orderCertificateInfos = orderCertificateInfos;
    }

    public String getOutItemId() {
        return outItemId;
    }

    public void setOutItemId(String outItemId) {
        this.outItemId = outItemId;
    }

    public String getOutSkuId() {
        return outSkuId;
    }

    public void setOutSkuId(String outSkuId) {
        this.outSkuId = outSkuId;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
}
