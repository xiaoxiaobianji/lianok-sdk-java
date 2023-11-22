package com.lianok.docking.alipay.entity;

import java.util.List;

public class RefundInfoVO {

    private List<RefundRecordVO> refundList;

    public List<RefundRecordVO> getRefundList() {
        return refundList;
    }

    public void setRefundList(List<RefundRecordVO> refundList) {
        this.refundList = refundList;
    }
}
