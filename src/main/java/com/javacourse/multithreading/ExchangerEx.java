package com.javacourse.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {

    public static void main(String[] args) {

        Exchanger<Action> exchanger = new Exchanger<>();

        List<Action> friendAction1 = new ArrayList<>();
        friendAction1.add(Action.STONE);
        friendAction1.add(Action.PAPER);
        friendAction1.add(Action.PAPER);

        List<Action> friendAction2 = new ArrayList<>();
        friendAction2.add(Action.SCISSORS);
        friendAction2.add(Action.SCISSORS);
        friendAction2.add(Action.STONE);

        Friend friend1 = new Friend("Pavel", exchanger, friendAction1);
        Friend friend2 = new Friend("Petr", exchanger, friendAction2);


    }
}

enum Action {
    STONE, SCISSORS, PAPER;
}

class Friend extends Thread{
    private String name;
    private Exchanger<Action> exchanger;
    private List<Action> myActions;

    public Friend(String name, Exchanger<Action> exchanger, List<Action> myActions) {
        this.name = name;
        this.exchanger = exchanger;
        this.myActions = myActions;
        this.start();
    }

    private void whoWins(Action myAction, Action friendAction){
        if ((myAction==Action.STONE && friendAction==Action.SCISSORS)
                || (myAction==Action.SCISSORS && friendAction==Action.PAPER)
                || (myAction==Action.PAPER && friendAction==Action.STONE)){
            System.out.println(name + " wins ");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : myActions){
            try {
                sleep(2000);
                reply = exchanger.exchange(action);
                whoWins(action, reply);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}