package com.javacourse.generics;

public class ParametrizedClass {
    public static void main(String[] args) {
        GenericsClass<String> info1 = new GenericsClass<>("Hello");
        GenericsClass<Integer> info2 = new GenericsClass<>(2);

        System.out.println(info1);
        System.out.println(info2);
    }
}

class GenericsClass<T> {

    private T value;

    public GenericsClass(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" + value + "}";
    }
}

