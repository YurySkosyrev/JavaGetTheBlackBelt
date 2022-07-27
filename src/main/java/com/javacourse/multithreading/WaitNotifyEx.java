package com.javacourse.multithreading;

public class WaitNotifyEx {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}

class Market{
    private int breadCount =0;
//    private final Object lock = new Object();

    public synchronized void getBread(){
//        synchronized (lock) {
            while (breadCount < 1) {
                try {
//                    lock.wait();
//                    wait(30000);
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount--;
            System.out.println("Потребитель купил 1 хлеб");
            System.out.println("Количество хлеба в магазине = " + breadCount);
//            lock.notify();
        notify();
//        }
    }

    public synchronized void putBread(){
//        synchronized (lock) {
            while (breadCount >= 5) {
                try {
//                    lock.wait();
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount++;
            System.out.println("Производитель добавил на витрину 1 хлеб");
            System.out.println("Количество хлеба в магазине = " + breadCount);
//            lock.notify();
        notify();
//        }
    }
}

class Producer implements Runnable{
    Market market;

    Producer(Market market){
        this.market = market;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            market.putBread();
        }
    }
}

class Consumer implements Runnable{
    Market market;

    Consumer(Market market){
        this.market = market;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            market.getBread();
        }
    }
}