package com.lianok.docking.ledger.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillContractAccreditQueryResponse;
import com.lianok.docking.ledger.response.ApiHlBillUpdateAccreditQueryResponse;

/**
 * 分账修改查询
 *
 * @author lianok.com
 */
public class ApiHlBillUpdateAccreditQueryRequest extends AbstractDockingRequest {

    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 渠道编号
     */
    private String channelCode;

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


    @Override
    public String getResource() {
        return "api.hl.bill.update.accredit.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillUpdateAccreditQueryResponse.class;
    }
}
