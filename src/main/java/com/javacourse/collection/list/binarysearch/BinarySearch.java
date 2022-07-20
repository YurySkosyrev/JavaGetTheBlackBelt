package com.javacourse.collection.list.binarysearch;

import com.javacourse.collection.list.arraylist.StudentArr;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(-2);
        arrayList.add(-6);
        arrayList.add(2);
        arrayList.add(100);
        arrayList.add(-23);
        arrayList.add(0);
        arrayList.add(8);
        arrayList.add(14);
        arrayList.add(-14);
        arrayList.add(-6);
//      binary search in unsorted list
        System.out.println("Initial arrayList: " +  arrayList);
        System.out.println("Index of element with value -14 is: " + Collections.binarySearch(arrayList, -14));

        Collections.sort(arrayList);
        System.out.println("Sorted arrayList: " +  arrayList);
        System.out.println("Index of element with value -14 is: " + Collections.binarySearch(arrayList, -14));

        Collections.reverse(arrayList);
        System.out.println("Reversed arrayList: " +  arrayList);

        Collections.shuffle(arrayList);
        System.out.println("Shuffle arrayList: " +  arrayList);

        List<StudentArr> studentArrs = new ArrayList<>();

        StudentArr st1 = new StudentArr("Yury", "08-102");
        StudentArr st2 = new StudentArr("Slava", "08-105");
        StudentArr st3 = new StudentArr("Sergey", "08-101");
        StudentArr st4 = new StudentArr("Dmitriy", "08-103");

        studentArrs.add(st1);
        studentArrs.add(st2);
        studentArrs.add(st3);
        studentArrs.add(st4);

//      Class Student must implement Comparable interface
        Collections.sort(studentArrs);
        System.out.println(Collections.binarySearch(studentArrs, st3));

        int[] array = {1, 4, -2, 4, 23, -4, 5, 2};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Index of element with value 2 is: " + Arrays.binarySearch(array, 2));



    }


}
