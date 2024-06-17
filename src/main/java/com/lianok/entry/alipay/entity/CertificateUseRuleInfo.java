package com.lianok.entry.alipay.entity;

/**
 * @author lianok.com
 */
public class CertificateUseRuleInfo {

    /**
     * 对应本地生活商品模版属性中的时间限制(use_limit)，参考本地生活商品模板文档：https://opendocs.alipay.com/pre-open/07pywg?pathHash=1c499cb5
     */
    private String useLimit;

    /**
     * 对应本地生活商品模版属性中的使用张数限制(use_num_limit)，参考本地生活商品模板文档：https://opendocs.alipay.com/pre-open/07pywg?pathHash=1c499cb5
     */
    private String useNumLimit;

    public String getUseLimit() {
        return useLimit;
    }

    public void setUseLimit(String useLimit) {
        this.useLimit = useLimit;
    }

    public String getUseNumLimit() {
        return useNumLimit;
    }

    public void setUseNumLimit(String useNumLimit) {
        this.useNumLimit = useNumLimit;
    }
}
