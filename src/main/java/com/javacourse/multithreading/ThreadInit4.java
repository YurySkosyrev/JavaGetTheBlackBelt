package com.javacourse.multithreading;

public class ThreadInit4 implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println("Method run. Tread name = " + Thread.currentThread().getName()
                + " priority " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        Thread thread = new Thread(new ThreadInit4());
        thread.start();
//        thread.run();
        System.out.println("Method main. Tread name = " + Thread.currentThread().getName()
                + " priority " + Thread.currentThread().getPriority());
    }
}
