package com.lianok.docking.alipay.entity;

import java.util.List;

public class ItemSceneRiskInfo {

    /**
     * 具体问题描述
     */
    private List<Reasons> riskInfos;

    /**
     * 场景名称
     */
    private String scene;

    /**
     * 场景编码
     */
    private String sceneCode;

    public List<Reasons> getRiskInfos() {
        return riskInfos;
    }

    public void setRiskInfos(List<Reasons> riskInfos) {
        this.riskInfos = riskInfos;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getSceneCode() {
        return sceneCode;
    }

    public void setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
    }
}
