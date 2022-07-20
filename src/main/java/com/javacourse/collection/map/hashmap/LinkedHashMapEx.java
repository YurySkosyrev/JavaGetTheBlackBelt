package com.javacourse.collection.map.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> map = new LinkedHashMap<>();


        Student st1 = new Student("Sergey", "Ivanov", 3);
        Student st2 = new Student("Petr", "Petrov", 1);
        Student st3 = new Student("Ivan", "Sidorov", 4);
        Student st4 = new Student("Maria", "Smirnova", 4);

        map.put(7.5, st1);
        map.put(6.4, st2);
        map.put(9.2, st3);
        map.put(2.2, st4);

        System.out.println(map);
        System.out.println(map.get(7.5));
        System.out.println(map);


        LinkedHashMap<Double, Student> map1 = new LinkedHashMap<>(16, 0.75f, true);
        map1.put(7.5, st1);
        map1.put(6.4, st2);
        map1.put(9.2, st3);
        map1.put(2.2, st4);

        System.out.println("accessOrder param = true");
        System.out.println(map1);
        map1.get(6.4);
        map1.get(2.2);
        System.out.println(map1);

    }
}
