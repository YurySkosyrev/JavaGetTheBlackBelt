package com.javacourse.multithreading;

public class ThreadInit3 implements Runnable{
    @Override
    public void run() {
        for(int i=1000; i>0; i--){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(new ThreadInit3());
        myThread.start();

        for(int i=1000; i>0; i--){
            System.out.println(i);
        }
    }
}
