package com.lianok.bank.business.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * 回执单
 *
 * @author lianok.com
 */
public class ApiHlBankReceiptGetResponse extends DockingResponseBase {

    /**
     * 申请单号
     */
    private String orderNo;

    /**
     * 1-提现
     * 2-订单交易
     * 3-交易退回
     * 4-充值入金
     */
    private String receiptType;
    /**
     * 申请单状态
     * 0-待处理
     * 1-成功
     * 2-失败
     * 3-处理中
     * 4-下载中
     */
    private Integer status;
    /**
     * 电子回单oss地址
     * 成功时返回，下载存储防止文件过期被删除
     */
    private String receiptApply;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReceiptApply() {
        return receiptApply;
    }

    public void setReceiptApply(String receiptApply) {
        this.receiptApply = receiptApply;
    }
}
