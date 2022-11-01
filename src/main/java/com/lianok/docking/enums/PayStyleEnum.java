package com.lianok.docking.enums;

/**
 * @author linshu
 * @create 2022/11/1 11:54
 */
public enum PayStyleEnum {
    /**
     * 用户扫商户二维码
     */
    ACTIVESCAN,
    /**
     * 商户扫用户付款码
     */
    PASSIVESCAN,
    /**
     * 刷脸支付
     */
    FACESCAN,
    /**
     * 银联刷卡
     */
    POS,
    /**
     * 小程序
     */
    APPLET;

    public static String getEnumValue(PayStyleEnum payStyleEnum){
        switch (payStyleEnum){
            case ACTIVESCAN:
                return "activeScan";
            case PASSIVESCAN:
                return "passiveScan";
            case FACESCAN:
                return "faceScan";
            case POS:
                return "pos";
            case APPLET:
                return "applet";
            default:
                return null;
        }
    }
}
