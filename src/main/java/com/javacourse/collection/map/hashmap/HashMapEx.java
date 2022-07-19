package com.javacourse.collection.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();

        map1.put(1000, "Ivan Ivanov");
        map1.put(2000, "Petr Petrov");
        map1.put(3000, "Oleg Sidorov");
        map1.put(4000, "Denis Karpov");

        System.out.println(map1);

        map1.put(null, "Sergey Kirov");
        map1.put(6000, null);

        System.out.println("Key and Value may be null:" + map1);

        map1.putIfAbsent(1000, "Kirill Ivanov");

        System.out.println(map1);
        System.out.println(map1.get(1000));
        System.out.println(map1.get(1100));

        map1.remove(4000);
        System.out.println(map1);

        System.out.println(map1.containsKey(3000));
        System.out.println(map1.containsValue("Oleg Sidorov"));

        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }

}
