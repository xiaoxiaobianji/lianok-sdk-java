package com.lianok.docking.bill.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.bill.response.ApiHlOrderAccountStatementApplyResponse;

/**
 * 对账单申请
 */
public class ApiHlOrderAccountStatementApplyReuqest extends AbstractDockingRequest {

    @Override
    public String getResource() {
        return "api.hl.order.accountStatementApply";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlOrderAccountStatementApplyResponse.class;
    }

    /**
     * 下载对账日期
     * 格式：yyyy-MM-dd
     */
    private String billDate;
    /**
     * 下载类型
     * 1：日统计数据
     * 2：收款明细数据
     * 3：退款明细数据
     * 4：分账明细对账单
     * 5：延时结算订单冻资明细
     * 6：延时结算确认订单明细
     * 7：延时结算退款订单明细
     */
    private int downType;
    /**
     * 商户号
     */
    private String merchantNo;


    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public int getDownType() {
        return downType;
    }

    public void setDownType(int downType) {
        this.downType = downType;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

}
