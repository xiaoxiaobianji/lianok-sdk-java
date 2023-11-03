package com.lianok.core;

import com.lianok.core.entity.*;

public interface IDockingClient {

    /**
     * 请求接口
     *
     * @param request 请求对象
     * @param <T>     返回对象
     * @return DockingResponseBase<T> 业务参数
     * @throws Exception 网络请求过程中发生异常
     */
    <T extends DockingResponseBase> ResponseResultBase<T> execute(AbstractDockingRequest request) throws Exception;
}
