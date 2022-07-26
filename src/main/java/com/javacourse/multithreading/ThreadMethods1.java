package com.javacourse.multithreading;

public class ThreadMethods1 {
    public static void main(String[] args) {
        MyThread4 myThread4 = new MyThread4();
        System.out.println("Name of Thread4: " + myThread4.getName()
                + " Priority of Thread4: " + myThread4.getPriority());
        MyThread4 myThread5 = new MyThread4();
        System.out.println("Name of Thread5: " + myThread5.getName()
                + " Priority of Thread5: " + myThread5.getPriority());

        myThread4.setName("NewThread");
        myThread4.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of NewThread: " + myThread4.getName()
                + " Priority of NewThread: " + myThread4.getPriority());
    }
}

class MyThread4 extends Thread{
    @Override
    public void run() {
        System.out.println();;
    }
}
