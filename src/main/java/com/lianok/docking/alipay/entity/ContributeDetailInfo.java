package com.lianok.docking.alipay.entity;

public class ContributeDetailInfo {

    /**
     * 其它出资方金额，单位：元，精确到小数点后两位
     */
    private String contributeAmount;

    /**
     * 出资方类型，如品牌商出资、支付宝平台出资...
     */
    private String contributeType;

    public String getContributeAmount() {
        return contributeAmount;
    }

    public void setContributeAmount(String contributeAmount) {
        this.contributeAmount = contributeAmount;
    }

    public String getContributeType() {
        return contributeType;
    }

    public void setContributeType(String contributeType) {
        this.contributeType = contributeType;
    }
}
