package com.lianok.core.entity;

import java.util.List;

public class ResponseResultListBase<T extends DockingResponseBase> extends ResponseBase {

    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

}
