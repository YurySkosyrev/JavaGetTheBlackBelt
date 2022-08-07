package com.javacourse.enumeration;

import java.util.Arrays;

public class EnumEx1 {
    public static void main(String[] args) {
        printWeekDay(WeekDay.SUNDAY);

        WeekDay w1 = WeekDay.MONDAY;
        WeekDay w2 = WeekDay.MONDAY;
        WeekDay w3 = WeekDay.FRIDAY;

        System.out.println(w1==w2);
        System.out.println(w1==w3);

        WeekDay w4 = WeekDay.valueOf("MONDAY");
        System.out.println(w4);

//        IllegalArgumentException
//        WeekDay w5 = WeekDay.valueOf("MONDAy");

        WeekDay[] array = WeekDay.values();
        System.out.println(Arrays.toString(array));
    }

    static void printWeekDay(WeekDay wd){
        System.out.println("The weekday is: " + wd);
        System.out.println("The mood is: " + wd.getMood());



    }
}

enum WeekDay {

    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("good"),
    SUNDAY("good");

    private String mood;

    WeekDay(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}
