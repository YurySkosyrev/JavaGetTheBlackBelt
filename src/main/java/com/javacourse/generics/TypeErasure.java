package com.javacourse.generics;

public class TypeErasure {
    public static void main(String[] args) {

    }

    public void method1(GenericsClass<String> genericsClass){
        System.out.println("Type String");
    }

//    public void method1(GenericsClass<Integer> genericsClass){
//        System.out.println("Type Integer");
//    }

    class GenericsClass<T> {

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

    class Parent {
        public void method1(GenericsClass<String> genericsClass){
            System.out.println("Type String");
        }
    }

    class Child extends Parent{
//        @Override
//        public void method1(GenericsClass<Integer> genericsClass) {
//            super.method1(genericsClass);
//        }
    }
}
