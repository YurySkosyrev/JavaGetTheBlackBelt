package com.javacourse.collection.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(4);
        lhs.add(3);
        lhs.add(1);
        lhs.add(5);
        lhs.add(6);

        System.out.println(lhs);
        System.out.println(lhs.remove(1));
        System.out.println(lhs);
        System.out.println("Do 1 contains in set: " + lhs.contains(1));
    }
}
