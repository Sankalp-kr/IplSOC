package com.doc.beans;

public class Coach {

    private int cid;
    private String cname;
    private int exp;


    public Coach() {
        this.cid = 0;
        this.cname = null;
        this.exp = 0;
    }

    public Coach(int cid, String cname, int experience) {
        this.cid = cid;
        this.cname = cname;
        this.exp = experience;
    }

    public int getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public int getExp() {
        return exp;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString(){
        return ""+" CoachID: "+cid+" Coach Name: "+cname+ " Years of Experience: "+ exp;
    }

}
