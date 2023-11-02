package com.lianok.docking.ledger.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.request.ApiHlBillOrderCreateRequest;

import java.math.BigDecimal;
import java.util.List;

/**
 * 分账查询
 */
public class ApiHlBillOrderQueryResponse extends DockingResponseBase {

    private String shareNo;
    private String billNo;
    private String merchantNo;
    private String shareStatus;
    private BigDecimal shareAmount;
    private List<ApiHlBillOrderCreateRequest.MerchantShareBillDetailCreate> details;

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

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getShareStatus() {
        return shareStatus;
    }

    public void setShareStatus(String shareStatus) {
        this.shareStatus = shareStatus;
    }

    public BigDecimal getShareAmount() {
        return shareAmount;
    }

    public void setShareAmount(BigDecimal shareAmount) {
        this.shareAmount = shareAmount;
    }

    public List<ApiHlBillOrderCreateRequest.MerchantShareBillDetailCreate> getDetails() {
        return details;
    }

    public void setDetails(List<ApiHlBillOrderCreateRequest.MerchantShareBillDetailCreate> details) {
        this.details = details;
    }
}
