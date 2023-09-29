package com.lianok.docking.bill.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.core.entity.DockingRequestBase;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.bill.response.ApiHlOrderQueryApplyResponse;

/**
 * 对账单查询
 */
public class ApiHlOrderQueryApplyRequest extends DockingRequestBase {

    @Override
    public String getResource() {
        return "api.hl.order.queryApply";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlOrderQueryApplyResponse.class;
    }

    /**
     * 下载对账单唯一标识，请求申请对单接口成功时返回
     */
    @JSONField(name = "downIdentification")
    private String downIdentification;

    public String getDownIdentification() {
        return downIdentification;
    }

    public void setDownIdentification(String downIdentification) {
        this.downIdentification = downIdentification;
    }
}
