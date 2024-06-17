package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankRefundSnbResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;

/**
 * 交易退回
 *
 * @author lianok.com
 */
public class ApiHlBankRefundSnbRequest extends AbstractDockingRequest {

    /**
     * 客户真实ip
     */
    private String ip;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 第三方退款订单号
     */
    private String thirdRefundNo;
    /**
     * 退款金额
     */
    private BigDecimal amount;
    /**
     * 摘要
     */
    private String remark;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getThirdRefundNo() {
        return thirdRefundNo;
    }

    public void setThirdRefundNo(String thirdRefundNo) {
        this.thirdRefundNo = thirdRefundNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.refund.snb";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankRefundSnbResponse.class;
    }
}
