package com.lianok.core.emuns;

/**
 * 加密方式
 */
public enum EncryEnum {

    /**
     * Md5
     */
    MD5("MD5"),
    /**
     * Rsa2
     */
    RSA2048("RSA2048");

    /**
     * 接口签名方式
     */
    private final String name;

    EncryEnum(String name) {
        this.name = name;
    }

    public String getEncryName() {
        return name;
    }
}
