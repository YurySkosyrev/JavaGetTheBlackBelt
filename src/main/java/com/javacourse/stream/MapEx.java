package com.javacourse.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MapEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Pie");
        list.add("Banana");
        list.add("Plum");


        System.out.println("Initial array: " + list);

//        for (int i = 0; i<list.size(); i++){
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

        List<String> al = list.stream().map(elem -> String.valueOf(elem.length()))
                .collect(Collectors.toList());

        System.out.println("Stream to list: " + al);

        Set<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Pie");
        set.add("Banana");
        set.add("Plum");

        System.out.println("Initial set: " + set);

        Set<String> s = set.stream().map(elem -> String.valueOf(elem.length()))
                .collect(Collectors.toSet());

        System.out.println("Stream to set: " + s);
    }
}
