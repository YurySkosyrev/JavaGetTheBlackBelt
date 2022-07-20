package com.javacourse.collection.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(9);

//        sorted order
        System.out.println("Set1: " + treeSet);


//        NullPointerException
//        treeSet.add(null);

        treeSet.remove(3);
        System.out.println("Set1: " + treeSet);

        System.out.println("treeSet contains of 3: " + treeSet.contains(3));


    }
}
