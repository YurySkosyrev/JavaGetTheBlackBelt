package com.javacourse.regex;

import java.text.Format;

public class PrintfEx {
    public static void main(String[] args) {

        System.out.printf("%-15s, %03d, %,.2f", "Hello world", 20, 30.456f);
        System.out.println();

        String newString = String.format("%-15s, %03d, %,.2f", "Hello world", 20, 30.456f);
        System.out.println(newString);

    }
}
