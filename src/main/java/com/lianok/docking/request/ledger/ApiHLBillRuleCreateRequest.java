package com.lianok.docking.request.ledger;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.ledger.ApiHLBillRuleCreateResponse;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 分账规则新增
 *
 * @author linshu
 * @create 2022/11/2 11:29
 */
public class ApiHLBillRuleCreateRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.bill.rule.create";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLBillRuleCreateResponse.class;
    }

    @JSONField(name = "id")
    private Integer id;
    @JSONField(name = "merchantNo")
    private String merchantNo;
    @JSONField(name = "channelCode")
    private String channelCode;
    @JSONField(name = "receiveMerchantNo")
    private String receiveMerchantNo;
    @JSONField(name = "receiveChannelCode")
    private String receiveChannelCode;
    @JSONField(name = "sharePercent")
    private Integer sharePercent;
    /**
     * 有效期规则: 分账规则生效日期
     */
    @JSONField(name = "ruleEffectiveDate")
    private java.time.LocalDateTime ruleEffectiveDate;
    /**
     * 有效期规则: 分账规则失效日期
     */
    @JSONField(name = "ruleExpiredDate")
    private java.time.LocalDateTime ruleExpiredDate;
    /**
     * 分账接收方规则使用状态: 0=禁用 1=启用 参见 AbleFlagEnum
     */
    @JSONField(name = "shareRuleStatus")
    private Integer shareRuleStatus;
    /**
     * 金额规则: 累计最大可分账金额 默认值0标识不校验累计最大分账金额
     */
    @JSONField(name = "maxShareAmount")
    private BigDecimal maxShareAmount;
    /**
     * 金额规则: 月累计最大可分账金额, 默认值0标识不校验月最大分账金额
     */
    @JSONField(name = "maxMonthShareAmount")
    private BigDecimal maxMonthShareAmount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getSharePercent() {
        return sharePercent;
    }

    public void setSharePercent(Integer sharePercent) {
        this.sharePercent = sharePercent;
    }

    public LocalDateTime getRuleEffectiveDate() {
        return ruleEffectiveDate;
    }

    public void setRuleEffectiveDate(LocalDateTime ruleEffectiveDate) {
        this.ruleEffectiveDate = ruleEffectiveDate;
    }

    public LocalDateTime getRuleExpiredDate() {
        return ruleExpiredDate;
    }

    public void setRuleExpiredDate(LocalDateTime ruleExpiredDate) {
        this.ruleExpiredDate = ruleExpiredDate;
    }

    public Integer getShareRuleStatus() {
        return shareRuleStatus;
    }

    /**
     * 分账接收方规则使用状态 (说明:0=禁用 1=启用)
     * @param shareRuleStatus
     */
    public void setShareRuleStatus(Integer shareRuleStatus) {
        this.shareRuleStatus = shareRuleStatus;
    }

    public BigDecimal getMaxShareAmount() {
        return maxShareAmount;
    }

    public void setMaxShareAmount(BigDecimal maxShareAmount) {
        this.maxShareAmount = maxShareAmount;
    }

    public BigDecimal getMaxMonthShareAmount() {
        return maxMonthShareAmount;
    }

    public void setMaxMonthShareAmount(BigDecimal maxMonthShareAmount) {
        this.maxMonthShareAmount = maxMonthShareAmount;
    }
}
