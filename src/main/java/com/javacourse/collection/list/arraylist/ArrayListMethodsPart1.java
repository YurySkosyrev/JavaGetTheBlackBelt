package com.javacourse.collection.list.arraylist;

import java.util.ArrayList;

public class ArrayListMethodsPart1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("Nina");
        arrayList1.add("Slava");
        arrayList1.add("Yury");

        System.out.println(arrayList1);
        arrayList1.add(1, "Dmitriy");
        System.out.println(arrayList1);

        String student = arrayList1.get(0);
        System.out.println(student);

        arrayList1.set(0, "Masha");
        System.out.println(arrayList1);

        arrayList1.remove(0);
        System.out.println(arrayList1);
    }
}
