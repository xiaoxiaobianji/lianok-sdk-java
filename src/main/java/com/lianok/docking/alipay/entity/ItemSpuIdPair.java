package com.lianok.docking.alipay.entity;


/**
 * @author linshu
 * @create 2023/11/15 18:28
 */
public class ItemSpuIdPair {

    /**
     * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
     */
    private String itemId;

    /**
     * 商家侧商品ID
     */
    private String outItemId;
}
