package com.lianok.entry.alipay.request;

import com.lianok.core.entity.AbstractEntryRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.entry.alipay.response.ApiHlAlipayMiniOrderCreateResponse;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * @author lianok.com
 */
public class ApiHlAlipayMiniOrderCreateRequest extends AbstractEntryRequest {

    /**
     * 商户号
     */
    private String merchantNo;

    private String operatorAccount;

    private String businessOrderNo;

    private java.math.BigDecimal payAmount;

    private String deviceNo;

    private String remark;

    private String notifyUrl;

    private String origin;

    private String payWay;

    private String stageType;

    private Integer stageNum;

    private Integer payUrlExpireTime;

    private Integer payExpireTime;

    /**
     * 限制的支付类型
     */
    private Integer limitPay;

    /**
     * 订单标题
     */
    private String subject;

    /**
     * 订单优惠标记
     */
    private String goodsTag;

    /**
     * 优惠详情信息上传该参数作为优惠券核销
     */
    private String goodsInfo;

    /**
     * 订单分账标记 0=普通订单 1=分账订单 2=延时结算订单
     */
    private Integer shareMarkFlag;

    /**
     * 支付宝sellerId
     */
    private String sellerId;
    /**
     * 支付宝userId
     */
    private String userId;

    /**
     * 用户端ip
     */
    private String remoteIp;

    /**
     * 追踪ID
     * 公域分发场景必传,会影响主播归因、分享员归因等；通过调用 my.checkBeforeAddOrder 接口返回
     */
    private String sourceId;

    /**
     * 订单类型
     * 电商购物: KX_SHOPPING  团购劵: GROUP_SECURITIES  虚拟商品: VIRTUAL_RECHARGE
     */
    private String merchantBizType;

    /**
     * 商家小程序对应的订单详情页路径地址
     */
    private String path;

    private MiniOrderCreateContactInfo contactInfo;
    private MiniOrderCreateAddressInfo addressInfo;
    private MiniOrderCreateOrderDetail orderDetail;
    private MiniOrderCreatePromoDetailInfo promoDetailInfo;
    private MiniOrderCreateExtInfo extInfo;
    private MiniOrderCreateDeliveryDetail deliveryDetail;
    private MiniOrderCreateDefaultReceivingAddress defaultReceivingAddress;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOperatorAccount() {
        return operatorAccount;
    }

    public void setOperatorAccount(String operatorAccount) {
        this.operatorAccount = operatorAccount;
    }

    public String getBusinessOrderNo() {
        return businessOrderNo;
    }

