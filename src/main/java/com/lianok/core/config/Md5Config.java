package com.lianok.core.config;

import com.lianok.core.emuns.EncryEnum;
import com.lianok.core.emuns.EnvEnum;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.utils.CollectionUtils;
import com.lianok.core.utils.SecurityUtils;

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
        Map<String, Object> paramsMap = new TreeMap(request.getParams());
        paramsMap.put("authCode", getAuthCode());
        paramsMap.put("resource", request.getResource());
        paramsMap.put("requestTime", request.getRequestTime());
        paramsMap.put("versionNo", request.getVersionNo());
        String strParams = CollectionUtils.mapToStr(paramsMap);
        strParams = strParams.toLowerCase();
        strParams = strParams + "&" + getKey();
        return SecurityUtils.md5(strParams);
    }

}
