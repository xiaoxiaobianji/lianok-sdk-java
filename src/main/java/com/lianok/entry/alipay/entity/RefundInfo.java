package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class RefundInfo {

    private List<RefundRecord> refundList;

    public List<RefundRecord> getRefundList() {
        return refundList;
    }

    public void setRefundList(List<RefundRecord> refundList) {
        this.refundList = refundList;
    }
}
