package com.lianok.bank.business.response;

import com.lianok.core.entity.DockingResponseBase;

/**
 * 企业信息修改
 *
 * @author lianok.com
 */
public class ApiHlBankV2InfoUpdateResponse extends DockingResponseBase {

    /**
     * 交易账户编号
     */
    private String businessNo;
    /**
     * 请求流水号
     */
    private String flowNo;
    /**
     * 状态
     * 0-待处理 1-提交中 2-成功 3-失败 4-接口返回,待处理
     */
    private Integer status;
    /**
     * 失败原因
     */
    private String failMessage;

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getFlowNo() {
        return flowNo;
    }

    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFailMessage() {
        return failMessage;
    }

    public void setFailMessage(String failMessage) {
        this.failMessage = failMessage;
    }
}
