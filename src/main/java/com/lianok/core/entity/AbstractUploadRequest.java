package com.lianok.core.entity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 图片上传基类
 *
 * @author lianok.com
 */
public abstract class AbstractUploadRequest extends AbstractDockingRequest {

    /**
     * 图片名称
     */
    @JSONField(serialize = false)
    private String fileName;

    /**
     * 图片字节
     */
    @JSONField(serialize = false)
    private byte[] file;

    /**
     * 图片标签
     */
    @JSONField(serialize = false)
    private String fileTag;

    public String getFileTag() {
        return fileTag;
    }

    public void setFileTag(String fileTag) {
        this.fileTag = fileTag;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

}
