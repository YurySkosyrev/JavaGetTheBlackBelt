package com.javacourse.lambda;

public class LambdaEx {

    static void method(I i){
        System.out.println(i.stringOp("Privet"));
    }

    public static void main(String[] args) {
        method((String str) -> {return str.length();});
    }
}

interface I{
    int stringOp(String s);
}
