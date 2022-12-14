package com.lianok.docking;

import java.io.Serializable;

/**
 * @author linshu
 * @create 2022/8/23 10:12
 */
public class ResponseResultBase<T> implements Serializable {

    private static final long serialVersionUID = 4307287190580284170L;

    private Integer code;

    private String message;

    private Integer status;

    private T data;

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean success() {
        return code == 0 && status == 200;
    }
}
