package com.javacourse.generics;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedClass {
    public static void main(String[] args) {

//        List<Number> list = new ArrayList<Integer>();
//
//        GenericsClass<String> info1 = new GenericsClass<>("Hello");


        GenericsClass<Integer> info2 = new GenericsClass<>(2);
        GenericsClass<Double> info3 = new GenericsClass<>(2.2);



        System.out.println(info2);
        System.out.println(info3);


    }
}

class GenericsClass<T extends Number> {

    private T value;

    public GenericsClass(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" + value + "}";
    }

    public T getValue() {
        return value;
    }
}

interface I1{}
interface I2{}

class Impl<T extends Number&I1&I2>{}

