package com.lianok.core;

import java.util.Map;

/**
 * @author lianok.com
 */
public interface IDockingRequest {

    /**
     * 获取所有的Key-Value形式的文本请求参数集合
     *
     * @return 请求对象集合
     */
    Map<String, Object> getParams();
}
