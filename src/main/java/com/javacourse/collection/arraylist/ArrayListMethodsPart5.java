package com.javacourse.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodsPart5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("Nina");
        arrayList1.add("Slava");
        arrayList1.add("Yury");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Nina");
        arrayList2.add("Slava");

        System.out.println(arrayList1);
        arrayList1.removeAll(arrayList2);
        System.out.println(arrayList1);

        arrayList1.add("Nina");
        arrayList1.add("Slava");

        System.out.println(arrayList1);
        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);

        arrayList1.add("Yury");
        System.out.println("arrayList1 " + arrayList1);
        System.out.println("arrayList2 " + arrayList2);
        System.out.println("arrayList1 containsAll arrayList2: " + arrayList1.containsAll(arrayList2));

        arrayList1.add("Petr");
        arrayList1.add("Pavel");

        System.out.println(arrayList1);
        List<String> myList = arrayList1.subList(1,4);
        System.out.println("subList(1,4) is: " + myList);

        myList.add("Fedor");
        System.out.println("myList: " + myList);
        System.out.println("arrayList:" + arrayList1);

        arrayList1.add("Semen");
//        System.out.println("myList: " + myList);  ConcurrentModificationException

        Object[] array1 = arrayList1.toArray();
        String[] array2 = arrayList1.toArray(new String[0]);


    }
}
