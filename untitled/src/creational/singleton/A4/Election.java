package creational.singleton.A4;

import java.util.HashSet;
import java.util.Set;

public class Election {
    private static Election instance;
    private int trumVotes = 0, bidenVotes = 0;
    private Set<String> usersWhoVoted = new HashSet<String>();
    private Election(){}
    public static Election getInstance(){
        if(instance == null){
            instance = new Election();
        }
        return instance;
    }
    public void submitVote(String candidate, String username){
        if(usersWhoVoted.contains(username)){
            System.out.println(username + " Voted!!!");
            return;
        }
        if(candidate =="Trump"){
            trumVotes++;
        }else if(candidate == "Biden"){
            bidenVotes++;
        }else {
            System.out.println("Ung vien khong hop le!!!");
            return;
        }
        usersWhoVoted.add(username);
        System.out.println("--" + username + " da bau cho " + candidate);
    }
    public void printResult(){
        System.out.println("---Ket Qua Bau Cu---");
        System.out.println("Trump co: " +trumVotes+" phieu bau");
        System.out.println("Biden co: " +bidenVotes+" phieu bau");
    }
}
