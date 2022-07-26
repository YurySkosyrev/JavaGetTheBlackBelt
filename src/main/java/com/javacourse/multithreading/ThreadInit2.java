package com.javacourse.multithreading;

public class ThreadInit2 extends Thread{
    @Override
    public void run() {
        for(int i=1000; i>0; i--){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadInit2 myThread = new ThreadInit2();
        myThread.start();

        for(int i=1000; i>0; i--){
            System.out.println(i);
        }
    }
}
