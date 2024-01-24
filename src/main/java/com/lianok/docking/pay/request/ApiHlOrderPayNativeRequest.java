package com.lianok.docking.pay.request;

import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.pay.response.ApiHlOrderPayNativeResponse;

import java.math.BigDecimal;

/**
 * 适用于消费者通过扫描二维码或直接访问支付链接发起支付，完成支付的场景。支持微信、支付宝。
 */
public class ApiHlOrderPayNativeRequest extends AbstractDockingRequest {

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
     * 收银设备ID,
     * 火脸后台的收银设备ID为火脸后台录入的收银设备的设备ID。可在火脸服务商后台-设备管理或商家后台-设备管理中查看
     */
    private String deviceNo;
    /**
     * 异步通知地址，若火脸平台已配置，则非必填
     */
    private String notifyUrl;
    /**
     * 花呗分期数,
     * 支持3、6、12期
     * 银盛、支付宝直连通道传入花呗分期数需与官方申请开通才可以传入，银盛通道仅支持6期、12期
     */
    private Integer stageNum;
    /**
     * 商品描述,
     * 对应微信支付订单详情中“商品”字段，对应支付宝订单详情中“商品说明字段”
     */
    private String subject;
    /**
     * 支付方式
     * 不传默认支持所有支付方式，传则只生成对应支付方式的支付二维码跳转链接
     * com.lianok.docking.enums.PayWayEnum
     */
    private String payWay;
    /**
     * 支付二维码链接失效时间，
     * 单位为秒，精确到个位
     * 最长不能超过600秒
     * 不填默认300秒
     */
    private Integer payUrlExpireTime;
    /**
     * 商品详情
     * 按微信单品优惠券格式传递透传给微信;请做UrlEncode
     * 无单品券优惠信息请不要传此字段
     */
    private String goodsInfo;
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

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Integer getStageNum() {
        return stageNum;
    }

    public void setStageNum(Integer stageNum) {
        this.stageNum = stageNum;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public Integer getPayUrlExpireTime() {
        return payUrlExpireTime;
    }

    public void setPayUrlExpireTime(Integer payUrlExpireTime) {
        this.payUrlExpireTime = payUrlExpireTime;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    @Override
    public String getResource() {
        return "api.hl.order.pay.native";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlOrderPayNativeResponse.class;
    }
}
