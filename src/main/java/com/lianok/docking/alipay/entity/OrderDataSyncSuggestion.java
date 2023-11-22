package com.lianok.docking.alipay.entity;

public class OrderDataSyncSuggestion {

    /**
     * 同步建议内容
     */
    private String message;

    /**
     * 同步建议类型
     */
    private String type;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
