package com.lianok.core.config;

import com.lianok.core.emuns.EncryEnum;
import com.lianok.core.emuns.EnvEnum;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.utils.CollectionUtils;
import com.lianok.core.utils.SecurityUtils;

import java.util.Objects;
import java.util.TreeMap;

/**
 * 交易配置
 *
 * @author lianok.com
 */
public final class Md5Config extends AbstractConfig {

    public EncryEnum getEncryEnum() {
        return EncryEnum.MD5;
    }

    private Md5Config(String url, String authCode, String salt) {
        super(url, authCode, salt);
    }

    public static class Builder extends AbstractConfigBuilder<Builder> {

        private String url;

        public Builder() {
        }

        @Override
        protected Md5Config.Builder self() {
            return this;
        }

        public Builder config(EnvEnum env, String authCode, String key) {
            this.env = env;
            switch (env) {
                case TEST:
                    url = "http://testapi.intranet.aduer.com/open/v1/api/biz/do";
                    break;
                case PRE:
                    url = "https://open.pre.lianok.com/open/v1/api/biz/do";
                    break;
                case PUBLISH:
                    url = "https://open.lianok.com/open/v1/api/biz/do";
                    break;
                default:
                    throw new NullPointerException();
            }
            this.authCode = authCode;
            this.key = key;
            return this;
        }

        public Md5Config build() {
            return new Md5Config(Objects.requireNonNull(this.url), Objects.requireNonNull(this.authCode), Objects.requireNonNull(this.key));
        }
    }

    @Override
    public String encrypt(AbstractDockingRequest request) {
        TreeMap<String, Object> pushMap = new TreeMap(request.getParams());
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
