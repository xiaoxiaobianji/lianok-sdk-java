package com.lianok.docking.ledger.request;

import com.alibaba.fastjson.JSON;
import com.lianok.core.entity.DockingRequestBase;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillOrderCreateResponse;

import java.math.BigDecimal;
import java.util.List;

/**
 * 分账申请
 */
public class ApiHlBillOrderCreateRequest extends DockingRequestBase {


    private String merchantNo;
    private String channelCode;
    private String billNo;
    private BigDecimal shareAmount;
    private String remark;
    private String details;

    public String getMerchantNo() {
        return merchantNo;
    }

    /**
     * 商户编号
     *
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
     *
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
     *
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
     *
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
     *
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
     *
     * @param details
     */
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

        private String receiveMerchantNo;
        private String receiveChannelCode;
        private BigDecimal shareAmount;

        public String getReceiveMerchantNo() {
            return receiveMerchantNo;
        }

        /**
         * 分账接收方商户编号
         *
         * @param receiveMerchantNo
         */
        public void setReceiveMerchantNo(String receiveMerchantNo) {
            this.receiveMerchantNo = receiveMerchantNo;
        }

        public String getReceiveChannelCode() {
            return receiveChannelCode;
        }

        /**
         * 分账渠道编号
         *
         * @param receiveChannelCode
         */
        public void setReceiveChannelCode(String receiveChannelCode) {
            this.receiveChannelCode = receiveChannelCode;
        }

        public BigDecimal getShareAmount() {
            return shareAmount;
        }

        /**
         * 分账金额
         *
         * @param shareAmount
         */
        public void setShareAmount(BigDecimal shareAmount) {
            this.shareAmount = shareAmount;
        }
    }
}
