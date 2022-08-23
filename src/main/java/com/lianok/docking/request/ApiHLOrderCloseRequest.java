package com.lianok.docking.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ApiHLOrderCloseResponse;

/**
 * @author linshu
 * @create 2022/8/22 17:46
 */
public class ApiHLOrderCloseRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.order.close";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLOrderCloseResponse.class;
    }

    @JSONField(name = "orderNo")
    private String orderNo;
    @JSONField(name = "merchantNo")
    private String merchantNo;
    @JSONField(name = "businessOrderNo")
    private String businessOrderNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

}
