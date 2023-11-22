package com.aduer.business.risk.soa.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AesUtil {

    /**
     * aes加密
     *
     * @param content 待加密数据
     * @param key     密钥
     * @return
     * @throws Exception
     */
    public static String aesEncrypt(String content, String key) throws Exception {
        //指定加密算法
        Cipher cipher = Cipher.getInstance("AES");
        //创建加密规则：指定key和加密类型
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), "AES");
        //指定加密模式为加密，指定加密规则
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        //调用加密方法
        byte[] result = cipher.doFinal(content.getBytes());
        //用Base64编码
        return new String(Base64.getEncoder().encode(result));
    }

    /**
     * aes解密
     *
     * @param content 待解密数据
     * @param key     密钥
     * @return
     * @throws Exception
     */
    public static String aesDecrypt(String content, String key) throws Exception {
        //Base64解码
        byte[] result = Base64.getDecoder().decode(content);
        //指定加密算法
        Cipher cipher = Cipher.getInstance("AES");
        //创建加密规则：指定key和加密类型
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), "AES");
        //指定加密模式为解密，指定加密规则
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        return new String(cipher.doFinal(result));
    }
}
