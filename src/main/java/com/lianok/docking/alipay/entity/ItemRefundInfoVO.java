package com.lianok.docking.alipay.entity;

public class ItemRefundInfoVO {

    /**
     * 退款结束时间
     */
    private String endTime;

    /**
     * 退款开始时间
     */
    private String startTime;

    /**
     * 商品的退款状态
     */
    private String status;

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
