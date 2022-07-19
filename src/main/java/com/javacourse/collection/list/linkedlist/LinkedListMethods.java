package com.javacourse.collection.list.linkedlist;

import com.javacourse.collection.list.arraylist.Student;

import java.util.LinkedList;


public class LinkedListMethods {
    public static void main(String[] args) {
        Student st1 = new Student("Yury", "08-103");
        Student st2 = new Student("Slava", "08-103");
        Student st3 = new Student("Sergey", "08-103");
        Student st4 = new Student("Dmitriy", "08-103");

        LinkedList<Student> studentsLinkedList = new LinkedList();

        studentsLinkedList.add(st1);
        studentsLinkedList.add(st2);
        studentsLinkedList.add(st3);
        studentsLinkedList.add(st4);

        System.out.println(studentsLinkedList);
        System.out.println(studentsLinkedList.get(0));

        Student st5 = new Student("Mariya", "08-103");
        studentsLinkedList.add(st5);

        System.out.println(studentsLinkedList);
        Student st6 = new Student("Nikita", "08-103");
        studentsLinkedList.add(0, st6);
        System.out.println(studentsLinkedList);

        studentsLinkedList.remove(0);
        System.out.println(studentsLinkedList);
    }
}
