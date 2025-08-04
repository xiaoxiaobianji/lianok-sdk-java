package com.lianok.docking.balanceApply.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.balanceApply.response.ApiHlBalanceApplyQueryAccountInfoResponse;

/**
 * 余额分账-查询账户信息
 *
 * @author lianok.com
 */
public class ApiHlBalanceApplyQueryAccountInfoRequest extends AbstractDockingRequest {

    /**
     * 商户ID
     */
    private String merchantNo;

    /**
     * 通道标识
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
        return "api.hl.balance.apply.queryAccountInfo";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBalanceApplyQueryAccountInfoResponse.class;
    }
}
