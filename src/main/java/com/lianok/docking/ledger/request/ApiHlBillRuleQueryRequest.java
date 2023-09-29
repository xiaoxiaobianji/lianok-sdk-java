package com.lianok.docking.ledger.request;

import com.lianok.core.entity.DockingRequestBase;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillRuleQueryResponse;

/**
 * 分账规则查询
 */
public class ApiHlBillRuleQueryRequest extends DockingRequestBase {

    private String merchantNo;
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
        return "api.hl.bill.rule.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillRuleQueryResponse.class;
    }
}
