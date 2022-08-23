package com.lianok.docking.util;

import java.util.Map;

/**
 * @author linshu
 * @create 2022/8/20 19:18
 */
public class CollectionUtils {


    public static String mapToStr(Map<String, Object> map) {
        StringBuffer sb = new StringBuffer();
        map.forEach((k, v) -> {
            sb.append(k).append("=").append(v).append("&");
        });
        String preSign = sb.toString();
        return preSign.substring(0, preSign.length() - 1);
    }

}
