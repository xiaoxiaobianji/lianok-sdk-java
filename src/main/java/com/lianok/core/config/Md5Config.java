package com.lianok.core.config;

import com.alibaba.fastjson.JSON;
import com.lianok.core.emuns.EncryEnum;
import com.lianok.core.emuns.EnvEnum;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.utils.CollectionUtils;
import com.lianok.core.utils.SecurityUtils;
import com.lianok.core.utils.StrUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public final class Md5Config extends AbstractConfig {

    public EncryEnum getEncryEnum() {
        return EncryEnum.MD5;
    }

    private Md5Config(EnvEnum env, String authCode, String salt) {
        super(env, authCode, salt);
    }

    public static class Builder extends AbstractConfigBuilder<Builder> {

        public Builder() {
        }

        @Override
        protected Md5Config.Builder self() {
            return this;
        }

        public Builder config(EnvEnum env, String authCode, String key) {
            this.env = env;
            this.authCode = authCode;
            this.key = key;
            return this;
        }

        public Md5Config build() {
            return new Md5Config(Objects.requireNonNull(this.env), Objects.requireNonNull(this.authCode), Objects.requireNonNull(this.key));
        }
    }

    @Override
    public String encrypt(AbstractDockingRequest request) {
        Boolean signByObject = request.getSignByObjectMethod();
        Map<String, Object> pushMap;
        if (signByObject != null && signByObject) {
            String params = JSON.toJSONString(request);
            pushMap = new TreeMap((Map) JSON.parse(params));
        } else {
            pushMap = new TreeMap(request.getParams());
        }
        pushMap.put("authCode", getAuthCode());
        pushMap.put("resource", request.getResource());
        pushMap.put("requestTime", request.getRequestTime());
        pushMap.put("versionNo", request.getVersionNo());
        String strParams = CollectionUtils.mapToStr(pushMap);
        strParams = strParams.toLowerCase();
        strParams = strParams + "&" + getKey();
        return SecurityUtils.md5(strParams);
    }

}
