package com.lianok.docking.ledger.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillAccountBalanceQueryResponse;

/**
 * @author lianok.com
 */
public class ApiHlBillAccountBalanceQueryRequest extends AbstractDockingRequest {

    /**
     * 商户ID
     * 火脸商户ID，在火脸服务商后台-商户列表或商家后台-门店列表，可查看该字段
     */
    private String merchantNo;

    /**
     * 通道标识
     * com.lianok.docking.enums.ChannelEnum
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
        return "api.hl.bill.account.balance.query";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillAccountBalanceQueryResponse.class;
    }
}
