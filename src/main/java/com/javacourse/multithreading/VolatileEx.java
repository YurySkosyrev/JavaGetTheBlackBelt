package com.javacourse.multithreading;

public class VolatileEx extends Thread{

    volatile boolean f = true;

    @Override
    public void run() {
        long counter = 0;
        while (f){
            counter++;
        }
        System.out.println("Loop is finished, counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread = new VolatileEx();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds is time to wake up");
        thread.f = false;
        thread.join();
        System.out.println("End programm");
    }
}
