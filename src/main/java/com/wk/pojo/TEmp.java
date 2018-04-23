package com.wk.pojo;

public class TEmp {
    private String empAccount;

    private String empName;

    private String empPass;

    private Short empStatus;

    private Long empReId;

    public String getEmpAccount() {
        return empAccount;
    }

    public void setEmpAccount(String empAccount) {
        this.empAccount = empAccount == null ? null : empAccount.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
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

    public Long getEmpReId() {
        return empReId;
    }

    public void setEmpReId(Long empReId) {
        this.empReId = empReId;
    }

    @Override
    public String toString() {
        return "TEmp{" +
                "empAccount='" + empAccount + '\'' +
                ", empName='" + empName + '\'' +
                ", empPass='" + empPass + '\'' +
                ", empStatus=" + empStatus +
                ", empReId=" + empReId +
                '}';
    }
}