package com.javacourse.collection.arraylist;

import java.util.ArrayList;

public class ArrayListMethodsPart3 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("Nina");
        arrayList1.add("Slava");
        arrayList1.add("Yury");

        ArrayList<String> arrayList2 = new ArrayList<>();

        arrayList2.add("!!!");
        arrayList2.add("???");

        System.out.println(arrayList1);
        System.out.println(arrayList2);

        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);

        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);

        arrayList2.clear();
        System.out.println(arrayList2);

        System.out.println(arrayList1.size());

        System.out.println("arrayList1 is empty: " + arrayList1.isEmpty());
        System.out.println("arrayList2 is empty: " + arrayList2.isEmpty());


    }
}
