package com.lianok.bank.enums;

/**
 * 回执单
 *
 * @author lianok.com
 */
public enum ReceiptTypeEnum {

    /**
     * 提现
     */
    CHECKOUT(1),
    /**
     * 订单交易
     */
    PAY_ORDER(2),
    /**
     * 交易退回
     */
    REFUND_ORDER(3),
    /**
     * 充值入金
     */
    CHECKIN(4),

    ;
    private final Integer type;

    ReceiptTypeEnum(Integer type) {
        this.type = type;
    }


    public Integer getType() {
        return this.type;
    }
}
