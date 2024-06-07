package com.lianok.docking.ledger.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillSetResponse;

/**
 * 自动分账开通
 *
 * @author lianok.com
 */
public class ApiHlBillSetRequest extends AbstractDockingRequest {

    /**
     * 分账方商户ID
     */
    private String merchantNo;
    /**
     * 通道标识
     * com.lianok.docking.enums.ChannelEnum
     */
    private String channelCode;
    /**
     * 分账模式  0=手动分账 1=自动分账
     */
    private Integer shareMode;
    /**
     * 0=手动打标 1=自动打标
     */
    private Integer shareMarkType;

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

    public Integer getShareMode() {
        return shareMode;
    }

    public void setShareMode(Integer shareMode) {
        this.shareMode = shareMode;
    }

    public Integer getShareMarkType() {
        return shareMarkType;
    }

    public void setShareMarkType(Integer shareMarkType) {
        this.shareMarkType = shareMarkType;
    }

    @Override
    public String getResource() {
        return "api.hl.bill.set";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillSetResponse.class;
    }
}
