package com.lianok.core.emuns;

/**
 * 对接环境
 *
 * @author lianok.com
 */
public enum EnvEnum {

    /**
     * 测试环境
     */
    TEST("test"),
    /**
     * 预发环境
     */
    PRE("pre"),
    /**
     * 生成环境
     */
    PUBLISH("publish");

    private final String env;

    EnvEnum(String env) {
        this.env = env;
    }

    public String getEnv() {
        return env;
    }
}
