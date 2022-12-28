package com.lianok.docking.request.ledger;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ledger.ApiHLBillRuleQueryResponse;

/**
 * 分账规则查询
 *
 * @author linshu
 * @create 2022/11/2 11:32
 */
public class ApiHLBillRuleQueryRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.bill.rule.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLBillRuleQueryResponse.class;
    }

    @JSONField(name = "merchantNo")
    private String merchantNo;
    @JSONField(name = "channelCode")
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
}
