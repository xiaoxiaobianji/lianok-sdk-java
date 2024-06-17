package com.lianok.docking.ledger.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.request.ApiHlShareOrderCreateRequest;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lianok.com
 */
public class ApiHlShareOrderCreateResponse extends DockingResponseBase {

    private String merchantNo;
    private String channelCode;
    private String billNo;
    private BigDecimal shareAmount;
    private String shareStatus;
    private List<ApiHlShareOrderCreateRequest.ShareOrderDetail> details;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public BigDecimal getShareAmount() {
        return shareAmount;
    }

    public void setShareAmount(BigDecimal shareAmount) {
        this.shareAmount = shareAmount;
    }

    public String getShareStatus() {
        return shareStatus;
    }

    public void setShareStatus(String shareStatus) {
        this.shareStatus = shareStatus;
    }

    public List<ApiHlShareOrderCreateRequest.ShareOrderDetail> getDetails() {
        return details;
    }

    public void setDetails(List<ApiHlShareOrderCreateRequest.ShareOrderDetail> details) {
        this.details = details;
    }
}
