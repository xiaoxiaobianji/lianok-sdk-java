package com.lianok.docking.ledger.request;

import com.lianok.core.entity.DockingRequestBase;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillContractAccreditResponse;

/**
 * 分账开通
 */
public class ApiHlBillContractAccreditRequest extends DockingRequestBase {


    private String merchantNo;
    private String channelCode;
    private Integer sharePercent;
    private Integer rateType;

    public String getMerchantNo() {
        return merchantNo;
    }

    /**
     * 商户编号
     *
     * @param merchantNo
     */
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelCode() {
        return channelCode;
    }

    /**
     * 渠道编号
     *
     * @param channelCode
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public Integer getSharePercent() {
        return sharePercent;
    }

    /**
     * 商户最大分账比例
     *
     * @param sharePercent
     */
    public void setSharePercent(Integer sharePercent) {
        this.sharePercent = sharePercent;
    }

    public Integer getRateType() {
        return rateType;
    }

    /**
     * 商户分账费率设置类型,枚举如下: 1=首次配置 2=修改
     *
     * @param rateType
     */
    public void setRateType(Integer rateType) {
        this.rateType = rateType;
    }


    @Override
    public String getResource() {
        return "api.hl.bill.contract.accredit";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillContractAccreditResponse.class;
    }
}
