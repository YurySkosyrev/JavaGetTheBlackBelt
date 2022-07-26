package com.javacourse.multithreading;

public class ThreadInit1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        Thread myThread3 = new Thread(new MyThread3());


        myThread1.start();
        myThread3.start();
    }
}

class MyThread1 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i=1000; i>0; i--){
            System.out.println(i);
        }
    }
}

class MyThread3 implements Runnable{
    @Override
    public void run() {
        for(int i=1000; i>0; i--){
            System.out.println(i);
        }
    }
}
