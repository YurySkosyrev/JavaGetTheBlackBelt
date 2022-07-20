package com.javacourse.collection.list.arraylist;

import java.util.ArrayList;

public class ArrayListMethodsPart2 {

    public static void main(String[] args) {
        StudentArr st1 = new StudentArr("Yury", "08-103");
        StudentArr st2 = new StudentArr("Slava", "08-103");
        StudentArr st3 = new StudentArr("Sergey", "08-103");
        StudentArr st4 = new StudentArr("Dmitriy", "08-103");

        ArrayList<StudentArr> studentArrs = new ArrayList<>();
        studentArrs.add(st1);
        studentArrs.add(st2);
        studentArrs.add(st3);
        studentArrs.add(st4);

        System.out.println(studentArrs);

        StudentArr st5 = new StudentArr("Dmitriy", "08-103");
        studentArrs.remove(st5); // True with override method equals in class Student

        System.out.println(studentArrs);

        StudentArr st6 = new StudentArr("Sergey", "08-103");
        System.out.println(studentArrs.indexOf(st6)); // True with override method equals in class Student

        System.out.println("studentsList contains st6: " + studentArrs.contains(st6));

    }
}
