package com.lianok.docking.request.pay;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.DockingRequestBase;
import com.lianok.docking.DockingResponseBase;
import com.lianok.docking.response.pay.ApiHLOrderPayBarcodeResponse;

import java.math.BigDecimal;

/**
 * 付款码支付
 *
 * @author linshu
 * @create 2022/8/22 17:55
 */
public class ApiHLOrderPayBarcodeRequest extends DockingRequestBase {
    @Override
    public String getApiName() {
        return "api.hl.order.pay.barcode";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHLOrderPayBarcodeResponse.class;
    }

    /**
     * 消费者的付款码，
     * 根据支付授权码自动识别支付通道，目前支持微信、支付宝、云闪付
     */
    @JSONField(name = "payBarcode")
    private String payBarcode;
    /**
     * 对接商系统订单号，
     * 由对接商自行定义规范，最大长度不超过64
     */
    @JSONField(name = "businessOrderNo")
    private String businessOrderNo;
    /**
     * 订单支付金额，
     * 单位为元，精确到0.01
     */
    @JSONField(name = "payAmount")
    private BigDecimal payAmount;
    /**
     * 订单备注
     */
    @JSONField(name = "remark")
    private String remark;
    /**
     * 商户ID
     * 火脸商户ID，在火脸服务商后台-商户列表或商家后台-门店列表，可查看该字段
     */
    @JSONField(name = "merchantNo")
    private String merchantNo;
    /**
     * 操作者账号，
     * 收银员手机号。手机号一般为商户注册火脸时的手机号。在火脸商户后台员工管理中，可配置收银员，收银员登陆支持手机号登陆。可在商户后台-员工管理中查看所有收银员的手机号。
     */
    @JSONField(name = "operatorAccount")
    private String operatorAccount;
    /**
     * 收银设备ID,
     * 火脸后台的收银设备ID为火脸后台录入的收银设备的设备ID。可在火脸服务商后台-设备管理或商家后台-设备管理中查看
     */
    @JSONField(name = "deviceNo")
    private String deviceNo;
    /**
     * 回调地址，若火脸后台已配置，则可以不填。
     */
    @JSONField(name = "notifyUrl")
    private String notifyUrl;
    /**
     * 花呗分期数,
     * 支持3、6、12期
     * 银盛、支付宝直连通道传入花呗分期数需与官方申请开通才可以传入，银盛通道仅支持6期、12期
     */
    @JSONField(name = "stageNum")
    private Integer stageNum;
    /**
     * 商品描述,
     * 对应微信支付订单详情中“商品”字段，对应支付宝订单详情中“商品说明字段”
     */
    @JSONField(name = "subject")
    private String subject;
    /**
     * 限制卡类型，枚举值
     * 取值范围：
     * 1 限定不能使用信用卡支付
     * 2 限制花呗支付
     * 3 限制花呗分期
     * 4 限制所有的信用支付
     */
    @JSONField(name = "limitPay")
    private Integer limitPay;
    /**
     * 订单失效时间，
     * 单位为秒，精确到个位
     * 失效时间范围60秒~600秒，建议传60的整倍数
     * 火脸默认订单失效时间为30分钟
     */
    @JSONField(name = "payExpireTime")
    private Integer payExpireTime;
    /**
     * 订单优惠标记，
     * 订单优惠标记，透传给微信
     * 创建券时如果添加goodsTag标记，在传入goodsTag参数才可以核销对应券
     */
    @JSONField(name = "goodsTag")
    private String goodsTag;
    /**
     * 商品详情
     * 按微信单品优惠券格式传递透传给微信;请做UrlEncode
     */
    @JSONField(name = "goodsInfo")
    private String goodsInfo;
    /**
     * 订单分账标识
     * 0不分账
     * 1分账
     * 2延时结算
     * 不传默认为普通交易
     */
    @JSONField(name = "shareMarkFlag")
    private Integer shareMarkFlag;

    public String getPayBarcode() {
        return payBarcode;
    }

    public void setPayBarcode(String payBarcode) {
        this.payBarcode = payBarcode;
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

    public Integer getLimitPay() {
        return limitPay;
    }

    public void setLimitPay(Integer limitPay) {
        this.limitPay = limitPay;
    }

    public Integer getPayExpireTime() {
        return payExpireTime;
    }

    public void setPayExpireTime(Integer payExpireTime) {
        this.payExpireTime = payExpireTime;
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
}
