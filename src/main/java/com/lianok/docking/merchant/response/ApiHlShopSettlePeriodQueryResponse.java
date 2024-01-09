package com.lianok.docking.merchant.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlShopSettlePeriodQueryResponse extends DockingResponseBase {
    /**
     * 分时结算周期信息
     */
    private ApiHlShopSettlePeriodUsedResponseVO settlePeriodInfo;

    /**
     * 申请变更的信息
     */
    private ApiHlShopSettlePeriodApplyResponseVO applyChangeInfo;

    public ApiHlShopSettlePeriodUsedResponseVO getSettlePeriodInfo() {
        return settlePeriodInfo;
    }

    public void setSettlePeriodInfo(ApiHlShopSettlePeriodUsedResponseVO settlePeriodInfo) {
        this.settlePeriodInfo = settlePeriodInfo;
    }

    public ApiHlShopSettlePeriodApplyResponseVO getApplyChangeInfo() {
        return applyChangeInfo;
    }

    public void setApplyChangeInfo(ApiHlShopSettlePeriodApplyResponseVO applyChangeInfo) {
        this.applyChangeInfo = applyChangeInfo;
    }
}
