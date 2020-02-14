package com.jvillavi.entities;

import java.util.Date;

/**
 * General computer information
 */
public class GeneralInfo {
    private String distribution;
    private String os;
    private Date systemDate;

    public GeneralInfo() {
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Date getSystemDate() {
        return systemDate;
    }

    public void setSystemDate(Date systemDate) {
        this.systemDate = systemDate;
    }
}
