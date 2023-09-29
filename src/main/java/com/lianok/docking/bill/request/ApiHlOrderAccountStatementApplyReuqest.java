package com.lianok.docking.bill.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.core.entity.DockingRequestBase;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.bill.response.ApiHlOrderAccountStatementApplyResponse;

/**
 * 对账单申请
 */
public class ApiHlOrderAccountStatementApplyReuqest extends DockingRequestBase {

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
    @JSONField(name = "billDate")
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
    @JSONField(name = "downType")
    private int downType2;
    /**
     * 商户号
     */
    @JSONField(name = "merchantNo")
    private String merchantNo;


    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public int getDownType() {
        return downType2;
    }

    public void setDownType(int downType) {
        this.downType2 = downType;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

}
