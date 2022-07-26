package com.javacourse.stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {
//        Good for agregate functions

        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult1 = list.stream().reduce((a,e) -> a + e).get();
        System.out.println("Sum without parallel stream: " + sumResult1);
        double sumResult2 = list.parallelStream().reduce((a,e) -> a + e).get();
        System.out.println("Sum without parallel stream: " + sumResult1 + "\n");


        double divisionResult1 = list.stream().reduce((a,e) -> a / e).get();
        System.out.println("Sum without parallel stream: " + divisionResult1);
        double divisionResult2 = list.parallelStream().reduce((a,e) -> a / e).get();
        System.out.println("Sum without parallel stream: " + divisionResult2);
    }
}
