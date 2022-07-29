package com.javacourse.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    public static void main(String[] args) throws InterruptedException {

        MyThread thread1 = new MyThread("Misha", countDownLatch);
        MyThread thread2 = new MyThread("Masha", countDownLatch);
        MyThread thread3 = new MyThread("Sveta", countDownLatch);
        MyThread thread4 = new MyThread("Kirill", countDownLatch);
        MyThread thread5 = new MyThread("Yuriy", countDownLatch);

        sellersCameToWork();
        everythingIsReady();
        shopIsOpen();



    }

    public static void sellersCameToWork() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("The sellers came to work");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    public static void everythingIsReady() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Everything Is Ready");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }

    public static void shopIsOpen() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Shop is open");
        countDownLatch.countDown();
        System.out.println("CountDownLatch = " + countDownLatch.getCount());
    }
}

class MyThread extends Thread{
    String name;
    private CountDownLatch countDownLatch;

    public MyThread(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " is shopping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}