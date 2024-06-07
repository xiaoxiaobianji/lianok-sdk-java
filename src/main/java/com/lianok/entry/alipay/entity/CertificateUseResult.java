package com.lianok.entry.alipay.entity;

/**
 * @author lianok.com
 */
public class CertificateUseResult {

    /**
     * 凭证实例的金额信息，在异常场景下可能为空，需要判断是否有值才可进行使用。
     */
    private CertificateInstanceAmountInfo amountInfo;

    /**
     * 三方码
     */
    private String code;

    /**
     * 核销准备返回的支付宝平台加密券码
     */
    private String encryptedCode;

    /**
     * 结果说明
     */
    private String msg;

    /**
     * 商家侧核销对应的交易订单id
     */
    private String outOrderId;

    /**
     * 核销结果枚举
     */
    private String result;

    /**
     * 核销操作单号,核销成功必填,撤销核销使用
     */
    private String useOrderNo;

    public CertificateInstanceAmountInfo getAmountInfo() {
        return amountInfo;
    }

    public void setAmountInfo(CertificateInstanceAmountInfo amountInfo) {
        this.amountInfo = amountInfo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEncryptedCode() {
        return encryptedCode;
    }

    public void setEncryptedCode(String encryptedCode) {
        this.encryptedCode = encryptedCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getUseOrderNo() {
        return useOrderNo;
    }

    public void setUseOrderNo(String useOrderNo) {
        this.useOrderNo = useOrderNo;
    }
}
