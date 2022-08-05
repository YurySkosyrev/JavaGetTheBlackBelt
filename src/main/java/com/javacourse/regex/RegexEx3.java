package com.javacourse.regex;

import java.util.regex.Pattern;

public class RegexEx3 {

    public void check(String ip){

        String regEx = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";

        System.out.println(ip + " is OK " + Pattern.matches(regEx, ip));

    }

    public static void main(String[] args) {

        String ip1 = "255.254.253.252";
        String ip2 = "255.255.256.100";

        RegexEx3 regexEx3 = new RegexEx3();

        regexEx3.check(ip1);
        regexEx3.check(ip2);
    }
}
