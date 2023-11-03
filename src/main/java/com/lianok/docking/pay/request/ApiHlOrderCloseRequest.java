package com.lianok.docking.pay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.pay.response.ApiHlOrderCloseResponse;

/**
 * 订单关闭
 * 对接商可根据此接口对‘待支付、支付中’状态订单进行关闭订单操作
 */
public class ApiHlOrderCloseRequest extends AbstractDockingRequest {

    /**
     * 火脸订单号
     * 火脸订单号可在火脸服务商后台-订单管理-交易流水或商家后台-订单管理-交易流水中查看。
     */
    private String orderNo;
    /**
     * 商户ID
     * 火脸商户ID，在火脸服务商后台-商户列表或商家后台-门店列表，可查看该字段
     */
    private String merchantNo;
    /**
     * 对接商系统订单号
     * 由对接商自行定义规范，最大长度不超过64（与火脸订单号二选一）
     */
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

    @Override
    public String getResource() {
        return "api.hl.order.close";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlOrderCloseResponse.class;
    }

}
