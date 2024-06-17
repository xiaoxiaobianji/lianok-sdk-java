package com.lianok.docking.ledger.response;

import com.lianok.core.entity.DockingResponseBase;

import java.util.List;

/**
 * 分账关系查询
 *
 * @author lianok.com
 */
public class ApiHlBillMerchantQueryResponse extends DockingResponseBase {

    private List<BillMerchantRelation> relationList;

    public List<BillMerchantRelation> getRelationList() {
        return relationList;
    }

    public void setRelationList(List<BillMerchantRelation> relationList) {
        this.relationList = relationList;
    }

    public static class BillMerchantRelation {

        private String receiveMerchantNo;
        private String receiveChannelCode;
        private String merchantNo;
        private String channelCode;

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
    }
}
