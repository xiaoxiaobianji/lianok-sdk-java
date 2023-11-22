package com.lianok.docking.alipay.entity;

public class ItemSkuIdPair {

    /**
     * 商家侧sku ID，APPID 下全局唯一。
     */
    private String outSkuId;

    /**
     * 支付宝平台侧商品sku的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
     */
    private String skuId;

    public String getOutSkuId() {
        return outSkuId;
    }

    public void setOutSkuId(String outSkuId) {
        this.outSkuId = outSkuId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
}
