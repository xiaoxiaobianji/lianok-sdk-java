package com.lianok.docking.request.model;

import java.math.BigDecimal;

/**
 * @author linshu
 * @create 2022/11/2 13:31
 */
public class MerchantShareBillDetailCreate {

    private String receiveMerchantNo;
    private String receiveChannelCode;
    private BigDecimal shareAmount;

    public String getReceiveMerchantNo() {
        return receiveMerchantNo;
    }

    /**
     * 分账接收方商户编号
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
     * @param shareAmount
     */
    public void setShareAmount(BigDecimal shareAmount) {
        this.shareAmount = shareAmount;
    }
}
