package com.javacourse.collection.list.arraylist;

import java.util.ArrayList;

public class ArrayListMethodsPart2 {

    public static void main(String[] args) {
        Student st1 = new Student("Yury", "08-103");
        Student st2 = new Student("Slava", "08-103");
        Student st3 = new Student("Sergey", "08-103");
        Student st4 = new Student("Dmitriy", "08-103");

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);

        System.out.println(students);

        Student st5 = new Student("Dmitriy", "08-103");
        students.remove(st5); // True with override method equals in class Student

        System.out.println(students);

        Student st6 = new Student("Sergey", "08-103");
        System.out.println(students.indexOf(st6)); // True with override method equals in class Student

        System.out.println("studentsList contains st6: " + students.contains(st6));

    }
}
