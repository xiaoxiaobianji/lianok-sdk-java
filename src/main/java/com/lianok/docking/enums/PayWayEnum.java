package com.lianok.docking.enums;

import com.lianok.core.utils.StrUtils;

/**
 * 支付类型枚举
 */
public enum PayWayEnum {

    /**
     * 余额
     */
    BALANCE("balance"),

    /**
     * 微信
     */
    WECHAT("wechat"),

    /**
     * 支付宝
     */
    ALIPAY("alipay"),

    /**
     * 刷卡
     */
    UNION("union"),

    /**
     * 云闪付
     */
    CLOUD("cloud"),

    /**
     * 数字人民币
     */
    DCPAY("dcpay"),

    /**
     * 现金
     */
    CASH("cash"),
    /**
     * 个人网银
     */
    PERSON_ONLINE_BANK("b2c_bank"),
    /**
     * 企业网银
     */
    CORPORATE_ONLINE_BANK("b2b_bank"),
    /**
     * 快捷支付
     */
    QUICK_PAY("quick_pay"),
    ;

    private final String payWay;


    PayWayEnum(String payWay) {
        this.payWay = payWay;
    }

    public String getPayWay() {
        return payWay;
    }

    public static PayWayEnum getPayWayEnum(String payWay) {
        if (StrUtils.isEmpty(payWay)) {
            return null;
        }
        for (PayWayEnum value : values()) {
            if (payWay.equals(value.getPayWay())) {
                return value;
            }
        }
        return null;
    }


}
