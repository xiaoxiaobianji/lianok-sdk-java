package com.lianok.core.config;

import com.lianok.core.emuns.EncryEnum;
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
        super(url, authCode, salt);
    }


    public static class Builder extends AbstractConfigBuilder<UploadConfig.Builder> {

        @Override
        protected UploadConfig.Builder self() {
            return this;
        }

        public UploadConfig.Builder config(String authCode, String key) {
            this.authCode = authCode;
            this.key = key;
            return this;
        }

        public UploadConfig build() {
            return new UploadConfig("https://entry.openapi/v2/api/biz/file", Objects.requireNonNull(this.authCode), Objects.requireNonNull(this.key));
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
