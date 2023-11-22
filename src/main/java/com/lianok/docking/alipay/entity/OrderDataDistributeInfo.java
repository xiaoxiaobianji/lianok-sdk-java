package com.lianok.docking.alipay.entity;

public class OrderDataDistributeInfo {

    /**
     * 未分发到场景的具体原因。开发者可根据具体原因定位解决问题后发起重试。
     */
    private String notDistributeReason;

    /**
     * 分发场景code。
     */
    private String sceneCode;

    /**
     * 分发场景名，对应scene_code。
     */
    private String sceneName;

    public String getNotDistributeReason() {
        return notDistributeReason;
    }

    public void setNotDistributeReason(String notDistributeReason) {
        this.notDistributeReason = notDistributeReason;
    }

    public String getSceneCode() {
        return sceneCode;
    }

    public void setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }
}
