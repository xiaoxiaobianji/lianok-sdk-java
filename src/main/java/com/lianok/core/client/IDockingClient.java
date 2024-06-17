package com.lianok.core.client;

import com.lianok.core.entity.*;

/**
 * @author lianok.com
 */
public interface IDockingClient {

    /**
     * 请求接口
     *
     * @param request 请求对象
     * @return 响应内容
     * @throws Exception 网络请求过程中发生异常
     */
    String execute(AbstractDockingRequest request) throws Exception;
}
