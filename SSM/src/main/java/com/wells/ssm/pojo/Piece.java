package com.wells.ssm.pojo;

public class Piece {
    private Integer fid;

    private String fname;

    private String fnumber;

    private Integer fattack;

    private Integer fmagic;

    private Integer farmor;

    private Integer fresistance;

    private Integer fattackDistance;

    private Integer fcrit;

    private Float fattackSpeed;

    private Integer fskills;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
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

    public Integer getFattack() {
        return fattack;
    }

    public void setFattack(Integer fattack) {
        this.fattack = fattack;
    }

    public Integer getFmagic() {
        return fmagic;
    }

    public void setFmagic(Integer fmagic) {
        this.fmagic = fmagic;
    }

    public Integer getFarmor() {
        return farmor;
    }

    public void setFarmor(Integer farmor) {
        this.farmor = farmor;
    }

    public Integer getFresistance() {
        return fresistance;
    }

    public void setFresistance(Integer fresistance) {
        this.fresistance = fresistance;
    }

    public Integer getFattackDistance() {
        return fattackDistance;
    }

    public void setFattackDistance(Integer fattackDistance) {
        this.fattackDistance = fattackDistance;
    }

    public Integer getFcrit() {
        return fcrit;
    }

    public void setFcrit(Integer fcrit) {
        this.fcrit = fcrit;
    }

    public Float getFattackSpeed() {
        return fattackSpeed;
    }

    public void setFattackSpeed(Float fattackSpeed) {
        this.fattackSpeed = fattackSpeed;
    }

    public Integer getFskills() {
        return fskills;
    }

    public void setFskills(Integer fskills) {
        this.fskills = fskills;
    }
}