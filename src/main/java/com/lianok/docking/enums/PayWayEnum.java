package com.lianok.docking.enums;

/**
 * 支付类型枚举
 * @author linshu
 * @create 2022/11/1 11:43
 */
public enum PayWayEnum {
    /**
     * 余额
     */
    BALANCE,
    /**
     * 微信
     */
    WECHAT,
    /**
     * 支付宝
     */
    ALIPAY,
    /**
     * 刷卡
     */
    UNION,
    /**
     * 云闪付
     */
    CLOUD,
    /**
     * 数字人民币
     */
    DCPAY,
    /**
     * 现金
     */
    CASH;

    public static String getEnumValue(PayWayEnum payWayEnum){
        switch (payWayEnum){
            case BALANCE:
                return "balance";
            case WECHAT:
                return "wechat";
            case ALIPAY:
                return "alipay";
            case UNION:
                return "union";
            case CLOUD:
                return "cloud";
            case DCPAY:
                return "dcpay";
            case CASH:
                return "cash";
            default:
                return null;
        }
    }
}
