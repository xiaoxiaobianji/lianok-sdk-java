package com.lianok.docking;

/**
 * @author linshu
 * @create 2022/8/20 18:37
 */
public interface IDockingClient {

    /**
     * 请求接口
     * @param request 请求对象
     * @param <T> 返回对象
     * @return DockingResponseBase<T>
     */
    <T extends DockingResponseBase> ResponseResultBase<T> execute(DockingRequestBase request);
}
