package com.javacourse.collection.list.linkedlist;

import com.javacourse.collection.list.arraylist.StudentArr;

import java.util.LinkedList;


public class LinkedListMethods {
    public static void main(String[] args) {
        StudentArr st1 = new StudentArr("Yury", "08-103");
        StudentArr st2 = new StudentArr("Slava", "08-103");
        StudentArr st3 = new StudentArr("Sergey", "08-103");
        StudentArr st4 = new StudentArr("Dmitriy", "08-103");

        LinkedList<StudentArr> studentsLinkedList = new LinkedList();

        studentsLinkedList.add(st1);
        studentsLinkedList.add(st2);
        studentsLinkedList.add(st3);
        studentsLinkedList.add(st4);

        System.out.println(studentsLinkedList);
        System.out.println(studentsLinkedList.get(0));

        StudentArr st5 = new StudentArr("Mariya", "08-103");
        studentsLinkedList.add(st5);

        System.out.println(studentsLinkedList);
        StudentArr st6 = new StudentArr("Nikita", "08-103");
        studentsLinkedList.add(0, st6);
        System.out.println(studentsLinkedList);

        studentsLinkedList.remove(0);
        System.out.println(studentsLinkedList);
    }
}
