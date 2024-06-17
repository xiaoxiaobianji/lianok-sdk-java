package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankCardUpdateStatusResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * 查询账户银行卡修改状态
 *
 * @author lianok.com
 */
public class ApiHlBankCardUpdateStatusRequest extends AbstractDockingRequest {

    /**
     * 账户编号
     */
    private String businessNo;
    /**
     * 修改结算卡返回流水号
     */
    private String flowNo;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getFlowNo() {
        return flowNo;
    }

    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.card.update.status";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankCardUpdateStatusResponse.class;
    }
}
