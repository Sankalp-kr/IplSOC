package com.doc.beans;

// since a player can exit without having been assigned a team we can use association approach to solve this
public class Team {

    //member variables
    private int tid;
    private String tname;
    private Player[] plist;
    private Coach coach;
    private Player captain;

    public Team(){
        this.tid = 0;
        this.tname = null;
        this.plist = null;
        this.coach = null;
        this.captain = null;
    }

    public Team(int tid, String tname, Player[] plist, Coach coach, Player captain) {
        this.tid = tid;
        this.tname = tname;
        this.plist = plist;
        this.coach = coach;
        this.captain = captain;
    }

    public int getTid() {
        return tid;
    }

    public String getTname() {
        return tname;
    }

    public Player[] getPlist() {
        return plist;
    }

    public Coach getCoach() {
        return coach;
    }

    public Player getCaptain() {
        return captain;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public void setPlist(Player[] plist) {
        this.plist = plist;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public void setCaptain(Player captain) {
        this.captain = captain;
    }

    @Override
    public String toString(){
        String str= ""+"Team id: "+tid+" Team Name: "+tname+ " Coach: "+coach+" Captiain: "+captain+
                " Players: \n";
        for(int i=0;i<plist.length;i++){
            str+=plist[i];
        }
        return str;
    }

}

