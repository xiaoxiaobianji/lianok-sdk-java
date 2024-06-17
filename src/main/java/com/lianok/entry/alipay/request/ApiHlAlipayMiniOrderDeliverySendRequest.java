package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.response.ApiHlAlipayMiniOrderDeliverySendResponse;

import java.time.LocalDateTime;
import java.util.List;


/**
 * @author lianok.com
 */
public class ApiHlAlipayMiniOrderDeliverySendRequest extends AbstractEntryRequest {
    /**
     * 商户号
     */
    private String merchantNo;

    /**
     * 发货完成标志位, 0: 未发完, 1:已发完
     */
    private Integer finishAllDelivery;
    /**
     * 完成发货时间
     * finish_all_delivery = 1的时候 必传
     * 格式：2023-04-27 10:05:00
     */
    private LocalDateTime shipDoneTime;
    /**
     * 快递信息
     */
    private List<AlipayOpenMiniOrderDeliveryList> deliveryList;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public Integer getFinishAllDelivery() {
        return finishAllDelivery;
    }

    public void setFinishAllDelivery(Integer finishAllDelivery) {
        this.finishAllDelivery = finishAllDelivery;
    }

    public LocalDateTime getShipDoneTime() {
        return shipDoneTime;
    }

    public void setShipDoneTime(LocalDateTime shipDoneTime) {
        this.shipDoneTime = shipDoneTime;
    }

    public List<AlipayOpenMiniOrderDeliveryList> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(List<AlipayOpenMiniOrderDeliveryList> deliveryList) {
        this.deliveryList = deliveryList;
    }

    public class AlipayOpenMiniOrderDeliveryList {

        /**
         * 快递公司ID
         */
        private String deliveryId;
        /**
         * 快递单号
         */
        private String waybillId;
        /**
         * 商品信息
         */
        private List<AlipayOpenMiniOrderDeliveryInfo> itemInfoList;

        public String getDeliveryId() {
            return deliveryId;
        }

        public void setDeliveryId(String deliveryId) {
            this.deliveryId = deliveryId;
        }

        public String getWaybillId() {
            return waybillId;
        }

        public void setWaybillId(String waybillId) {
            this.waybillId = waybillId;
        }

        public List<AlipayOpenMiniOrderDeliveryInfo> getItemInfoList() {
            return itemInfoList;
        }

        public void setItemInfoList(List<AlipayOpenMiniOrderDeliveryInfo> itemInfoList) {
            this.itemInfoList = itemInfoList;
        }
    }
    public class AlipayOpenMiniOrderDeliveryInfo{
        /**
         * 商户商品ID
         */
        private String outItemId;
        /**
         * 商户商品sku_id
         */
        private String outSkuId;
        /**
         * 商品数量
         */
        private Integer itemCnt;
        /**
         * 商品的编号
         */
        private String goodsId;

        public String getOutItemId() {
            return outItemId;
        }

        public void setOutItemId(String outItemId) {
            this.outItemId = outItemId;
        }

        public String getOutSkuId() {
            return outSkuId;
        }

        public void setOutSkuId(String outSkuId) {
            this.outSkuId = outSkuId;
        }

        public Integer getItemCnt() {
            return itemCnt;
        }

        public void setItemCnt(Integer itemCnt) {
            this.itemCnt = itemCnt;
        }

        public String getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(String goodsId) {
            this.goodsId = goodsId;
        }
    }

    @Override
    public String getResource() {
        return "api.hl.alipay.mini.order.delivery.send";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayMiniOrderDeliverySendResponse.class;
    }
}
