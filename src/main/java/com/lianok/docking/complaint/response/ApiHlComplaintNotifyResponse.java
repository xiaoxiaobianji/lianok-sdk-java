package com.lianok.docking.complaint.response;

import com.lianok.core.entity.DockingResponseBase;

public class ApiHlComplaintNotifyResponse extends DockingResponseBase {

    private String ciphertext;

    public String getCiphertext() {
        return ciphertext;
    }

    public void setCiphertext(String ciphertext) {
        this.ciphertext = ciphertext;
    }
}
