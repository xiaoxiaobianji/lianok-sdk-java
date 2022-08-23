package com.lianok.docking;

import java.util.Map;

/**
 * 对接请求规范
 *
 * @author linshu
 * @create 2022/8/20 17:35
 */
public interface IDockingRequest {

    /**
     * 获取对接接口名称
     * @return 接口名称
     */
    String getApiName();

    /**
     * 获取所有的Key-Value形式的文本请求参数集合
     * @return 请求对象集合
     */
    Map<String, Object> getParams();
}
