package com.lianok.core.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class ResponseResultListBase<T extends DockingResponseBase> extends ResponseBase {

    private Integer totalCount;

    private List<T> data;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

}
