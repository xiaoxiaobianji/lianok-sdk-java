package com.lianok.docking;

/**
 * @author linshu
 * @create 2022/8/20 19:04
 */
public class DockingConfig {

    /**
     * 对接请求地址
     * @return
     */
    public static String getUrl(){
        return "http://testapi.intranet.aduer.com/open/v1/api/biz/do";
    }

    /**
     * 分配对接授权参数
     * @return 对接授权码
     */
    public static String getAuthCode(){
        return "xxxx";
    }

    /**
     * 分配对接授权加密盐
     * @return 加密盐
     */
    public static String getSalt(){
        return "xxxx";
    }
}
