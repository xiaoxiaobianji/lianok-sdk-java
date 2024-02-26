package com.lianok.core.entity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.core.IDockingRequest;
import com.lianok.core.utils.StrUtils;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.*;

/**
 * 请求对象基类
 */
public abstract class AbstractDockingRequest implements IDockingRequest {

    /**
     * 具体业务的接口名称
     *
     * @return 开放平台资源名称
     */
    public abstract String getResource();

    /**
     * 对接接口版本，默认 1
     */
    @JSONField(serialize = false)
    private String versionNo = "1";

    /**
     * 当前时间
     * 格式：yyyyMMddHHmmss
     */
    @JSONField(serialize = false)
    private String requestTime;

    /**
     * 签名方式，sdk内使用
     */
    @JSONField(serialize = false)
    private Integer signType = 0;

    /**
     * 返回接口对象
     *
     * @return
     */
    @JSONField(serialize = false)
    public abstract Class<? extends DockingResponseBase> getResponseClass();

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }


    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> map = new HashMap<>();
        Class<? extends AbstractDockingRequest> aClass = getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            JSONField field = declaredField.getAnnotation(JSONField.class);
            declaredField.setAccessible(true);
            String fieldName = "";
            if (field != null) {
                fieldName = field.name();
                if (!field.serialize()) {
                    continue;
                }
            }
            if (StrUtils.isEmpty(fieldName)) {
                fieldName = declaredField.getName();
            }
            Object fieldValue = null;
            try {
                fieldValue = declaredField.get(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (null != fieldValue) {
                if (isBaseType(fieldValue)) {
                    map.put(fieldName, fieldValue);
                } else {
                    map.put(fieldName, JSON.toJSONString(fieldValue));
                }
            }
        }
        return map;
    }

    private Boolean allowCollect(Object obj) {
        if (obj instanceof Byte || obj instanceof Integer || obj instanceof Short || obj instanceof Float || obj instanceof Double
                || obj instanceof Long || obj instanceof Boolean || obj instanceof Character || obj instanceof String || obj instanceof BigDecimal
                || obj instanceof List || obj instanceof Set || obj instanceof Queue || obj instanceof Map
        ) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private Boolean isBaseType(Object obj) {
        if (obj instanceof Byte || obj instanceof Integer || obj instanceof Short || obj instanceof Float || obj instanceof Double
                || obj instanceof Long || obj instanceof Boolean || obj instanceof Character || obj instanceof String || obj instanceof BigDecimal
        ) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
