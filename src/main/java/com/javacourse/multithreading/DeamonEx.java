package com.javacourse.multithreading;

public class DeamonEx {
    public static void main(String[] args) throws InterruptedException {
        Thread userThread = new UserThread();
        Thread deamonThread = new DeamonThread();
        userThread.setName("UserThread");
        deamonThread.setName("DeamonThread");

        deamonThread.setDaemon(true);
        userThread.start();
        deamonThread.start();


//        IllegalThreadStateException
//        deamonThread.setDaemon(true);

    }
}

class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is deamon " + Thread.currentThread().isDaemon());
        for(char c = 'A'; c <'J'; c++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(c);
        }
    }
}

class DeamonThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is deamon " + Thread.currentThread().isDaemon());
        for(int i = 0; i < 1000; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
