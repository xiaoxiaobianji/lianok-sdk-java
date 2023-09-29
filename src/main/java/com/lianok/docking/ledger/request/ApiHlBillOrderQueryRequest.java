package com.lianok.docking.ledger.request;

import com.lianok.core.entity.DockingRequestBase;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillOrderQueryResponse;

/**
 * 分账查询
 */
public class ApiHlBillOrderQueryRequest extends DockingRequestBase {

    private String merchantNo;
    private String channelCode;
    private String shareNo;
    private Long billId;


    public String getMerchantNo() {
        return merchantNo;
    }

    /**
     * 商户编号
     *
     * @param merchantNo
     */
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelCode() {
        return channelCode;
    }

    /**
     * 渠道编号
     *
     * @param channelCode
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getShareNo() {
        return shareNo;
    }

    /**
     * 对接商分账单号
     *
     * @param billNo
     */
    public void setShareNo(String billNo) {
        this.shareNo = billNo;
    }

    public Long getBillId() {
        return billId;
    }

    /**
     * 火脸分账账单编号
     *
     * @param billId
     */
    public void setBillId(Long billId) {
        this.billId = billId;
    }

    @Override
    public String getResource() {
        return "api.hl.bill.order.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillOrderQueryResponse.class;
    }
}
