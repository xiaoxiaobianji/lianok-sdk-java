package com.lianok.docking.ledger.request;

import com.alibaba.fastjson.JSON;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillOrderCreateResponse;

import java.math.BigDecimal;
import java.util.List;

/**
 * 余额分账申请
 */
public class ApiHlBillOrderCreateRequest extends AbstractDockingRequest {

    /**
     * 商户编号
     */
    private String merchantNo;
    /**
     * 渠道编号
     */
    private String channelCode;
    /**
     * 对接商分账单号
     */
    private String billNo;
    /**
     * 分账总金额
     */
    private BigDecimal shareAmount;
    /**
     * 分账备注
     */
    private String remark;
    /**
     * 分账明细
     */
    private String details;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public BigDecimal getShareAmount() {
        return shareAmount;
    }

    public void setShareAmount(BigDecimal shareAmount) {
        this.shareAmount = shareAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(List<MerchantShareBillDetailCreate> details) {
        this.details = JSON.toJSONString(details);
    }

    @Override
    public String getResource() {
        return "api.hl.bill.order.create";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillOrderCreateResponse.class;
    }

    public static class MerchantShareBillDetailCreate {

        /**
         * 分账接收方商户编号
         */
        private String receiveMerchantNo;
        /**
         * 分账渠道编号
         */
        private String receiveChannelCode;
        /**
         * 分账金额
         */
        private BigDecimal shareAmount;

        public String getReceiveMerchantNo() {
            return receiveMerchantNo;
        }

        public void setReceiveMerchantNo(String receiveMerchantNo) {
            this.receiveMerchantNo = receiveMerchantNo;
        }

        public String getReceiveChannelCode() {
            return receiveChannelCode;
        }

        public void setReceiveChannelCode(String receiveChannelCode) {
            this.receiveChannelCode = receiveChannelCode;
        }

        public BigDecimal getShareAmount() {
            return shareAmount;
        }

        public void setShareAmount(BigDecimal shareAmount) {
            this.shareAmount = shareAmount;
        }
    }
}
