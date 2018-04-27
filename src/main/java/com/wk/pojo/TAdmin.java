package com.wk.pojo;

import java.io.Serializable;

public class TAdmin implements Serializable{
    private String adAccount;

    private String adPass;

    public String getAdAccount() {
        return adAccount;
    }

    public void setAdAccount(String adAccount) {
        this.adAccount = adAccount == null ? null : adAccount.trim();
    }

    public String getAdPass() {
        return adPass;
    }

    public void setAdPass(String adPass) {
        this.adPass = adPass == null ? null : adPass.trim();
    }
}