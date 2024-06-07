package com.lianok.bank.business.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * 金额提现
 *
 * @author lianok.com
 */
public class ApiHlBankCheckoutWithdrawalResponse extends DockingResponseBase {

    /**
     * 提现单号
     */
    private String orderNo;
    /**
     * 账户编号
     */
    private String businessNo;
    /**
     * 提现状态
     * 0提现中 1-成功 2-失败 3-未提现 4-已提交(提现中，待完成)
     */
    private Integer status;
    /**
     * 失败信息
     */
    private String failMsg;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFailMsg() {
        return failMsg;
    }

    public void setFailMsg(String failMsg) {
        this.failMsg = failMsg;
    }
}
