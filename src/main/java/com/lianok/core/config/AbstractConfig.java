package com.lianok.core.config;

import com.lianok.core.emuns.EnvEnum;
import com.lianok.core.entity.AbstractDockingRequest;

/**
 * 抽象配置类
 */
public abstract class AbstractConfig {

    private final String url;

    public String getUrl() {
        return url;
    }

    private final String entryUrl;

    public String getEntryUrl() {
        return entryUrl;
    }

    public String getAuthCode() {
        return authCode;
    }

    public String getKey() {
        return key;
    }

    private final String authCode;
    private final String key;

    private AbstractConfig(String url, String entryUrl, String authCode, String key) {
        this.url = url;
        this.entryUrl = entryUrl;
        this.authCode = authCode;
        this.key = key;
    }

    protected AbstractConfig(String authCode, String key) {
        this(EnvEnum.PUBLISH, authCode, key);
    }

    protected AbstractConfig(EnvEnum env, String authCode, String key) {
        switch (env) {
            case TEST:
                url = "http://testapi.intranet.aduer.com/open/v1/api/biz/do";
                entryUrl = "http://testapi.intranet.aduer.com/openapi/v2/api/biz/do";
                break;
            case PRE:
                url = "https://open.pre.lianok.com/open/v1/api/biz/do";
                entryUrl = "https://open.pre.lianok.com/openapi/v2/api/biz/do";
                break;
            case PUBLISH:
                url = "https://open.lianok.com/open/v1/api/biz/do";
                entryUrl = "https://open.lianok.com/openapi/v2/api/biz/do";
                break;
            default:
                throw new NullPointerException();
        }
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
