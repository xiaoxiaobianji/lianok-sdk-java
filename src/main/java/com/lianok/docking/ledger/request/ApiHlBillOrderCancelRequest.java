package com.lianok.docking.ledger.request;

import com.lianok.core.entity.DockingRequestBase;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillOrderCancelResponse;

/**
 * 分账取消
 */
public class ApiHlBillOrderCancelRequest extends DockingRequestBase {

    private String merchantNo;
    private String channelCode;
    private String billNo;
    private Long shareNo;

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

    public String getBillNo() {
        return billNo;
    }

    /**
     * 对接商分账单号
     *
     * @param billNo
     */
    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public Long getShareNo() {
        return shareNo;
    }

    /**
     * 火脸分账账单编号
     *
     * @param shareNo
     */
    public void setShareNo(Long shareNo) {
        this.shareNo = shareNo;
    }


    @Override
    public String getResource() {
        return "api.hl.bill.order.cancel";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillOrderCancelResponse.class;
    }
}
