package com.javacourse.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockEx {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();

        new Employee("Yuriy", lock);
        new Employee("Petr", lock);
        new Employee("Semen", lock);
        Thread.sleep(5000);
        new Employee("Vasya", lock);
        new Employee("Maria", lock);
    }
}

class Employee extends Thread{

    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
//        System.out.println(name + " ждёт...");
        if(lock.tryLock()) {
//        lock.lock();
            System.out.println(name + " пользуется банкоматом");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            System.out.println(name + " завершил использование");
        } else {
            System.out.println(name + " уходит");
        }
    }
}
