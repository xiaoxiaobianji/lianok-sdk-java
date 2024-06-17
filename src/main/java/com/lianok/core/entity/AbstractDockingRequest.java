package com.lianok.core.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.core.IDockingRequest;
import com.lianok.core.utils.StrUtils;

import java.lang.reflect.Field;
import java.util.*;

/**
 * 请求对象基类
 *
 * @author lianok.com
 */
public abstract class AbstractDockingRequest implements IDockingRequest {

    /**
     * 具体业务的接口名称
     *
     * @return 开放平台资源名称
     */
    @JSONField(serialize = false)
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

    void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    @Override
    @JSONField(serialize = false)
    public Map<String, Object> getParams() {
        Class<? extends AbstractDockingRequest> aClass = getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        Map<String, Object> map = new HashMap<>(declaredFields.length);
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
                map.put(fieldName, fieldValue);
            }
        }
        return map;
    }
}
