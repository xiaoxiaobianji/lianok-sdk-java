package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class Reasons {

    /**
     * 标识商品具体问题的图片
     */
    private List<String> problemPic;

    /**
     * 描述风险项对应的具体问题
     */
    private String remark;

    /**
     * 描述商品问题的类别，例如“商品页面”、“商品标题”...
     */
    private String riskName;

    public List<String> getProblemPic() {
        return problemPic;
    }

    public void setProblemPic(List<String> problemPic) {
        this.problemPic = problemPic;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName;
    }
}
