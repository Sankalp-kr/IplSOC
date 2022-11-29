package com.doc.services;

import com.doc.TeamInterfaces.TeamInterfaces;
import com.doc.beans.Team;
import com.doc.beans.Player;
import com.doc.beans.Coach;

public class TeamServices implements TeamInterfaces {

    // assumming that there will be max of 4 teams, 2 are already created
    public static Team[] tarr = new Team[4];

    // assumming that the team will have 5 players
    static Player[] csk_plrs = new Player[5];
    static Player[] rcb_plrs = new Player[5];

    public static int team_count;

    static Coach rcb_coach;
    static Coach csk_coach;

    static Player rcb_captain;
    static Player csk_captain;

    public int getTeam_count(){return team_count;}



    static {


        // Player Pool
        csk_plrs[0] = new Player(1, "Dhoni", "Batsman", 100);
        csk_plrs[1] = new Player(2, "Bravo", "All-rounder", 70);
        csk_plrs[2] = new Player(3, "Raina", "Batsman", 80);
        csk_plrs[3] = new Player(4, "Jadeja", "All-rounder", 85);
        csk_plrs[4] = new Player(5, "Morkel", "All-rounder", 80);

        rcb_plrs[0] = new Player(7, "Virat", "Batsman", 100);
        rcb_plrs[1] = new Player(8, "ABD", "Batsman", 95);
        rcb_plrs[2] = new Player(9, "Dale Styn", "Bowler", 75);
        rcb_plrs[3] = new Player(11, "Gayle", "Batsman", 85);
        rcb_plrs[4] = new Player(12, "Jamieson", "All-rounder", 70);

        // coach-pool
        rcb_coach = new Coach(1, "Ravi Shastri", 25);
        csk_coach = new Coach(2, "Rahul Dravid", 27);

        //captains-pool
        rcb_captain = new Player(0, "Maxwell", "Batsman", 75);
        csk_captain = new Player(6, "Luigi Ngidi", "Bowler", 70);

        // there are 2 already made teams
        tarr[0] = new Team(1, "RCB", rcb_plrs, rcb_coach, rcb_captain);
        tarr[1] = new Team(2, "CSK", csk_plrs, csk_coach, csk_captain);
        team_count++;

    }

    @Override
    public Player[] BuildTeam(int pid, String pname, String psp, Double charges) {
        Player[] plrs = new Player[6];
        int i;
        for (i = 0; i < plrs.length; i++) {
            plrs[i] = new Player(pid, pname, psp, charges);
        }
        return plrs;
    }

    @Override
    public void validateTeam(int tid, String tname, Player[] parr, Player captain, Coach coach) {
        tarr[team_count] = new Team(tid, tname, parr, coach, captain);
        System.out.println("Team created Successfully..");
    }


    // we don't want to force everyone to use this method for finding the player with certain speciality so we
    // can avoid this in interface; but i have written for ma'am's sake;
    @Override
    public Player[] findPlayersBySpeciality(Team team,String sp) {

        int fill=-1; //fill will point to the filled object
        Player[] arr= team.getPlist();
        //this is to find how many matches are present in the Team of the speciality
        for(int i=0;i< arr.length;i++){
            if(arr[i].getSp().equals(sp)) {
                fill++;
            }
        }
        // now as we know the count of the matched objects we can create an array of the same;
        Player[] output= new Player[fill];
        //
        for(int j=0,k=0;j<= arr.length;j++){
            if(arr[j].getSp().equals(sp)) {
                output[k]=arr[j];
            }
        }
        return output;

    }




}


