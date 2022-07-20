package com.javacourse.collection.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(1);
        set1.add(3);
        set1.add(6);
        set1.add(9);

        Set<Integer> set2 = new HashSet<>();
        set2.add(6);
        set2.add(9);
        set2.add(7);
        set2.add(0);
        set2.add(11);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        Set<Integer> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        System.out.println("Intersect: " + intersect);

        Set<Integer> subtract = new HashSet<>(set1);
        subtract.removeAll(set2);
        System.out.println("Subtract: "+ subtract);

    }
}
