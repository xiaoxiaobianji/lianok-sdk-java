package com.lianok.docking.ledger.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillRuleCreateResponse;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 自动分账规则修改
 *
 * @author lianok.com
 */
public class ApiHlBillRuleCreateRequest extends AbstractDockingRequest {

    /**
     * 分账方商户ID
     */
    private String merchantNo;
    /**
     * 通道标识
     * com.lianok.docking.enums.ChannelEnum
     */
    private String channelCode;
    /**
     * 分账接收方商户ID
     */
    private String receiveMerchantNo;
    /**
     * 分账接收方通道标识
     */
    private String receiveChannelCode;
    /**
     * 分账比例
     */
    private Integer sharePercent;
    /**
     * 有效期规则: 分账规则生效日期
     */
    private java.time.LocalDateTime ruleEffectiveDate;
    /**
     * 有效期规则: 分账规则失效日期
     */
    private java.time.LocalDateTime ruleExpiredDate;
    /**
     * 分账接收方规则使用状态: 0=禁用 1=启用
     */
    private Integer shareRuleStatus;
    /**
     * 金额规则: 累计最大可分账金额 默认值0标识不校验累计最大分账金额
     */
    private BigDecimal maxShareAmount;
    /**
     * 金额规则: 月累计最大可分账金额, 默认值0标识不校验月最大分账金额
     */
    private BigDecimal maxMonthShareAmount;

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

    @Override
    public String getResource() {
        return "api.hl.bill.rule.create";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillRuleCreateResponse.class;
    }
}
