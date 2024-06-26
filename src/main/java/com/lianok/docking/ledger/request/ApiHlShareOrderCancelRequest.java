package com.lianok.docking.ledger.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlShareOrderCancelResponse;

/**
 * 分账取消
 *
 * @author lianok.com
 */
public class ApiHlShareOrderCancelRequest extends AbstractDockingRequest {

    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 渠道编号
     */
    private String channelCode;
    /**
     * 对接商分账单号
     */
    private String billNo;
    /**
     * 火脸分账账单编号
     */
    private String shareNo;

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

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getShareNo() {
        return shareNo;
    }

    public void setShareNo(String shareNo) {
        this.shareNo = shareNo;
    }


    @Override
    public String getResource() {
        return "api.hl.share.order.cancel";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlShareOrderCancelResponse.class;
    }
}
