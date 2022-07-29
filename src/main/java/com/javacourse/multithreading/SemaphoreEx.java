package com.javacourse.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        Person person1 = new Person("Yury", callBox);
        Person person2 = new Person("Misha", callBox);
        Person person3 = new Person("Maria", callBox);
        Person person4 = new Person("Sergey", callBox);
        Person person5 = new Person("Semen", callBox);
    }
}

class Person extends Thread{

    String name;
    Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        System.out.println(name + " ждёт...");
        try {
            callBox.acquire();
            System.out.println(name + " пользуется");
            sleep(2000);
            System.out.println(name + " закончил пользоваться");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            callBox.release();
        }
    }
}
