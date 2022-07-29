package com.javacourse.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
    static AtomicInteger counter = new AtomicInteger(0);

    public static void increment(){
        counter.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new IncThread());
        Thread thread2 = new Thread(new IncThread());

        thread1.start();
        thread2.start();

        thread1.join();
        thread1.join();

        System.out.println(counter);
    }
}

class IncThread implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<100; i++){
            AtomicIntegerEx.increment();
        }
    }
}
