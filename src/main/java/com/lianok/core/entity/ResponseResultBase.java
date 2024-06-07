package com.lianok.core.entity;

/**
 * @author lianok.com
 */
public class ResponseResultBase<T extends DockingResponseBase> extends ResponseBase {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
