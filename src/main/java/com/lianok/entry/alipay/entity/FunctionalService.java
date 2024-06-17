package com.lianok.entry.alipay.entity;

import java.util.List;

/**
 * @author lianok.com
 */
public class FunctionalService {
    private String content;
    private List<OrderExtInfo> extInfo;
    private String functionCode;
    private String functionName;
    private String functionType;
    private String functionUrl;
    private String memo;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<OrderExtInfo> getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(List<OrderExtInfo> extInfo) {
        this.extInfo = extInfo;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionType() {
        return functionType;
    }

    public void setFunctionType(String functionType) {
        this.functionType = functionType;
    }

    public String getFunctionUrl() {
        return functionUrl;
    }

    public void setFunctionUrl(String functionUrl) {
        this.functionUrl = functionUrl;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
