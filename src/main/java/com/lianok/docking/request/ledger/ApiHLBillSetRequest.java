package com.lianok.docking.request.ledger;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ledger.ApiHLBillSetResponse;

/**
 * 自动分账开通
 *
 * @author linshu
 * @create 2022/11/2 11:34
 */
public class ApiHLBillSetRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.bill.set";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLBillSetResponse.class;
    }

    @JSONField(name = "merchantNo")
    private String merchantNo;
    @JSONField(name = "channelCode")
    private String channelCode;
    /**
     * 分账模式  0=手动分账 1=自动分账
     */
    @JSONField(name = "shareMode")
    private Integer shareMode;
    /**
     * 0=手动打标 1=自动打标
     */
    @JSONField(name = "shareMarkType")
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
}
