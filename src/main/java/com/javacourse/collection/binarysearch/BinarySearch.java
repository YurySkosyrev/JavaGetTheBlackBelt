package com.javacourse.collection.binarysearch;

import com.javacourse.collection.arraylist.Student;

import java.sql.Array;
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

        List<Student> students = new ArrayList<>();

        Student st1 = new Student("Yury", "08-102");
        Student st2 = new Student("Slava", "08-105");
        Student st3 = new Student("Sergey", "08-101");
        Student st4 = new Student("Dmitriy", "08-103");

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);

//      Class Student must implement Comparable interface
        Collections.sort(students);
        System.out.println(Collections.binarySearch(students, st3));

        int[] array = {1, 4, -2, 4, 23, -4, 5, 2};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Index of element with value 2 is: " + Arrays.binarySearch(array, 2));



    }


}
