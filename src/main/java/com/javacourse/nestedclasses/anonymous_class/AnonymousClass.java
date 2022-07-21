package com.javacourse.nestedclasses.anonymous_class;

public class AnonymousClass {

    private int variable = 5;

    public static void main(String[] args) {
        Math m1 = new Math() {
            @Override
            public int doSomething(int a, int b) {
                AnonymousClass anonymousClass = new AnonymousClass();
                return a + b + anonymousClass.variable;
            }
        };
        Math m2 = new Math() {
            @Override
            public int doSomething(int a, int b) {
                return a * b;
            }
        };

        System.out.println(m1.doSomething(2,4));
        System.out.println(m2.doSomething(2,4));

    }
}

interface Math{
    int doSomething(int a, int b);
}
