package com.javacourse.reflection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b){
        System.out.println(a + " + " + b + " = " + (a+b));
    }

    void multiplication(int a, int b){
        System.out.println(a + " * " + b + " = " + (a*b));
    }

    void substruction(int a, int b){
        System.out.println(a + " - " + b + " = " + (a-b));
    }

    void division(int a, int b){
        System.out.println(a + " / " + b + " = " + (a/b));
    }
}

class TestCalculator{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(
                new FileReader("Files/test1")
        )){
            String nameMethod = reader.readLine();
            String arg1 = reader.readLine();
            String arg2 = reader.readLine();

            Calculator calc = new Calculator();
            Class calcClass = calc.getClass();
            Method method = null;

            Method[] methods = calcClass.getDeclaredMethods();

            for(Method myMethod : methods){
                if (myMethod.getName().equals(nameMethod)){
                    method = myMethod;
                }
            }

            method.invoke(calc,Integer.parseInt(arg1),Integer.parseInt(arg2));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
