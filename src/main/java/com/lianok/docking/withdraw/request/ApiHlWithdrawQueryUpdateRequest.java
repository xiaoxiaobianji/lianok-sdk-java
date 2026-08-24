package com.lianok.docking.withdraw.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.withdraw.response.ApiHlWithdrawQueryResponse;
import com.lianok.docking.withdraw.response.ApiHlWithdrawQueryUpdateResponse;

/**
 * 易分账-提现卡绑定
 *
 * @author lianok.com
 */
public class ApiHlWithdrawQueryUpdateRequest extends AbstractDockingRequest {

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
        return "api.hl.withdraw.query.update";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlWithdrawQueryUpdateResponse.class;
    }
}
