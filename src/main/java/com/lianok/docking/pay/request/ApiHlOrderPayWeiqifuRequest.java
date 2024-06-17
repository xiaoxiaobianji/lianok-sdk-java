package com.lianok.docking.pay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;

import java.math.BigDecimal;

/**
 * 聚合支付
 *
 * @author lianok.com
 */
public class ApiHlOrderPayWeiqifuRequest extends AbstractDockingRequest {


    /**
     * 对接商系统订单号，
     * 由对接商自行定义规范，最大长度不超过64
     */
    private String businessOrderNo;
    /**
     * 订单支付金额，
     * 单位为元，精确到0.01
     */
    private BigDecimal payAmount;
    /**
     * 订单备注
     */
    private String remark;
    /**
     * 商户ID，
     * 火脸商户ID，在火脸服务商后台-商户列表或商家后台-门店列表，可查看该字段
     */
    private String merchantNo;
    /**
     * 操作者账号，
     * 收银员手机号。手机号一般为商户注册火脸时的手机号。在火脸商户后台员工管理中，可配置收银员，收银员登陆支持手机号登陆。可在商户后台-员工管理中查看所有收银员的手机号。
     */
    private String operatorAccount;
    /**
     * 商品描述,
     * 对应微信支付订单详情中“商品”字段，对应支付宝订单详情中“商品说明字段”
     */
    private String subject;
    /**
     * 异步通知地址，若火脸平台已配置，则非必填
     */
    private String notifyUrl;
    /**
     * 页面回跳地址，支付完成后跳转的页面地址
     */
    private String pageNotifyUrl;
    /**
     * 付款方集合：上送不多于2个付款方信息，不传则不指定付款人。传了就指定对应的付款人付款
     */
    private String payerOptions;
    /**
     * 商品集合串
     */
    private String goods;
    /**
     * 支付类型
     * activeScan：主扫二维码支付
     * applet：小程序支付
     * app：App支付
     * h5：H5支付
     */
    private String payType;
    /**
     * 支付完成前端回跳小程序路径
     */
    private String mpPath;
    /**
     * 支付完成前端回跳小程序appid
     */
    private String mpAppid;
    /**
     * 支付完成前端回跳小程序原始id
     */
    private String mpUsername;
    /**
     * 支付完成前端回跳小程序
     */
    private String mpUrlscheme;
    /**
     * 客户端用户IP
     */
    private String clientIp;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getPageNotifyUrl() {
        return pageNotifyUrl;
    }

    public void setPageNotifyUrl(String pageNotifyUrl) {
        this.pageNotifyUrl = pageNotifyUrl;
    }

    public String getPayerOptions() {
        return payerOptions;
    }

    public void setPayerOptions(String payerOptions) {
        this.payerOptions = payerOptions;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getMpPath() {
        return mpPath;
    }

    public void setMpPath(String mpPath) {
        this.mpPath = mpPath;
    }

    public String getMpAppid() {
        return mpAppid;
    }

    public void setMpAppid(String mpAppid) {
        this.mpAppid = mpAppid;
    }

    public String getMpUsername() {
        return mpUsername;
    }

    public void setMpUsername(String mpUsername) {
        this.mpUsername = mpUsername;
    }

    public String getMpUrlscheme() {
        return mpUrlscheme;
    }

    public void setMpUrlscheme(String mpUrlscheme) {
        this.mpUrlscheme = mpUrlscheme;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    @Override
    public String getResource() {
        return "api.hl.order.pay.weiqifu";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return null;
    }
}
