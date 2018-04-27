package com.wk.pojo;

import java.io.Serializable;

public class TEmp implements Serializable{
    private String empAccount;

    private String empPass;

    private Short empStatus;

    private Long empSerResumeId;

    private String empJob;

    private String empDepartment;

    private String empDate;

    private Long empJobId;

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

    public String getEmpJob() {
        return empJob;
    }

    public void setEmpJob(String empJob) {
        this.empJob = empJob == null ? null : empJob.trim();
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment == null ? null : empDepartment.trim();
    }

    public String getEmpDate() {
        return empDate;
    }

    public void setEmpDate(String empDate) {
        this.empDate = empDate == null ? null : empDate.trim();
    }

    public Long getEmpJobId() {
        return empJobId;
    }

    public void setEmpJobId(Long empJobId) {
        this.empJobId = empJobId;
    }

    @Override
    public String toString() {
        return "TEmp{" +
                "empAccount='" + empAccount + '\'' +
                ", empPass='" + empPass + '\'' +
                ", empStatus=" + empStatus +
                ", empSerResumeId=" + empSerResumeId +
                ", empJob='" + empJob + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                ", empDate='" + empDate + '\'' +
                ", empJobId=" + empJobId +
                '}';
    }
}