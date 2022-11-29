package com.doc.TeamInterfaces;
import java.util.Scanner;

import com.doc.beans.Coach;
import com.doc.beans.Team;
import com.doc.beans.Player;


public interface TeamInterfaces {
    public void validateTeam(int tid, String tname, Player[] parr, Player captain, Coach coach);
    public Player[] BuildTeam(int pid,String pname,String psp,Double charges);

    public Player[] findPlayersBySpeciality(Team team,String sp);
}
