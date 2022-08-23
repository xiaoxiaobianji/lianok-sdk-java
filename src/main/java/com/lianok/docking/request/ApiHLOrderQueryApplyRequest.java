package com.lianok.docking.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ApiHLOrderQueryApplyResponse;

/**
 * @author linshu
 * @create 2022/8/22 17:56
 */
public class ApiHLOrderQueryApplyRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.order.queryApply";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLOrderQueryApplyResponse.class;
    }

    @JSONField(name = "downIdentification")
    private String downIdentification;

    public String getDownIdentification() {
        return downIdentification;
    }

    public void setDownIdentification(String downIdentification) {
        this.downIdentification = downIdentification;
    }
}
