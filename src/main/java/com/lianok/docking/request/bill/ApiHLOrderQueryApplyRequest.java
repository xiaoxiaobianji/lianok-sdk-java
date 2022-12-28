package com.lianok.docking.request.bill;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.bill.ApiHLOrderQueryApplyResponse;

/**
 * 对账单查询
 *
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
