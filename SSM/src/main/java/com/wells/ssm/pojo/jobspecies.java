package com.wells.ssm.pojo;

public class jobspecies {
    private Integer fid;

    private String ftriggercount;

    private String ftriggercount2;

    private String ftriggercount3;

    private String ftriggermaxcount;

    private String fname;

    private String fnumber;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFtriggercount() {
        return ftriggercount;
    }

    public void setFtriggercount(String ftriggercount) {
        this.ftriggercount = ftriggercount == null ? null : ftriggercount.trim();
    }

    public String getFtriggercount2() {
        return ftriggercount2;
    }

    public void setFtriggercount2(String ftriggercount2) {
        this.ftriggercount2 = ftriggercount2 == null ? null : ftriggercount2.trim();
    }

    public String getFtriggercount3() {
        return ftriggercount3;
    }

    public void setFtriggercount3(String ftriggercount3) {
        this.ftriggercount3 = ftriggercount3 == null ? null : ftriggercount3.trim();
    }

    public String getFtriggermaxcount() {
        return ftriggermaxcount;
    }

    public void setFtriggermaxcount(String ftriggermaxcount) {
        this.ftriggermaxcount = ftriggermaxcount == null ? null : ftriggermaxcount.trim();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFnumber() {
        return fnumber;
    }

    public void setFnumber(String fnumber) {
        this.fnumber = fnumber == null ? null : fnumber.trim();
    }
}