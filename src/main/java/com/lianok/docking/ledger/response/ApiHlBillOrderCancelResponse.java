package com.lianok.docking.ledger.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * 订单分账撤销
 *
 * @author lianok.com
 */
public class ApiHlBillOrderCancelResponse extends DockingResponseBase {

    private String merchantNo;
    private String shareNo;
    private String billNo;
    private Integer shareStatus;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getShareNo() {
        return shareNo;
    }

    public void setShareNo(String shareNo) {
        this.shareNo = shareNo;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public Integer getShareStatus() {
        return shareStatus;
    }

    public void setShareStatus(Integer shareStatus) {
        this.shareStatus = shareStatus;
    }
}
