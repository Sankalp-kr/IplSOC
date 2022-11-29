package com.doc.beans;

public class Player {

    //member variables
    private int pid;
    private String pname;
    private String sp;
    private double charges;

    public Player(){
        this.pid = 0;
        this.pname = null;
        sp = null;
        this.charges = 0.0;
    }

    public Player(int pid, String pname, String speciality, double charges) {
        this.pid = pid;
        this.pname = pname;
        sp = speciality;
        this.charges = charges;
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public String getSp() {
        return sp;
    }

    public double getCharges() {
        return charges;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    @Override
    public String toString(){
        return ""+" Player ID: "+pid+" Player Name: "+pname+" Speciality: "+sp+" Charges: "+charges;
    }
}
