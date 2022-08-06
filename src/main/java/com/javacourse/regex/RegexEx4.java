package com.javacourse.regex;

import java.util.regex.Pattern;

public class RegexEx4 {
    public static void main(String[] args) {

        String s1 = "Hello    how    are  you ? Hello       I am    fine";
        System.out.println(s1);

//        s1=s1.replace("Hello", "Hi");
//        s1=s1.replaceAll(" {2,}", " ");
        s1=s1.replaceAll("\\bH\\w+", "Hi");
        System.out.println(s1);

    }
}
