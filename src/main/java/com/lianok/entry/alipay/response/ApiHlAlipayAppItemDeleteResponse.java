package com.lianok.entry.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.entity.ItemSpuIdPair;

import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlAlipayAppItemDeleteResponse extends DockingResponseBase {

    /**
     * 删除成功的商家侧商品ID和支付宝平台侧商品ID列表
     */
    private List<ItemSpuIdPair> records;

    public List<ItemSpuIdPair> getRecords() {
        return records;
    }

    public void setRecords(List<ItemSpuIdPair> records) {
        this.records = records;
    }
}
