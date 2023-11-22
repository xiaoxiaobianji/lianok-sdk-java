package com.lianok.docking.alipay.response;

import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.alipay.entity.OrderDataDistributeInfo;
import com.lianok.docking.alipay.entity.OrderDataSyncSuggestion;

import java.util.List;


public class ApiHlAlipayMiniOrderSyncResponse extends DockingResponseBase {

    /**
     * "分发结果 若未分发到场景侧，则会返回具体的未分发原因"
     */
    private List<OrderDataDistributeInfo> distributeResult;

    /**
     * 支付宝订单号
     */
    private String orderId;

    /**
     * 订单状态
     */
    private String orderStatus;

    /**
     * 同步订单记录id
     （自2022年5月19日起，新接入商户，除点餐场景，该字段不再返回）
     */
    private String recordId;

    /**
     * 订单同步优化建议，供开发者参考
     */
    private List<OrderDataSyncSuggestion> syncSuggestions;

    public List<OrderDataDistributeInfo> getDistributeResult() {
        return distributeResult;
    }

    public void setDistributeResult(List<OrderDataDistributeInfo> distributeResult) {
        this.distributeResult = distributeResult;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public List<OrderDataSyncSuggestion> getSyncSuggestions() {
        return syncSuggestions;
    }

    public void setSyncSuggestions(List<OrderDataSyncSuggestion> syncSuggestions) {
        this.syncSuggestions = syncSuggestions;
    }
}
