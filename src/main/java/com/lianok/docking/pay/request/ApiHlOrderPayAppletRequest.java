package com.lianok.docking.pay.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.entity.DockingResponseBase;
import com.lianok.docking.pay.response.ApiHlOrderPayAppletResponse;

import java.math.BigDecimal;

/**
 * 小程序支付接口
 * 通过接口可以获取微信/支付宝小程序支付需要的TradeNo/JSPayInfo
 */
public class ApiHlOrderPayAppletRequest extends AbstractDockingRequest {

    /**
     * 商户ID
     * 火脸商户ID，在火脸服务商后台-商户列表或商家后台-门店列表，可查看该字段
     */
    private String merchantNo;
    /**
     * 操作者账号
     * 收银员手机号或收银员登陆账号。手机号一般为商户注册火脸时的手机号。在火脸商户后台员工管理中，可配置收银员，收银员登陆支持手机号和账号登陆。可在商户后台-员工管理中查看所有收银员的手机号、登陆账号。
     */
    private String operatorAccount;
    /**
     * 对接商系统订单号
     * 由对接商自行定义规范，最大长度不超过64
     */
    private String businessOrderNo;
    /**
     * 订单支付金额
     * 单位为元，精确到0.01
     */
    private BigDecimal payAmount;
    /**
     * 支付类型
     * com.lianok.docking.enums.PayWayEnum
     */
    private String payWay;
    /**
     * 微信小程序AppId
     * payWay等于wechat时必填
     */
    private String appId;
    /**
     * 微信用户标识
     * payWay等于wechat时必填
     */
    private String openId;
    /**
     * 支付宝用户标识
     * payWay等于alipay时必填
     */
    private String userId;
    /**
     * 收银设备ID
     * 火脸后台的收银设备ID为火脸后台录入的收银设备的设备ID。可在火脸服务商后台-设备管理或商家后台-设备管理中查看
     */
    private String deviceNo;
    /**
     * 订单备注
     */
    private String remark;
    /**
     * 异步通知地址
     * 上传参数交易成功会把接口推送到此参数，未上传按火脸平台配置推送
     */
    private String notifyUrl;
    /**
     * 商品描述
     * 对应微信支付订单详情中“商品”字段，对应支付宝订单详情中“商品说明字段”
     */
    private String subject;
    /**
     * 订单失效时间
     * 单位为秒，精确到个位
     * 火脸默认订单失效时间为30分钟,失效时间需大于60秒
     */
    private Integer payExpireTime;
    /**
     * 花呗分期数
     * 支持3、6、12期
     * 银盛、支付宝直连通道传入花呗分期数需与官方申请开通才可以传入，银盛通道仅支持6期、12期
     */
    private Integer stageNum;
    /**
     * 订单优惠标记
     * 订单优惠标记，透传给微信
     * 创建券时如果添加goodsTag标记，在传入goodsTag参数才可以核销对应券
     */
    private String goodsTag;
    /**
     * 商品详情
     * 按微信单品优惠券格式传递透传给微信;请做UrlEncode
     * 无单品券优惠信息请不要传此字段
     */
    @JSONField(name = "goods_info")
    private Object goodsInfo;
    /**
     * 订单分账标识
     * 0不分账
     * 1分账
     * 2延时结算
     * 不传默认为普通交易
     */
    private Integer shareMarkFlag;

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

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getPayExpireTime() {
        return payExpireTime;
    }

    public void setPayExpireTime(Integer payExpireTime) {
        this.payExpireTime = payExpireTime;
    }

    public Integer getStageNum() {
        return stageNum;
    }

    public void setStageNum(Integer stageNum) {
        this.stageNum = stageNum;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public Object getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(Object goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public Integer getShareMarkFlag() {
        return shareMarkFlag;
    }

    public void setShareMarkFlag(Integer shareMarkFlag) {
        this.shareMarkFlag = shareMarkFlag;
    }

    @Override
    public String getResource() {
        return "api.hl.order.pay.applet";
    }

    @Override
    public Class<? extends DockingResponseBase> getResponseClass() {
        return ApiHlOrderPayAppletResponse.class;
    }

}
