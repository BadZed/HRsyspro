package com.wk.pojo;

import java.io.Serializable;
import java.util.Date;

public class THire implements Serializable{
    private Long hrId;

    private String hrJob;

    private String hrSal;

    private String hrJobinfor;

    private String hrWelfare;

    private String hrAddress;

    private Date hrDate;

    public Long getHrId() {
        return hrId;
    }

    public void setHrId(Long hrId) {
        this.hrId = hrId;
    }

    public String getHrJob() {
        return hrJob;
    }

    public void setHrJob(String hrJob) {
        this.hrJob = hrJob == null ? null : hrJob.trim();
    }

    public String getHrSal() {
        return hrSal;
    }

    public void setHrSal(String hrSal) {
        this.hrSal = hrSal == null ? null : hrSal.trim();
    }

    public String getHrJobinfor() {
        return hrJobinfor;
    }

    public void setHrJobinfor(String hrJobinfor) {
        this.hrJobinfor = hrJobinfor == null ? null : hrJobinfor.trim();
    }

    public String getHrWelfare() {
        return hrWelfare;
    }

    public void setHrWelfare(String hrWelfare) {
        this.hrWelfare = hrWelfare == null ? null : hrWelfare.trim();
    }

    public String getHrAddress() {
        return hrAddress;
    }

    public void setHrAddress(String hrAddress) {
        this.hrAddress = hrAddress == null ? null : hrAddress.trim();
    }

    public Date getHrDate() {
        return hrDate;
    }

    public void setHrDate(Date hrDate) {
        this.hrDate = hrDate;
    }
}