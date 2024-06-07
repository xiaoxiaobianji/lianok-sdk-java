package com.lianok.core.client;

import com.lianok.core.config.AbstractConfig;
import com.lianok.core.config.UploadConfig;
import com.lianok.core.entity.*;
import com.lianok.core.utils.HttpUtil;
import com.lianok.core.utils.StrUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * 图片上传
 *
 * @author lianok.com
 */
public class UploadClient implements IDockingClient {

    private final AbstractConfig config;

    public UploadClient(UploadConfig config) {
        this.config = config;
    }

    @Override
    public String execute(AbstractDockingRequest request) throws Exception {
        if (!(request instanceof AbstractUploadRequest)) {
            throw new ClassFormatError("参数类型错误，需要使用sdk图片上传Request");
        }
        AbstractUploadRequest uploadRequest = (AbstractUploadRequest) request;
        if (StrUtils.isEmpty(uploadRequest.getRequestTime())) {
            String requestTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
            uploadRequest.setRequestTime(requestTime);
        }
        String sign = config.encrypt(uploadRequest);
        Map<String, String> paramMap = new HashMap<>(5);
        paramMap.put("authCode", config.getAuthCode());
        paramMap.put("resource", uploadRequest.getResource());
        paramMap.put("requestTime", uploadRequest.getRequestTime());
        paramMap.put("versionNo", uploadRequest.getVersionNo());
        paramMap.put("sign", sign);
        Map<String, byte[]> fileMap = new HashMap<>(1);

        fileMap.put(uploadRequest.getFileName(), uploadRequest.getFile());
        if (!StrUtils.isEmpty(uploadRequest.getFileTag())) {
            paramMap.put("fileTag", uploadRequest.getFileTag());
        }
        return HttpUtil.upload(config.getUrl(), paramMap, fileMap);
    }
}
