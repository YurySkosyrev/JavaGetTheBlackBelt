package com.javacourse.multithreading;

public class SleepMethod2 extends Thread{
    @Override
    public void run() {
        for (int i=5; i>0; i--){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SleepMethod2 thread1 = new SleepMethod2();
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("End");
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i=5; i>0; i--){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
