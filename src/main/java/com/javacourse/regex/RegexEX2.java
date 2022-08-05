package com.javacourse.regex;

import java.util.Arrays;

public class RegexEX2 {
    public static void main(String[] args) {
        String s1 = "abcd abct abcf abc";
        String s2 = "ac";

//        There is more one matching
        boolean result = s1.matches("[ab][cd]");
        System.out.println(result);

        result = s2.matches("[ab][cd]");
        System.out.println(result);

        String [] array = s1.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
