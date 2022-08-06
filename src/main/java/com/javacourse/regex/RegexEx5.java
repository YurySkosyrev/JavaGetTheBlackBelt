package com.javacourse.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx5 {
    public static void main(String[] args) {
        String myString = "12349876345676541202345;" +
                "87543456098712450103563;" +
                "34982356876593241105345";

        Pattern pattern =
                Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");

        Matcher matcher = pattern.matcher(myString);

//        String newString = matcher.replaceAll("$5/$6 $7 $1 $2 $3 $4");
//        System.out.println(newString);

        while (matcher.find()){
            System.out.println(matcher.group(7));
        }

    }
}
