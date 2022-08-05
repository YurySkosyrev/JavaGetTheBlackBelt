package com.javacourse.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {
    public static void main(String[] args) {

        String string = "aabcd cdfg 84 abcf ababab abababab abab ---- $$$ ==";
//        String patternString = "abc";
//        String patternString = "[abc]";
//        String patternString = "[c-f]";
//        String patternString = "[4-6]";
//        String patternString = "[a-c6-9]";
//        String patternString = "[a|5]";
//        String patternString = "[^cd]";
//        String patternString = "cd.";
//        String patternString = "cd\\.";
//        String patternString = "^abc";
//        String patternString = "abcf$";
//        String patternString = "\\d";
//        String patternString = "\\D{2}";
//        String patternString = "a?";
//        String patternString = "a*";
//        String patternString = "a+";
//        String patternString = "(ab){2}";
//        String patternString = "(ab){2,3}";
//        String patternString = "(ab){3,}";
//        String patternString = "\\w{4}";
//        String patternString = "\\W{3}";
//        String patternString = "\\w{5}\\s\\w{4}";
        String patternString = "\\w{2}\\S{2}\\w{3}";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()){
            System.out.println("Matching position: " + matcher.start() + " " + matcher.group());
        }

    }
}
