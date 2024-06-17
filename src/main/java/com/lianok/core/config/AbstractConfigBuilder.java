package com.lianok.core.config;

import com.lianok.core.emuns.EnvEnum;

/**
 * 配置构建
 *
 * @author lianok.com
 */
public abstract class AbstractConfigBuilder<T extends AbstractConfigBuilder<T>> {

    protected EnvEnum env;
    protected String authCode;
    protected String key;

    protected AbstractConfigBuilder() {
    }

    /**
     * 配置构建器
     *
     * @return
     */
    protected abstract T self();

    public T authCode(String authCode) {
        this.authCode = authCode;
        return this.self();
    }

    public T key(String key) {
        this.key = key;
        return this.self();
    }

    public T env(EnvEnum env) {
        this.env = env;
        return this.self();
    }

}
