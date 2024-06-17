package com.lianok.core.config;

import com.alibaba.fastjson.JSONObject;
import com.lianok.core.emuns.EncryEnum;
import com.lianok.core.emuns.EnvEnum;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.utils.CollectionUtils;
import com.lianok.core.utils.SecurityUtils;

import java.util.Objects;
import java.util.TreeMap;

/**
 * 业务配置
 *
 * @author lianok.com
 */
public final class EntryConfig extends AbstractConfig {

    public EncryEnum getEncryEnum() {
        return EncryEnum.MD5;
    }

    private EntryConfig(String url, String authCode, String salt) {
        super(url, authCode, salt);
    }

    public static class Builder extends AbstractConfigBuilder<Builder> {

        private String url;

        public Builder() {
        }

        @Override
        protected EntryConfig.Builder self() {
            return this;
        }

        public Builder config(EnvEnum env, String authCode, String key) {
            this.env = env;
            switch (env) {
                case TEST:
                    url = "https://testapi.intranet.aduer.com/openapi/v2/api/biz/do";
                    break;
                case PRE:
                    url = "https://entry.pre.lianok.com/openapi/v2/api/biz/do";
                    break;
                case PUBLISH:
                    url = "https://entry.lianok.com/openapi/v2/api/biz/do";
                    break;
                default:
                    throw new NullPointerException();
            }
            this.authCode = authCode;
            this.key = key;
            return this;
        }

        public EntryConfig build() {
            return new EntryConfig(Objects.requireNonNull(this.url), Objects.requireNonNull(this.authCode), Objects.requireNonNull(this.key));
        }
    }

    @Override
    public String encrypt(AbstractDockingRequest request) {
        TreeMap<String, Object> paramMap = new TreeMap();
        paramMap.put("authCode", getAuthCode());
        if (request.getParams() != null) {
            paramMap.put("params", JSONObject.toJSONString(request.getParams()));
        }
        paramMap.put("resource", request.getResource());
        paramMap.put("requestTime", request.getRequestTime());
        if (null != request.getVersionNo()) {
            paramMap.put("versionNo", request.getVersionNo());
        }
        String strParams = CollectionUtils.mapToStr(paramMap);
        strParams = strParams.toLowerCase();
        strParams = strParams + "&" + getKey();
        return SecurityUtils.md5(strParams);
    }
}
