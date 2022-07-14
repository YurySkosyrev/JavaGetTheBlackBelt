package com.javacourse.generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    private String name;
    List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant){
        participants.add(participant);
        System.out.println("Participant " + participant.getName() + " added in team " + name);
    }

    public void playWith(Team<T> team){
        String winnerGame;
        Random random = new Random();
        int i = random.nextInt(2);
        System.out.println("Team " + (i == 0 ? this.name : team.name) + " win");
    }

}
