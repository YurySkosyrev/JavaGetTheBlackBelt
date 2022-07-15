package com.javacourse.generics;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedMethod {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer intValue = GenMethod.getSecondElement(intList);
        System.out.println(intValue);

        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
//        String stringValue = GenMethod.getSecondElement(stringList);
//        System.out.println(stringValue);
    }
}

class GenMethod{
    public static <T extends Number> T getSecondElement(List<T> list){
        return list.get(1);
    }
}
