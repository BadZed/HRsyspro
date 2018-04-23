package com.wk.pojo;

import java.io.Serializable;
import java.util.Date;

public class TAdmin implements Serializable {
    private String adAccount;

    private String adPass;

    private String adName;

    private String adSex;

    private Date adBirth;

    private String adPhone;

    private String adEmail;

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

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    public String getAdSex() {
        return adSex;
    }

    public void setAdSex(String adSex) {
        this.adSex = adSex == null ? null : adSex.trim();
    }

    public Date getAdBirth() {
        return adBirth;
    }

    public void setAdBirth(Date adBirth) {
        this.adBirth = adBirth;
    }

    public String getAdPhone() {
        return adPhone;
    }

    public void setAdPhone(String adPhone) {
        this.adPhone = adPhone == null ? null : adPhone.trim();
    }

    public String getAdEmail() {
        return adEmail;
    }

    public void setAdEmail(String adEmail) {
        this.adEmail = adEmail == null ? null : adEmail.trim();
    }

    @Override
    public String toString() {
        return "TAdmin{" +
                "adAccount='" + adAccount + '\'' +
                ", adPass='" + adPass + '\'' +
                ", adName='" + adName + '\'' +
                ", adSex='" + adSex + '\'' +
                ", adBirth=" + adBirth +
                ", adPhone='" + adPhone + '\'' +
                ", adEmail='" + adEmail + '\'' +
                '}';
    }
}