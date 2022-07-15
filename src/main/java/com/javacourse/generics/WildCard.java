package com.javacourse.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>()
    List<?> list = new ArrayList<Integer>();
//    list.add(2); insert operations are not allowed
//
    List<? extends Number> listExtends = new ArrayList<Integer>();
    List<? super Number> listSuper = new ArrayList<Object>();
//    List<? extends Number> listStr = new ArrayList<String>();
//
    ArrayList<Double> ald = new ArrayList<>();
    ald.add(3.14);
    ald.add(3.15);
    ald.add(3.16);
    System.out.println(sumArray(ald));

    ArrayList<Integer> ali = new ArrayList<>();
    ali.add(14);
    ali.add(15);
    ali.add(16);
    System.out.println(sumArray(ali));

//    ArrayList<String> als = new ArrayList<>();
//    System.out.println(sumArray(als));

    }

    static void showListInfo(List<?> list){
        System.out.println("My list: " + list);
    }

    public static double sumArray(List<? extends Number> list){
        double summ = 0;
        for (Number n : list){
            summ+=n.doubleValue();
        }
        return summ;
    }
}
