package com.lianok.core.entity;

public class ResponseResultBase<T extends DockingResponseBase> extends ResponseBase {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
