package com.wk.pojo;

import java.io.Serializable;

public class THire implements Serializable {
    private Long hrId;

    private String hrJob;

    private String hrSal;

    private String hrJobinfor;

    private String hrWelfare;

    private String hrCominfor;

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

    public String getHrCominfor() {
        return hrCominfor;
    }

    public void setHrCominfor(String hrCominfor) {
        this.hrCominfor = hrCominfor == null ? null : hrCominfor.trim();
    }

    @Override
    public String toString() {
        return "THire{" +
                "hrId=" + hrId +
                ", hrJob='" + hrJob + '\'' +
                ", hrSal='" + hrSal + '\'' +
                ", hrJobinfor='" + hrJobinfor + '\'' +
                ", hrWelfare='" + hrWelfare + '\'' +
                ", hrCominfor='" + hrCominfor + '\'' +
                '}';
    }
}