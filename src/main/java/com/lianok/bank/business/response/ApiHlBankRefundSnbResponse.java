package com.lianok.bank.business.response;

import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;

/**
 * 交易退回
 *
 * @author lianok.com
 */
public class ApiHlBankRefundSnbResponse extends DockingResponseBase {

    /**
     * 退款单号
     */
    private String refundNo;
    /**
     * 第三方退款订单号
     */
    private String thirdRefundNo;
    /**
     * 交易单号
     */
    private String orderNo;
    /**
     * 退款金额
     */
    private BigDecimal amount;
    /**
     * 0:退款中, 1:退款成功, 2:退款失败
     */
    private Integer orderStatus;
}
