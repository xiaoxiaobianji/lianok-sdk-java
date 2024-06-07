package com.lianok.core.utils;

import java.util.Map;

/**
 * @author lianok.com
 */
public final class CollectionUtils  {


    public static String mapToStr(Map<String, Object> map) {
        StringBuffer sb = new StringBuffer();
        map.forEach((k, v) -> {
            sb.append(k).append("=").append(v).append("&");
        });
        String preSign = sb.toString();
        return preSign.substring(0, preSign.length() - 1);
    }

}