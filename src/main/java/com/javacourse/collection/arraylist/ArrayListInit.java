package com.javacourse.collection.arraylist;

import java.util.ArrayList;

public class ArrayListInit {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>(30);

        arrayList3.add("Nina");
        arrayList3.add("Slava");
        arrayList3.add("Yury");

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList3);
        System.out.println(arrayList3==arrayList4); //False

    }
}
