package com.javacourse.lambda;

import java.util.ArrayList;

public class ConsumerForEach {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        for(int s : al){
            System.out.println(s);
        }
        al.forEach(elem -> System.out.println(elem));
        al.forEach(elem -> {
            elem += 2;
            System.out.println(elem);
        });
    }
}
