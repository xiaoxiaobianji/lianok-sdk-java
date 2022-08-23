package com.lianok.docking.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ApiHLOrderAccountStatementApplyResponse;

/**
 * @author linshu
 * @create 2022/8/22 15:54
 */
public class ApiHLOrderAccountStatementApplyReuqest extends DockingRequestBase {

    @Override
    public String getApiName() {
        return "api.hl.order.accountStatementApply";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLOrderAccountStatementApplyResponse.class;
    }

    @JSONField(name = "billDate")
    private String billDate;
    @JSONField(name = "downType")
    private int downType2;
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
