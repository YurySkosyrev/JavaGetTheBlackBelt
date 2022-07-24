package com.javacourse.lambda;

public class LambdaEx2 {

    static void method1(I1 i1){
        System.out.println(i1.stringOp("Privet"));
    }

    static void method2(I2 i2){
        System.out.println(i2.stringOp());
    }

    public static void main(String[] args) {

//        Variable needs to be final or effectively final
        int outerVar = 1;
        method1((String str) -> {
            int lambdaInnerVar =1;
            return str.length() + outerVar;});

//        Cannot resolve symbol
//        System.out.println(lambdaInnerVar);

//***************************************************************************************//

        method2(() -> 18);

    }
}

interface I1{
    int stringOp(String s);
}

interface I2{
    int stringOp();
}
