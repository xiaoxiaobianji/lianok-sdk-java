package com.lianok.docking.alipay.entity;

import java.util.List;

public class PayInfoVO {

    /**
     * 支付渠道列表
     */
    private List<String> payChannels;

    /**
     * 付款时间，yyyy-MM-dd HH:mm:ss
     */
    private String payTime;

    /**
     * 支付流水单号
     */
    private String transactionId;

    /**
     * 券明细
     */
    private List<VoucherDetailInfoVO> voucherDetailList;

    public List<String> getPayChannels() {
        return payChannels;
    }

    public void setPayChannels(List<String> payChannels) {
        this.payChannels = payChannels;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public List<VoucherDetailInfoVO> getVoucherDetailList() {
        return voucherDetailList;
    }

    public void setVoucherDetailList(List<VoucherDetailInfoVO> voucherDetailList) {
        this.voucherDetailList = voucherDetailList;
    }
}
