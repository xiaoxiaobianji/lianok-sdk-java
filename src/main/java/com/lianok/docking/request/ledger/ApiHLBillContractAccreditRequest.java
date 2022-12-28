package com.lianok.docking.request.ledger;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ledger.ApiHLBillContractAccreditResponse;

/**
 * 分账开通
 *
 * @author linshu
 * @create 2022/11/2 11:11
 */
public class ApiHLBillContractAccreditRequest extends DockingRequestBase {

    @Override
    public String getApiName() {
        return "api.hl.bill.contract.accredit";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLBillContractAccreditResponse.class;
    }


    @JSONField(name = "merchantNo")
    private String merchantNo;
    @JSONField(name = "channelCode")
    private String channelCode;
    @JSONField(name = "sharePercent")
    private Integer sharePercent;
    @JSONField(name = "rateType")
    private Integer rateType;

    public String getMerchantNo() {
        return merchantNo;
    }

    /**
     * 商户编号
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
     * @param rateType
     */
    public void setRateType(Integer rateType) {
        this.rateType = rateType;
    }
}
