package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankInfoUpdateStatusResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

/**
 * 查询账户基础信息修改状态
 *
 * @author lianok.com
 */
public class ApiHlBankInfoUpdateStatusRequest extends AbstractDockingRequest {

    /**
     * 账户编号
     */
    private String businessNo;
    /**
     * 修改基础信息返回的流水号
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
        return "api.hl.bank.info.update.status";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankInfoUpdateStatusResponse.class;
    }
}
