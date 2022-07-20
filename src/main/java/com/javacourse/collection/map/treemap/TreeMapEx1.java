package com.javacourse.collection.map.treemap;

import com.javacourse.collection.map.hashmap.Student;

import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student st1 = new Student("Sergey", "Ivanov", 3);
        Student st2 = new Student("Petr", "Petrov", 1);
        Student st3 = new Student("Ivan", "Sidorov", 4);
        Student st4 = new Student("Aleksey", "Plakhov", 3);
        Student st5 = new Student("Semen", "Elistrotov", 1);
        Student st6 = new Student("Arkadiy", "Ivanchuk", 4);
        Student st7 = new Student("Maria", "Kozlova", 3);

        treeMap.put(5.8, st1);
        treeMap.put(9.1, st7);
        treeMap.put(6.4, st2);
        treeMap.put(7.5, st4);
        treeMap.put(7.2, st3);
        treeMap.put(8.2, st6);
        treeMap.put(7.9, st5);

        System.out.println(treeMap);

        Student st8 = new Student("Sergey", "Ivanov", 3);
        treeMap.put(3.2, st8);

        System.out.println(treeMap);

        System.out.println(treeMap.get(7.2));

        treeMap.remove(3.2);
        System.out.println(treeMap);

        System.out.println(treeMap.descendingMap());

        System.out.println(treeMap.tailMap(7.3));
        System.out.println(treeMap.headMap(7.3));

        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());

    }
}
