package com.lianok.docking.pay.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlOrderPayBankResponse extends DockingResponseBase {

    /**
     * 支付跳转链接(收银台)
     */
    private String payUrl;
    /**
     * 系统对接流水单号
     */
    private String businessOrderNo;
    /**
     * 操作者账号
     */
    private String operatorAccount;
    /**
     * 火脸订单号
     */
    private String orderNo;
}
