package com.javacourse.collection.map.hashmap;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();


        Student st1 = new Student("Sergey", "Ivanov", 3);
        Student st2 = new Student("Petr", "Petrov", 1);
        Student st3 = new Student("Ivan", "Sidorov", 4);
        Student st4 = new Student("Maria", "Smirnova", 4);

        ht.put(7.5, st1);
        ht.put(6.4, st2);
        ht.put(9.2, st3);
        ht.put(2.2, st4);

//        NullPointerException
//        ht.put(null, st4);
//        ht.put(8.2, null);

        System.out.println(ht);
    }
}
