package com.lianok.entry.alipay.entity;

/**
 * @author lianok.com
 */
public class Attribute {

    /**
     * 是否必填属性
     */
    private Boolean isRequired;

    /**
     * 属性key
     */
    private String key;

    /**
     * 属性值长度区间,上下限,分隔,属性组件类型是input时可用
     */
    private String length;

    /**
     * 属性名称
     */
    private String name;

    /**
     * 属性值范围区间,上下限,分隔,属性组件类型是number_picker时可用
     */
    private String range;

    /**
     * 属性组件类型
     */
    private String type;

    /**
     * 属性值枚举,多值;分隔
     */
    private String value;

    public Boolean getRequired() {
        return isRequired;
    }

    public void setRequired(Boolean required) {
        isRequired = required;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
