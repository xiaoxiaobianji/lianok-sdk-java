package com.lianok.entry.alipay.entity;

/**
 * @author lianok.com
 */
public class RefundRecord {

    /**
     * 退款金额，单位：元，精确到小数点后两位。
     */
    private String amount;

    /**
     * 外部退款流水号
     */
    private String outRefundId;

    /**
     * 支付系统退款单号
     */
    private String refundId;

    /**
     * 退款记录状态
     */
    private String status;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOutRefundId() {
        return outRefundId;
    }

    public void setOutRefundId(String outRefundId) {
        this.outRefundId = outRefundId;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
