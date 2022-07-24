package com.javacourse.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateRemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Privet");
        al.add("Poka");
        al.add("Ok");
        al.add("Lambda");

        System.out.println(al);
//        al.removeIf(s -> s.length()<5);
        Predicate<String> pr = s -> s.length()<5;
        al.removeIf(pr);
        System.out.println(al);

    }
}
