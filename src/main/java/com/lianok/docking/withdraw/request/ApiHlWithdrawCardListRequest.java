package com.lianok.docking.withdraw.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.balanceApply.response.ApiHlBalanceApplyPayResponse;
import com.lianok.docking.withdraw.response.ApiHlWithdrawCardListResponse;

/**
 * 易分账-查询提现卡列表
 *
 * @author lianok.com
 */
public class ApiHlWithdrawCardListRequest extends AbstractDockingRequest {

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
        return "api.hl.withdraw.cardList";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlWithdrawCardListResponse.class;
    }
}
