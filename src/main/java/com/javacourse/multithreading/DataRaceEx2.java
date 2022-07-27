package com.javacourse.multithreading;

public class DataRaceEx2 {
    static int counter = 0;
    public static synchronized void increment(){
        counter ++;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new R1());
        Thread thread2 = new Thread(new R1());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class R1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++){
            DataRaceEx2.increment();
        }
    }
}
