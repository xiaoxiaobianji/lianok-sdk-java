package com.lianok.docking.ledger.request;

import com.lianok.core.entity.DockingRequestBase;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillContractAccreditQueryResponse;

/**
 * 分账开通查询
 */
public class ApiHlBillContractAccreditQueryRequest extends DockingRequestBase {

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
        return "api.hl.bill.contract.accredit.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillContractAccreditQueryResponse.class;
    }
}
