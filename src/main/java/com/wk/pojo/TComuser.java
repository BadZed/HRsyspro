package com.wk.pojo;

import java.io.Serializable;

public class TComuser implements Serializable {
    private Long cuId;

    private String cuUsername;

    private String cuPass;

    public Long getCuId() {
        return cuId;
    }

    public void setCuId(Long cuId) {
        this.cuId = cuId;
    }

    public String getCuUsername() {
        return cuUsername;
    }

    public void setCuUsername(String cuUsername) {
        this.cuUsername = cuUsername == null ? null : cuUsername.trim();
    }

    public String getCuPass() {
        return cuPass;
    }

    public void setCuPass(String cuPass) {
        this.cuPass = cuPass == null ? null : cuPass.trim();
    }

    @Override
    public String toString() {
        return "TComuser{" +
                "cuId=" + cuId +
                ", cuUsername='" + cuUsername + '\'' +
                ", cuPass='" + cuPass + '\'' +
                '}';
    }
}