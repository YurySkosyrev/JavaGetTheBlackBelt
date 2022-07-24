package com.javacourse.stream;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForEachEx {
    public static void main(String[] args) {
        int [] array = {2, 4, 2, 2, 5};
        Arrays.stream(array).forEach(i -> {
            i*=2;
            System.out.println(i);});
        Arrays.stream(array).forEach(i -> System.out.println(i));
        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(MyClass::myPrint);
    }
}

class MyClass{
    static void myPrint(int a){
        System.out.println(a);
    }
}
