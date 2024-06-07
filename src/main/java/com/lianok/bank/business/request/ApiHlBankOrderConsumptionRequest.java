package com.lianok.bank.business.request;

import com.lianok.bank.business.response.ApiHlBankOrderConsumptionResponse;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;

/**
 * 非担保交易
 *
 * @author lianok.com
 */
public class ApiHlBankOrderConsumptionRequest extends AbstractDockingRequest {

    private String ip;

    /**
     * 对接方请求流水号，不可重复
     */
    private String thirdOrderNo;

    /**
     * 收款人（卖方）
     */
    private String payeeBusinessNo;

    /**
     * 付款人（买方）
     */
    private String payerBusinessNo;

    /**
     * 付款金额
     */
    private java.math.BigDecimal amount;

    /**
     * 商品订单编号
     */
    private String productOrderId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品订单金额
     */
    private BigDecimal productOrderAmount;

    /**
     * 商品数量
     */
    private Integer productCount;

    private String remark;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getThirdOrderNo() {
        return thirdOrderNo;
    }

    public void setThirdOrderNo(String thirdOrderNo) {
        this.thirdOrderNo = thirdOrderNo;
    }

    public String getPayeeBusinessNo() {
        return payeeBusinessNo;
    }

    public void setPayeeBusinessNo(String payeeBusinessNo) {
        this.payeeBusinessNo = payeeBusinessNo;
    }

    public String getPayerBusinessNo() {
        return payerBusinessNo;
    }

    public void setPayerBusinessNo(String payerBusinessNo) {
        this.payerBusinessNo = payerBusinessNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getProductOrderId() {
        return productOrderId;
    }

    public void setProductOrderId(String productOrderId) {
        this.productOrderId = productOrderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductOrderAmount() {
        return productOrderAmount;
    }

    public void setProductOrderAmount(BigDecimal productOrderAmount) {
        this.productOrderAmount = productOrderAmount;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String getResource() {
        return "api.hl.bank.order.consumption";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlBankOrderConsumptionResponse.class;
    }
}
