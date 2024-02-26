package com.lianok.docking.merchant.response;


/**
 * 分时结算变更申请信息
 */
public class ApiHlShopSettlePeriodApplyResponseVO {

    /**
     * 商户编号
     */
    private String merchantNo;

    /**
     * 渠道编号
     */
    private String channelCode;

    /**
     * 当前使用的结算时刻
     */
    private String settlePeriod;

    /**
     * 分时结算开通状态
     */
    private Integer state;

    /**
     * 申请变更的结算周期时刻点
     */
    private String applySettlePeriod;

    /**
     * 修改前的分时结算时刻
     */
    private String previousSettlePeriod;

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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getApplySettlePeriod() {
        return applySettlePeriod;
    }

    public void setApplySettlePeriod(String applySettlePeriod) {
        this.applySettlePeriod = applySettlePeriod;
    }

    public String getPreviousSettlePeriod() {
        return previousSettlePeriod;
    }

    public void setPreviousSettlePeriod(String previousSettlePeriod) {
        this.previousSettlePeriod = previousSettlePeriod;
    }

    public String getSettlePeriod() {
        return settlePeriod;
    }

    public void setSettlePeriod(String settlePeriod) {
        this.settlePeriod = settlePeriod;
    }
}
