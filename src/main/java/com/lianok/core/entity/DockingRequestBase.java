package com.lianok.core.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.core.IDockingRequest;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 请求对象基类
 */
public abstract class DockingRequestBase implements IDockingRequest {

    /**
     * 接口名称
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
        Class<? extends DockingRequestBase> aClass = getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            JSONField field = declaredField.getAnnotation(JSONField.class);
            declaredField.setAccessible(true);
            String fieldName = field == null ? declaredField.getName() : field.name();
            Object fieldValue = null;
            try {
                fieldValue = declaredField.get(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (null != fieldValue) {
                map.put(fieldName, fieldValue);
            }
        }

        return map;
    }
}
