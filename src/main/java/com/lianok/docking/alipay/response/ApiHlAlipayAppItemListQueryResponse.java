package com.lianok.docking.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.ItemSpuVO;

import java.util.List;


public class ApiHlAlipayAppItemListQueryResponse extends DockingResponseBase {

    /**
     * 商品spu列表
     */
    private List<ItemSpuVO> items;

    /**
     * 页码
     */
    private Long pageNum;

    /**
     * 单页大小
     */
    private Long pageSize;

    /**
     * 符合条件的商品SPU总数
     */
    private Long total;

    public List<ItemSpuVO> getItems() {
        return items;
    }

    public void setItems(List<ItemSpuVO> items) {
        this.items = items;
    }

    public Long getPageNum() {
        return pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
