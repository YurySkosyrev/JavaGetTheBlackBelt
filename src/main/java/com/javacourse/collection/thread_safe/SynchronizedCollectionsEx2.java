package com.javacourse.collection.thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionsEx2 {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i =0; i<1000; i++){
            arrayList.add(i);
        }

        List<Integer> synchList =
                Collections.synchronizedList(arrayList);

//        Обращение по итератору не блокирует ArrayList, чтобы всё работало корректно, нужно
//        блокировать лист целиком, заключив его в блок synchronized
//        иначе будем получать ConcurrentModificationException
        Runnable runnable1 = () -> {
            synchronized (synchList){
                Iterator<Integer> iterator = synchList.iterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
            }
        };

        Runnable runnable2 = () -> {
            synchList.remove(10);
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(arrayList);

    }
}
