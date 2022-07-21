package com.javacourse.nestedclasses.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {
        class Summ implements Math2{

            @Override
            public int doSomething(int a, int b) {
                return a + b;
            }
        }

        Summ summ = new Summ();
        System.out.println(summ.doSomething(3, 4));
    }
}

interface Math2{
    int doSomething(int a, int b);
}
