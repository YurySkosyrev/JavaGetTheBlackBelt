package com.javacourse.multithreading;

public class DeadLock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {

        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();

        thread10.start();
        thread20.start();
    }



}

class Thread10 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread10 пытается захватить монитор lock1");
        synchronized (DeadLock.lock1){
            System.out.println("Thread10 захватил монитор lock1");
            System.out.println("Thread10 пытается захватить монитор lock2");
            synchronized (DeadLock.lock2){
                System.out.println("Thread10 захватил мониторы lock1 и lock2");
        }
    }
    }
}

class Thread20 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread20 пытается захватить монитор lock2");
        synchronized (DeadLock.lock2){
            System.out.println("Thread20 захватил монитор lock2");
            System.out.println("Thread20 пытается захватить монитор lock1");
            synchronized (DeadLock.lock1){
                System.out.println("Thread20 захватил мониторы lock2 и lock1");
            }
        }
    }
}