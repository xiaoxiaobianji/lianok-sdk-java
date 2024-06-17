package com.lianok.docking.bill.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.bill.response.ApiHlOrderQueryApplyResponse;

/**
 * 对账单查询
 *
 * @author lianok.com
 */
public class ApiHlOrderQueryApplyRequest extends AbstractDockingRequest {

    /**
     * 下载对账单唯一标识，请求申请对单接口成功时返回
     */
    private String downIdentification;

    public String getDownIdentification() {
        return downIdentification;
    }

    public void setDownIdentification(String downIdentification) {
        this.downIdentification = downIdentification;
    }

    @Override
    public String getResource() {
        return "api.hl.order.queryApply";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlOrderQueryApplyResponse.class;
    }

}
