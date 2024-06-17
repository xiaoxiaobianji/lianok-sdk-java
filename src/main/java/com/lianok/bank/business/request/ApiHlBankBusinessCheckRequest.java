package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankBusinessCheckResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;

/**
 * 打款验证
 *
 * @author lianok.com
 */
public class ApiHlBankBusinessCheckRequest extends AbstractDockingRequest {

    private String ip;
    /**
     * 账号编号
     */
    private String businessNo;
    /**
     * 打款金额
     */
    private BigDecimal amount;
    /**
     * 流水号
     * <p>
     * 1.开户不需要传
     * 2.修改结算卡返回打款验证 上传修改结算卡返回的flowNo
     */
    private String flowNo;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getFlowNo() {
        return flowNo;
    }

    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.business.check";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankBusinessCheckResponse.class;
    }
}
