package com.lianok.docking.util;

/**
 * 加密类型
 *
 * @author linshu
 * @create 2022/8/20 18:47
 */
public enum EncryEnum {

    MD5("MD5"),
    RSA2048("RSA2048");

    private String name;

    EncryEnum(String name) {
        this.name = name;
    }
}
