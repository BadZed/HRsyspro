package com.wk.pojo;

import java.io.Serializable;

public class TEmp implements Serializable{
    private String empAccount;

    private String empPass;

    private Short empStatus;

    private Long empSerResumeId;

    public String getEmpAccount() {
        return empAccount;
    }

    public void setEmpAccount(String empAccount) {
        this.empAccount = empAccount == null ? null : empAccount.trim();
    }

    public String getEmpPass() {
        return empPass;
    }

    public void setEmpPass(String empPass) {
        this.empPass = empPass == null ? null : empPass.trim();
    }

    public Short getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(Short empStatus) {
        this.empStatus = empStatus;
    }

    public Long getEmpSerResumeId() {
        return empSerResumeId;
    }

    public void setEmpSerResumeId(Long empSerResumeId) {
        this.empSerResumeId = empSerResumeId;
    }
}