    public void setBusinessOrderNo(String businessOrderNo) {
        this.businessOrderNo = businessOrderNo;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getStageType() {
        return stageType;
    }

    public void setStageType(String stageType) {
        this.stageType = stageType;
    }

    public Integer getStageNum() {
        return stageNum;
    }

    public void setStageNum(Integer stageNum) {
        this.stageNum = stageNum;
    }

    public Integer getPayUrlExpireTime() {
        return payUrlExpireTime;
    }

    public void setPayUrlExpireTime(Integer payUrlExpireTime) {
        this.payUrlExpireTime = payUrlExpireTime;
    }

    public Integer getPayExpireTime() {
        return payExpireTime;
    }

    public void setPayExpireTime(Integer payExpireTime) {
        this.payExpireTime = payExpireTime;
    }

    public Integer getLimitPay() {
        return limitPay;
    }

    public void setLimitPay(Integer limitPay) {
        this.limitPay = limitPay;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public Integer getShareMarkFlag() {
        return shareMarkFlag;
    }

    public void setShareMarkFlag(Integer shareMarkFlag) {
        this.shareMarkFlag = shareMarkFlag;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getMerchantBizType() {
        return merchantBizType;
    }

    public void setMerchantBizType(String merchantBizType) {
        this.merchantBizType = merchantBizType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public MiniOrderCreateContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(MiniOrderCreateContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public MiniOrderCreateAddressInfo getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(MiniOrderCreateAddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }

    public MiniOrderCreateOrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(MiniOrderCreateOrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    public MiniOrderCreatePromoDetailInfo getPromoDetailInfo() {
        return promoDetailInfo;
    }

    public void setPromoDetailInfo(MiniOrderCreatePromoDetailInfo promoDetailInfo) {
        this.promoDetailInfo = promoDetailInfo;
    }

    public MiniOrderCreateExtInfo getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(MiniOrderCreateExtInfo extInfo) {
        this.extInfo = extInfo;
    }

    public MiniOrderCreateDeliveryDetail getDeliveryDetail() {
        return deliveryDetail;
    }

    public void setDeliveryDetail(MiniOrderCreateDeliveryDetail deliveryDetail) {
        this.deliveryDetail = deliveryDetail;
    }

    public MiniOrderCreateDefaultReceivingAddress getDefaultReceivingAddress() {
        return defaultReceivingAddress;
    }

    public void setDefaultReceivingAddress(MiniOrderCreateDefaultReceivingAddress defaultReceivingAddress) {
        this.defaultReceivingAddress = defaultReceivingAddress;
    }

    /**
     * 支付宝小程序组件买家联系人信息
     *
     * @author lianok.com
     */
    public static class MiniOrderCreateContactInfo {

        /**
         * 手机号
         */
        private String phoneNumber;
        /**
         * 联系人姓名
         */
        private String contactName;

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getContactName() {
            return contactName;
        }

        public void setContactName(String contactName) {
            this.contactName = contactName;
        }
    }

    /**
     * 支付宝小程序组件订单收货地址
     */
    public static class MiniOrderCreateAddressInfo {

        /**
         * 收货人姓名
         */
        private String receiverName;
        /**
         * 详细收货地址
         */
        private String detailedAddress;
        /**
         * 收货人手机号
         */
        private String telNumber;
        /**
         * 收货邮编地址
         */
        private String receiverZip;
        /**
         * 标准城市域码
         */
        private String receiverDivisionCode;

        public String getReceiverName() {
            return receiverName;
        }

        public void setReceiverName(String receiverName) {
            this.receiverName = receiverName;
        }

        public String getDetailedAddress() {
            return detailedAddress;
        }

        public void setDetailedAddress(String detailedAddress) {
            this.detailedAddress = detailedAddress;
        }

        public String getTelNumber() {
            return telNumber;
        }

        public void setTelNumber(String telNumber) {
            this.telNumber = telNumber;
        }

        public String getReceiverZip() {
            return receiverZip;
        }

        public void setReceiverZip(String receiverZip) {
            this.receiverZip = receiverZip;
        }

        public String getReceiverDivisionCode() {
            return receiverDivisionCode;
        }

        public void setReceiverDivisionCode(String receiverDivisionCode) {
            this.receiverDivisionCode = receiverDivisionCode;
        }
    }

    /**
     * 订单信息
     */
    public static class MiniOrderCreateOrderDetail {
        private List<MiniOrderCreateItemInfos> itemInfos;
        private MiniOrderCreatePriceInfo priceInfo;

        public List<MiniOrderCreateItemInfos> getItemInfos() {
            return itemInfos;
        }

        public void setItemInfos(List<MiniOrderCreateItemInfos> itemInfos) {
            this.itemInfos = itemInfos;
        }

        public MiniOrderCreatePriceInfo getPriceInfo() {
            return priceInfo;
        }

        public void setPriceInfo(MiniOrderCreatePriceInfo priceInfo) {
            this.priceInfo = priceInfo;
        }

        /**
         * 商品详细信息
         */
        public static class MiniOrderCreateItemInfos {

            /**
             * 商户商品ID
             */
            private String outItemId;
            /**
             * 商户商品sku_id
             */
            private String outSkuId;
            /**
             * 商品名称
             */
            private String goodsName;
            /**
             * 商品数量
             */
            private String itemCnt;
            /**
             * 商品单价
             */
            private String salePrice;
            /**
             * 商品实际单价
             */
            private String saleRealPrice;
            /**
             * 商品的编号
             */
            private String goodsId;
            /**
             * 商家商品素材ID
             */
            private String imageMaterialId;
            /**
             * 商品描述信息
             */
            private String body;
            /**
             * 租金信息
             */
            private MiniOrderCreateItemRentInfo rentInfo;

            private String categoriesTree;
            private String goodsCategory;
            private String platformItemVersionId;
            private String showUrl;

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

            public String getGoodsName() {
                return goodsName;
            }

            public void setGoodsName(String goodsName) {
                this.goodsName = goodsName;
            }

            public String getItemCnt() {
                return itemCnt;
            }

            public void setItemCnt(String itemCnt) {
                this.itemCnt = itemCnt;
            }

            public String getSalePrice() {
                return salePrice;
            }

            public void setSalePrice(String salePrice) {
                this.salePrice = salePrice;
            }

            public String getSaleRealPrice() {
                return saleRealPrice;
            }

            public void setSaleRealPrice(String saleRealPrice) {
                this.saleRealPrice = saleRealPrice;
            }

            public String getGoodsId() {
                return goodsId;
            }

            public void setGoodsId(String goodsId) {
                this.goodsId = goodsId;
            }

            public String getImageMaterialId() {
                return imageMaterialId;
            }

            public void setImageMaterialId(String imageMaterialId) {
                this.imageMaterialId = imageMaterialId;
            }

            public String getBody() {
                return body;
            }

            public void setBody(String body) {
                this.body = body;
            }

            public MiniOrderCreateItemRentInfo getRentInfo() {
                return rentInfo;
            }

            public void setRentInfo(MiniOrderCreateItemRentInfo rentInfo) {
                this.rentInfo = rentInfo;
            }

            public String getCategoriesTree() {
                return categoriesTree;
            }

            public void setCategoriesTree(String categoriesTree) {
                this.categoriesTree = categoriesTree;
            }

            public String getGoodsCategory() {
                return goodsCategory;
            }

            public void setGoodsCategory(String goodsCategory) {
                this.goodsCategory = goodsCategory;
            }

            public String getPlatformItemVersionId() {
                return platformItemVersionId;
            }

            public void setPlatformItemVersionId(String platformItemVersionId) {
                this.platformItemVersionId = platformItemVersionId;
            }

            public String getShowUrl() {
                return showUrl;
            }

            public void setShowUrl(String showUrl) {
                this.showUrl = showUrl;
            }

            /**
             * 租金信息
             */
            public static class MiniOrderCreateItemRentInfo {

                private String initialRentPrice;
                private String periodRealRentPrice;
                private String periodNum;
                private String buyoutPrice;
                private String finishRealRentPrice;
                private String addonPeriodNum;
                private String addonRealRentPrice;
                private String imageMaterialId;

                public String getInitialRentPrice() {
                    return initialRentPrice;
                }

                public void setInitialRentPrice(String initialRentPrice) {
                    this.initialRentPrice = initialRentPrice;
                }

                public String getPeriodRealRentPrice() {
                    return periodRealRentPrice;
                }

                public void setPeriodRealRentPrice(String periodRealRentPrice) {
                    this.periodRealRentPrice = periodRealRentPrice;
                }

                public String getPeriodNum() {
                    return periodNum;
                }

                public void setPeriodNum(String periodNum) {
                    this.periodNum = periodNum;
                }

                public String getBuyoutPrice() {
                    return buyoutPrice;
                }

                public void setBuyoutPrice(String buyoutPrice) {
                    this.buyoutPrice = buyoutPrice;
                }

                public String getFinishRealRentPrice() {
                    return finishRealRentPrice;
                }

                public void setFinishRealRentPrice(String finishRealRentPrice) {
                    this.finishRealRentPrice = finishRealRentPrice;
                }

                public String getAddonPeriodNum() {
                    return addonPeriodNum;
                }

                public void setAddonPeriodNum(String addonPeriodNum) {
                    this.addonPeriodNum = addonPeriodNum;
                }

                public String getAddonRealRentPrice() {
                    return addonRealRentPrice;
                }

                public void setAddonRealRentPrice(String addonRealRentPrice) {
                    this.addonRealRentPrice = addonRealRentPrice;
                }

                public String getImageMaterialId() {
                    return imageMaterialId;
                }

                public void setImageMaterialId(String imageMaterialId) {
                    this.imageMaterialId = imageMaterialId;
                }
            }
        }

        /**
         * 价格详细信息
         */
        public static class MiniOrderCreatePriceInfo {

            /**
             * 运费
             */
            private String freight;
            /**
             * 商家优惠金额
             */
            private String discountedPrice;
            /**
             * 附加金额
             */
            private String additionalPrice;
            /**
             * 订单金额
             */
            private String orderPrice;

            public String getFreight() {
                return freight;
            }

            public void setFreight(String freight) {
                this.freight = freight;
            }

            public String getDiscountedPrice() {
                return discountedPrice;
            }

            public void setDiscountedPrice(String discountedPrice) {
                this.discountedPrice = discountedPrice;
            }

            public String getAdditionalPrice() {
                return additionalPrice;
            }

            public void setAdditionalPrice(String additionalPrice) {
                this.additionalPrice = additionalPrice;
            }

            public String getOrderPrice() {
                return orderPrice;
            }

            public void setOrderPrice(String orderPrice) {
                this.orderPrice = orderPrice;
            }
        }
    }

    /**
     * 订单优惠信息
     */
    public static class MiniOrderCreatePromoDetailInfo {

        /**
         * 优惠活动咨询ID
         * 优惠前置咨询组件返回的优惠活动咨询ID
         */
        private String activityConsultId;

        public String getActivityConsultId() {
            return activityConsultId;
        }

        public void setActivityConsultId(String activityConsultId) {
            this.activityConsultId = activityConsultId;
        }
    }

    /**
     * 订单扩展字段
     */
    public static class MiniOrderCreateExtInfo {

        private Date doorTime;
        private String orderStr;

        public Date getDoorTime() {
            return doorTime;
        }

        public void setDoorTime(Date doorTime) {
            this.doorTime = doorTime;
        }

        public String getOrderStr() {
            return orderStr;
        }

        public void setOrderStr(String orderStr) {
            this.orderStr = orderStr;
        }
    }

    /**
     * 物流信息
     */
    public static class MiniOrderCreateDeliveryDetail {
        private String deliveryType;
        private Date deliveryTime;

        public String getDeliveryType() {
            return deliveryType;
        }

        public void setDeliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
        }

        public Date getDeliveryTime() {
            return deliveryTime;
        }

        public void setDeliveryTime(Date deliveryTime) {
            this.deliveryTime = deliveryTime;
        }
    }

    /**
     * 默认退货地址
     */
    public static class MiniOrderCreateDefaultReceivingAddress {

        private String receiverName;
        private String detailedAddress;
        private String telNumber;
        private String receiverZip;
        private String receiverDivisionCode;

        public String getReceiverName() {
            return receiverName;
        }

        public void setReceiverName(String receiverName) {
            this.receiverName = receiverName;
        }

        public String getDetailedAddress() {
            return detailedAddress;
        }

        public void setDetailedAddress(String detailedAddress) {
            this.detailedAddress = detailedAddress;
        }

        public String getTelNumber() {
            return telNumber;
        }

        public void setTelNumber(String telNumber) {
            this.telNumber = telNumber;
        }

        public String getReceiverZip() {
            return receiverZip;
        }

        public void setReceiverZip(String receiverZip) {
            this.receiverZip = receiverZip;
        }

        public String getReceiverDivisionCode() {
            return receiverDivisionCode;
        }

        public void setReceiverDivisionCode(String receiverDivisionCode) {
            this.receiverDivisionCode = receiverDivisionCode;
        }
    }


    @Override
    public String getResource() {
        return "api.hl.alipay.mini.order.create";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlAlipayMiniOrderCreateResponse.class;
    }
}
