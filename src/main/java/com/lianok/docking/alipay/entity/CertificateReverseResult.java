package com.lianok.docking.alipay.entity;

public class CertificateReverseResult {

    /**
     * 结果说明
     */
    private String msg;

    /**
     * 撤销结果枚举
     */
    private String result;

    /**
     * 撤销接口传入的核销操作单号
     */
    private String useOrderNo;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
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
