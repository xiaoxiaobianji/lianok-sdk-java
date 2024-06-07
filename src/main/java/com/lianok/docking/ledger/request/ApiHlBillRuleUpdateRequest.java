package com.lianok.docking.ledger.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.ledger.response.ApiHlBillRuleUpdateResponse;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 分账规则修改
 *
 * @author lianok.com
 */
public class ApiHlBillRuleUpdateRequest extends AbstractDockingRequest {

    /**
     * 分账规则编号
     */
    private Long id;
    /**
     * 分账方商户编号
     */
    private String merchantNo;
    /**
     * 分账接收方商户ID
     */
    private String receiveMerchantNo;
    /**
     * 分账比例
     */
    private Integer sharePercent;
    /**
     * 有效期规则: 分账规则生效日期
     */
    private LocalDateTime ruleEffectiveDate;
    /**
     * 有效期规则: 分账规则失效日期
     */
    private LocalDateTime ruleExpiredDate;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "api.hl.bill.rule.update";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBillRuleUpdateResponse.class;
    }
}
