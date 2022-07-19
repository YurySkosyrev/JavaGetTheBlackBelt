package com.javacourse.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIteratorEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Nina");
        arrayList.add("Slava");
        arrayList.add("Yury");
        arrayList.add("Sergey");
        arrayList.add("Kolya");

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        Can dalete elements like an each loop
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
    }
}
