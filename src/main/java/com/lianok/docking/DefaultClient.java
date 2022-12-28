package com.lianok.docking;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lianok.docking.util.CollectionUtils;
import cn.hutool.crypto.SecureUtil;
import com.lianok.docking.util.HttpUtil;

import java.io.IOException;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author linshu
 * @create 2022/8/20 18:55
 */
public class DefaultClient implements IDockingClient {

    private String url;
    private String authCode;
    private String salt;

    public DefaultClient() {
        this.url = DockingConfig.getUrl();
        this.authCode = DockingConfig.getAuthCode();
        this.salt = DockingConfig.getSalt();
    }

    public DefaultClient(String url, String authCode, String salt) {
        this.url = url;
        this.authCode = authCode;
        this.salt = salt;
    }

    @Override
    public <T extends DockingResponseBase> ResponseResultBase<T> execute(DockingRequestBase request) {
        String requestTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        String sign = encrypt(request, requestTime);
        LianOkRequest lianOkRequest = new LianOkRequest();
        lianOkRequest.setAuthCode(authCode);
        lianOkRequest.setResource(request.getApiName());
        lianOkRequest.setRequestTime(requestTime);
        lianOkRequest.setVersionNo(request.getVersionNo());
        lianOkRequest.setSign(sign);
        lianOkRequest.setParams(JSONObject.toJSONString(request));

        try {
            System.out.println(JSONObject.toJSONString(lianOkRequest));
            String responseContent = HttpUtil.doPost(url, JSONObject.toJSONString(lianOkRequest));
            System.out.println(responseContent);
            ResponseResultBase<T> result = JSONObject.parseObject(responseContent, ResponseResultBase.class);
            if(result.success()) {
                JSONObject jsonObject = JSONObject.parseObject(responseContent);
                String respData = jsonObject.getString("data");
                T response = JSON.parseObject(respData, (Type) request.getResponseClass());
                result.setData(response);
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String encrypt(DockingRequestBase request, String requestTime) {
        Map<String, Object> paramsMap = new TreeMap(request.getParams());
        paramsMap.put("authCode", this.authCode);
        paramsMap.put("resource", request.getApiName());
        paramsMap.put("requestTime", requestTime);
        paramsMap.put("versionNo", request.getVersionNo());
        String strParams = CollectionUtils.mapToStr(paramsMap);
        strParams = strParams.toLowerCase();
        strParams = strParams + "&" + salt;
        return SecureUtil.md5(strParams);
    }

}
