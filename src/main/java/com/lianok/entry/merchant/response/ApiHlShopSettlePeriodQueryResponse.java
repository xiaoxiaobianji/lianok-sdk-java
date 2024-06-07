package com.lianok.entry.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * @author lianok.com
 */
public class ApiHlShopSettlePeriodQueryResponse extends DockingResponseBase {
    /**
     * 分时结算周期信息
     */
    private ApiHlShopSettlePeriodUsedResponse settlePeriodInfo;

    /**
     * 申请变更的信息
     */
    private ApiHlShopSettlePeriodApplyResponse applyChangeInfo;

    public ApiHlShopSettlePeriodUsedResponse getSettlePeriodInfo() {
        return settlePeriodInfo;
    }

    public void setSettlePeriodInfo(ApiHlShopSettlePeriodUsedResponse settlePeriodInfo) {
        this.settlePeriodInfo = settlePeriodInfo;
    }

    public ApiHlShopSettlePeriodApplyResponse getApplyChangeInfo() {
        return applyChangeInfo;
    }

    public void setApplyChangeInfo(ApiHlShopSettlePeriodApplyResponse applyChangeInfo) {
        this.applyChangeInfo = applyChangeInfo;
    }
}
