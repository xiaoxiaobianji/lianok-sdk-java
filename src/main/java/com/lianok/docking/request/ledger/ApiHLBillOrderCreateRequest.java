package com.lianok.docking.request.ledger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.request.model.MerchantShareBillDetailCreate;
import com.lianok.docking.response.ledger.ApiHLBillOrderCreateResponse;

import java.math.BigDecimal;
import java.util.List;

/**
 * 分账申请
 *
 * @author linshu
 * @create 2022/11/2 11:19
 */
public class ApiHLBillOrderCreateRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.bill.order.create";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLBillOrderCreateResponse.class;
    }

    @JSONField(name = "merchantNo")
    private String merchantNo;
    @JSONField(name = "channelCode")
    private String channelCode;
    @JSONField(name = "billNo")
    private String billNo;
    @JSONField(name = "shareAmount")
    private BigDecimal shareAmount;
    @JSONField(name = "remark")
    private String remark;
    @JSONField(name = "details")
    private String details;

    public String getMerchantNo() {
        return merchantNo;
    }

    /**
     * 商户编号
     * @param merchantNo
     */
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelCode() {
        return channelCode;
    }

    /**
     * 渠道编号
     * @param channelCode
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getBillNo() {
        return billNo;
    }

    /**
     * 对接商分账单号
     * @param billNo
     */
    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public BigDecimal getShareAmount() {
        return shareAmount;
    }

    /**
     * 分账总金额
     * @param shareAmount
     */
    public void setShareAmount(BigDecimal shareAmount) {
        this.shareAmount = shareAmount;
    }

    public String getRemark() {
        return remark;
    }

    /**
     * 分账备注
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDetails() {
        return details;
    }

    /**
     * 分账明细
     * @param details
     */
    public void setDetails(List<MerchantShareBillDetailCreate> details) {
        this.details = JSON.toJSONString(details);
    }
}
