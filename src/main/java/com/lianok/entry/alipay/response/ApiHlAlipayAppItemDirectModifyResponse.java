package com.lianok.entry.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.entity.ItemSkuIdPair;

import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlAlipayAppItemDirectModifyResponse extends DockingResponseBase {
    /**
     * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
     */
    private String itemId;

    /**
     * 商家侧商品ID，要求 APPID 下全局唯一.
     */
    private String outItemId;

    /**
     * sku数组
     */
    private List<ItemSkuIdPair> skus;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getOutItemId() {
        return outItemId;
    }

    public void setOutItemId(String outItemId) {
        this.outItemId = outItemId;
    }

    public List<ItemSkuIdPair> getSkus() {
        return skus;
    }

    public void setSkus(List<ItemSkuIdPair> skus) {
        this.skus = skus;
    }
}
