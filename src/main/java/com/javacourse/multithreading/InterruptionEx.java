package com.javacourse.multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts");
        Thread interruptedThread = new InterruptedThread();

        interruptedThread.start();
        Thread.sleep(2000);
        interruptedThread.interrupt();

        interruptedThread.join();
        System.out.println("Main thread ends");
    }
}

class InterruptedThread extends Thread{
    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i=0; i<=1000000000; i++){
            if (isInterrupted()){
                System.out.println("Thread is interrupted");
                System.out.println(sqrtSum);
                return;
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток хотят прервать во время сна");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
        }
        System.out.println(sqrtSum);
    }
}
