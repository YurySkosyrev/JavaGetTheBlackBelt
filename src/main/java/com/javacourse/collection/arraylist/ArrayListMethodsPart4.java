package com.javacourse.collection.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethodsPart4 {
    public static void main(String[] args) {
        StringBuilder st1 = new StringBuilder("A");
        StringBuilder st2 = new StringBuilder("B");
        StringBuilder st3 = new StringBuilder("C");
        StringBuilder st4 = new StringBuilder("D");

        StringBuilder[] array = {st1, st2, st3, st4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);

        st1.append("!!!");
        System.out.println(list);

        StringBuilder st5 = new StringBuilder("F");

        array[0]=st5;
        System.out.println(list);
    }
}
