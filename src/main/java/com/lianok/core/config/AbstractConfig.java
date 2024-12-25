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

    private final int timeout;

    /**
     * 请求网络超时时间
     * 默认：10秒
     * 上传图片默认：30秒
     *
     * @return
     */
    public int getTimeout() {
        return timeout;
    }

    protected AbstractConfig(String url, String authCode, String key) {
        this(url, authCode, key, 10000);
    }

    protected AbstractConfig(String url, String authCode, String key, int timeout) {
        this.url = url;
        this.authCode = authCode;
        this.key = key;
        this.timeout = timeout;
    }

    /**
     * 签名实现
     *
     * @param request 请求对象
     * @return 签名sign
     */
    public abstract String encrypt(AbstractDockingRequest request);

}
