package com.lianok.core.entity;

public class ResponseBase {

    private static final long serialVersionUID = 4307287190580284170L;

    private Integer code;

    private String message;

    private Integer status;

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

    public boolean success() {
        return code == 0 && status == 200;
    }
}
