package com.lianok.core;

import com.lianok.core.entity.*;

import java.io.IOException;

public interface IDockingClient {

    /**
     * 请求接口
     *
     * @param request 请求对象
     * @param <T>     返回对象
     * @return DockingResponseBase<T>
     */
    <T extends DockingResponseBase> ResponseResultBase<T> execute(DockingRequestBase request) throws IOException, Exception;
}
