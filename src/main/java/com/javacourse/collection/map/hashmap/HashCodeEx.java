package com.javacourse.collection.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Sergey", "Ivanov", 3);
        Student st2 = new Student("Petr", "Petrov", 1);
        Student st3 = new Student("Ivan", "Sidorov", 4);

        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);

        System.out.println(map);

        Student st4 = new Student("Sergey", "Ivanov", 3);
        boolean result = map.containsKey(st4);
        System.out.println(result); // false while method hashCode is not override

        for (Map.Entry<Student, Double> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}


