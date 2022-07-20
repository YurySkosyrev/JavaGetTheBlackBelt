package com.javacourse.collection.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Yury");
        set.add("Sergey");
        set.add("Nina");

//        not in the order of addition
        System.out.println(set);

        for (String s : set){
            System.out.println(s);
        }

        set.add("Nina");
        System.out.println(set);

//        acceptable operation
//        set.add(null);

        set.remove("Yury");
        System.out.println(set);

        System.out.println(set.isEmpty());

        System.out.println(set.contains("Sergey"));
    }

}
