package com.lianok.bank.business.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * 回执单
 *
 * @author lianok.com
 */
public class ApiHlBankReceiptGetRequest extends AbstractDockingRequest {

    /**
     * 申请单类型
     * 1-提现
     * 2-订单交易
     * 3-交易退回
     * 4-充值入金
     */
    private String receiptType;
    /**
     * 申请单号
     */
    private String orderNo;

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.receipt.get";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return null;
    }
}
