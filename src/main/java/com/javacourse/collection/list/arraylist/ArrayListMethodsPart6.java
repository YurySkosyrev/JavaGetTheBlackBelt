package com.javacourse.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodsPart6 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(2,4,5); // cannot contain null
        
        System.out.println(integerList);

//        integerList.add(2); //UnsupportedOperationException - Unmodifided list

        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("Nina");
        arrayList1.add("Slava");
        arrayList1.add("Yury");

        List<String> stringList = List.copyOf(arrayList1); // cannot contain null

        System.out.println("ArrayList: " + arrayList1);
        System.out.println("List: " + stringList);
//        stringList.add("Igor"); //UnsupportedOperationException - Unmodifided list

    }
}
