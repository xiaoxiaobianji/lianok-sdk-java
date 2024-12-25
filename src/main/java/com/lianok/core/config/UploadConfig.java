package com.lianok.core.config;

import com.lianok.core.emuns.EncryEnum;
import com.lianok.core.emuns.EnvEnum;
import com.lianok.core.entity.AbstractDockingRequest;
import com.lianok.core.utils.CollectionUtils;
import com.lianok.core.utils.SecurityUtils;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 * 图片上传
 *
 * @author lianok.com
 */
public final class UploadConfig extends AbstractConfig {

    public EncryEnum getEncryEnum() {
        return EncryEnum.MD5;
    }


    private UploadConfig(String url, String authCode, String salt) {
        super(url, authCode, salt, 30000);
    }

    private UploadConfig(String url, String authCode, String salt, int timeout) {
        super(url, authCode, salt, timeout);
    }


    public static class Builder extends AbstractConfigBuilder<UploadConfig.Builder> {

        private String url;

        @Override
        protected UploadConfig.Builder self() {
            return this;
        }

        public UploadConfig.Builder config(EnvEnum env, String authCode, String key, Integer timeout) {
            this.env = env;
            switch (env) {
                case TEST:
                    url = "https://testapi.intranet.aduer.com/openapi/v2/api/biz/file";
                    break;
                case PRE:
                    url = "https://entry.pre.lianok.com/openapi/v2/api/biz/file";
                    break;
                case PUBLISH:
                    url = "https://entry.lianok.com/openapi/v2/api/biz/file";
                    break;
                default:
                    throw new NullPointerException();
            }
            this.authCode = authCode;
            this.key = key;
            this.timeout = timeout;
            return this;
        }

        public UploadConfig.Builder config(EnvEnum env, String authCode, String key) {
            return config(env, authCode, key, null);
        }

        public UploadConfig build() {
            if (Objects.isNull(timeout)) {
                return new UploadConfig(url, Objects.requireNonNull(this.authCode), Objects.requireNonNull(this.key));
            } else {
                return new UploadConfig(Objects.requireNonNull(this.url), Objects.requireNonNull(this.authCode), Objects.requireNonNull(this.key), this.timeout);
            }
        }
    }

    @Override
    public String encrypt(AbstractDockingRequest request) {
        Map<String, Object> paramMap = new TreeMap();
        paramMap.put("authCode", getAuthCode());
        paramMap.put("resource", request.getResource());
        paramMap.put("requestTime", request.getRequestTime());
        paramMap.put("versionNo", request.getVersionNo());
        String strParams = CollectionUtils.mapToStr(paramMap);
        strParams = strParams.toLowerCase();
        strParams = strParams + "&" + getKey();
        return SecurityUtils.md5(strParams);
    }
}
