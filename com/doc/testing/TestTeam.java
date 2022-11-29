package com.doc.testing;

import java.lang.management.PlatformLoggingMXBean;
import java.util.Scanner;

import com.doc.TeamInterfaces.TeamInterfaces;
import com.doc.beans.Coach;
import com.doc.beans.Team;
import com.doc.beans.Player;
import com.doc.services.TeamServices;

public class TestTeam {

    public static void main(String[] args) {

        Scanner ins = new Scanner(System.in);
        TeamInterfaces ts = new TeamServices();

        System.out.println("1. create a new team\n 2. Find players of given speciality from all teams\n");
        System.out.println("3. find given speciality from given team\n 4. Find team by captain\n");
        System.out.println("5. Find team by coach\n 6. display all teams\n 7.exit\nchoice :");

        int choice = ins.nextInt();

        switch (choice) {
            case 1:
                //rcb_plrs,rcb_coach,rcb_captain);
                System.out.println("Enter the id of the team: ");
                int tid = ins.nextInt();
                System.out.println("Enter the name of the team: ");
                String tname = ins.next();
                Player[] parr = new Player[6];

                //we have to create an array of 6 players
                for (int i = 0; i < 6; i++) {
                    System.out.println("Enter the id of player: ");
                    int pid = ins.nextInt();
                    System.out.println("Enter the name of player: ");
                    String pname = ins.next();
                    System.out.println("Enter the speciality of player: ");
                    String psp = ins.next();
                    System.out.println("Enter the charges for the player: ");
                    Double charges = ins.nextDouble();
                    parr = ts.BuildTeam(pid, pname, psp, charges);
                }

                //captain

                System.out.println("Enter the id of player: ");
                int cid = ins.nextInt();
                System.out.println("Enter the name of player: ");
                String cname = ins.next();
                System.out.println("Enter the speciality of player: ");
                String csp = ins.next();
                System.out.println("Enter the charges for the player: ");
                Double ccharges = ins.nextDouble();
                Player captain = new Player(cid, cname, csp, ccharges);

                //coach details
                System.out.println("Enter the id for the coach: ");
                int coid = ins.nextInt();
                System.out.println("Enter the name of the coach: ");
                String coname = ins.next();
                System.out.println("Enter the number of experience of the coach: ");
                int exp = ins.nextInt();
                Coach coach = new Coach(coid, coname, exp);

                //final team build
                ts.validateTeam(tid, tname, parr, captain, coach);

                break;

            case 2:
                System.out.println("Enter the speciality that you want to seach for: ");
                String search = ins.next();
                for (int i = 0; i <= TeamServices.team_count; i++) {
                    for (int j = 0; j < ts.findPlayersBySpeciality(TeamServices.tarr[i], search).length; j++) {
                        System.out.println(ts.findPlayersBySpeciality(TeamServices.tarr[i], search)[j]);
                    }
                }
                break;


            case 3:
                System.out.println("Enter the name of the team you want to seach in: ");
                ins.nextLine();
                String team = ins.nextLine();
                System.out.println("Enter the speciality you want to seach: ");
                String special = ins.next();
                Player arr[];
                for (int i = 0; i < TeamServices.team_count; i++) {
                    if (TeamServices.tarr[i].getTname().equals(team)) {
                        for (int j = 0; j < ts.findPlayersBySpeciality(TeamServices.tarr[i], special).length; i++) {
                            System.out.println(ts.findPlayersBySpeciality(TeamServices.tarr[i], special)[j]);
                        }
                    }
                }

                break;

            case 4:
                System.out.println("Enter the name of Captain of the team: ");
                ins.nextLine();
                String capname = ins.nextLine();
                for(int i=0; i<TeamServices.team_count;i++){
                    if(TeamServices.tarr[i].getCaptain().getPname().equals(capname))
                        System.out.println(TeamServices.tarr[i]);
                }
                break;
            case 5:
                System.out.println("Enter the name of the coach to seach team: ");
                ins.nextLine();
                String coachname = ins.nextLine();
                for(int i=0; i<TeamServices.team_count;i++){
                    if(TeamServices.tarr[i].getCoach().getCname().equals(coachname))
                        System.out.println(TeamServices.tarr[i]);
                }

                break;

            case 6:
                System.out.print("Here you go...\n");
                for(int i=0;i<TeamServices.team_count;i++){
                    System.out.println(TeamServices.tarr[i]);
                }

                break;

            case 7:
                System.out.println("Thanks for using our application ;-)");
        }
    }
}
