package com.lianok.core.config;

import com.lianok.core.entity.AbstractDockingRequest;

/**
 * 抽象配置类
 *
 * @author lianok.com
 */
public abstract class AbstractConfig {

    private final String url;

    public String getUrl() {
        return url;
    }

    private final String authCode;

    public String getAuthCode() {
        return authCode;
    }

    private final String key;

    public String getKey() {
        return key;
    }

    protected AbstractConfig(String url, String authCode, String key) {
        this.url = url;
        this.authCode = authCode;
        this.key = key;
    }

    /**
     * 签名实现
     *
     * @param request 请求对象
     * @return 签名sign
     */
    public abstract String encrypt(AbstractDockingRequest request);

}
