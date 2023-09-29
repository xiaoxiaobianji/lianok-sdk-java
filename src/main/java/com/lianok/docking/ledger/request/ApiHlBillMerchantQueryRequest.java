package com.lianok.docking.ledger.request;

import com.lianok.core.entity.DockingRequestBase;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillMerchantQueryResponse;

/**
 * 分账关系查询
 */
public class ApiHlBillMerchantQueryRequest extends DockingRequestBase {

    private String merchantNo;
    private String channelCode;

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

    @Override
    public String getResource() {
        return "api.hl.bill.merchant.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillMerchantQueryResponse.class;
    }
}
