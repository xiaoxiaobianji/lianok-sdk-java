package com.lianok.docking;

import com.alibaba.fastjson.annotation.JSONField;
import com.lianok.docking.util.EncryEnum;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author linshu
 * @create 2022/8/20 18:44
 */
public abstract class DockingRequestBase implements IDockingRequest {

    /**
     * 获取接口名称
     *
     * @return 接口名称
     */
    @Override
    @JSONField(serialize = false)
    public abstract String getApiName();

    @JSONField(serialize = false)
    public abstract Class<? extends DockingResponseBase> getResponseClass();

    @Override
    @JSONField(serialize = false)
    public Map<String, Object> getParams() {
        Map<String, Object> map = new HashMap<>();

        Class<? extends DockingRequestBase> aClass = getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            JSONField field = declaredField.getAnnotation(JSONField.class);
            if (null == field) {
                continue;
            }
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

    /**
     * 对接接口加密类型，默认md5
     *
     * @return 接口加密类型
     */
    @JSONField(serialize = false)
    public EncryEnum getEncryptType() {
        return EncryEnum.MD5;
    }

    /**
     * 对接接口版本，默认 1
     *
     * @return 接口版本
     */
    @JSONField(serialize = false)
    public String getVersionNo() {
        return "1";
    }
}
