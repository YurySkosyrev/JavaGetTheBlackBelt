package com.javacourse.collection.map.treemap;

import com.javacourse.collection.map.hashmap.Student;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx2 {
    public static void main(String[] args) {
        TreeMap<Student, Double> treeMap = new TreeMap<>();
//        TreeMap<Student, Double> treeMap1 = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        });

//        class Student must implements Comparable to be a key in TreeMap

        Student st1 = new Student("Sergey", "Ivanov", 3);
        Student st2 = new Student("Petr", "Petrov", 1);
        Student st3 = new Student("Ivan", "Sidorov", 4);
        Student st4 = new Student("Aleksey", "Plakhov", 3);
        Student st5 = new Student("Semen", "Elistrotov", 1);
        Student st6 = new Student("Arkadiy", "Ivanchuk", 4);
        Student st7 = new Student("Maria", "Kozlova", 3);

        treeMap.put(st1, 5.8);
        treeMap.put(st7, 9.1);
        treeMap.put(st2, 6.4);
        treeMap.put(st4, 7.5);
        treeMap.put(st3, 7.2);
        treeMap.put(st6, 8.2);
        treeMap.put(st5, 7.9);

        System.out.println(treeMap);

    }
}
