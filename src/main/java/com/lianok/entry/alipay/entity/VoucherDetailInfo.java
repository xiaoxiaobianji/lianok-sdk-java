package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class VoucherDetailInfo {

    /**
     * 优惠券金额，单位：元，精确到小数点后两位。
     */
    private String amount;

    /**
     * 券id
     */
    private String id;

    /**
     * 备注信息
     */
    private String memo;

    /**
     * 商户出资，单位为元,精确到小数点后两位
     */
    private String merchantContribute;

    /**
     * 券名称
     */
    private String name;

    /**
     * 其他出资，非交易商家，单位为元
     */
    private String otherContribute;

    /**
     * 其他出资方明细
     */
    private List<ContributeDetailInfo> otherContributeDetail;

    /**
     * 购买该张券时内部出资的部分（包含支付宝/口碑出资的部分），单位：元，精确到小数点后两位
     */
    private String purchaseAntContribute;

    /**
     * 购买该张券的资金中买家自己出资的部分，单位：元，精确到小数点后两位
     */
    private String purchaseBuyerContribute;

    /**
     * 购买该张券的资金中商户出资的部分，单位：元，精确到小数点后两位
     */
    private String purchaseMerchantContribute;

    /**
     * 券模板id
     */
    private String templateId;

    /**
     * 券类型
     */
    private String type;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMerchantContribute() {
        return merchantContribute;
    }

    public void setMerchantContribute(String merchantContribute) {
        this.merchantContribute = merchantContribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherContribute() {
        return otherContribute;
    }

    public void setOtherContribute(String otherContribute) {
        this.otherContribute = otherContribute;
    }

    public List<ContributeDetailInfo> getOtherContributeDetail() {
        return otherContributeDetail;
    }

    public void setOtherContributeDetail(List<ContributeDetailInfo> otherContributeDetail) {
        this.otherContributeDetail = otherContributeDetail;
    }

    public String getPurchaseAntContribute() {
        return purchaseAntContribute;
    }

    public void setPurchaseAntContribute(String purchaseAntContribute) {
        this.purchaseAntContribute = purchaseAntContribute;
    }

    public String getPurchaseBuyerContribute() {
        return purchaseBuyerContribute;
    }

    public void setPurchaseBuyerContribute(String purchaseBuyerContribute) {
        this.purchaseBuyerContribute = purchaseBuyerContribute;
    }

    public String getPurchaseMerchantContribute() {
        return purchaseMerchantContribute;
    }

    public void setPurchaseMerchantContribute(String purchaseMerchantContribute) {
        this.purchaseMerchantContribute = purchaseMerchantContribute;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
