package com.lianok.docking.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.LocalItemVO;

import java.util.List;


public class ApiHlAlipayLocalItemListQueryResponse extends DockingResponseBase {

    /**
     * 商品列表
     */
    private List<LocalItemVO> items;

    /**
     * 页码
     */
    private Long pageNum;

    /**
     * 单页大小
     */
    private Long pageSize;

    /**
     * 符合条件的商品总数
     */
    private Long total;

    public List<LocalItemVO> getItems() {
        return items;
    }

    public void setItems(List<LocalItemVO> items) {
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
