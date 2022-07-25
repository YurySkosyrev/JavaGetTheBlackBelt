package com.javacourse.stream;

import java.util.stream.Stream;

public class StreamsMethods2 {
    public static void main(String[] args) {

//***************************************************************************************//
//concat
// This method is not for use in method chaining
        Stream<Integer> st1 = Stream.of(1,2,3,4,5);
        Stream<Integer> st2 = Stream.of(6,7,8,9,10);
        Stream<Integer> st3 = Stream.concat(st1, st2);
        st3.forEach(System.out::println);

//***************************************************************************************//
//distinct
        Stream<Integer> st4 = Stream.of(1,2,3,4,5,3,2,1);
        st4.distinct().forEach(System.out::println);

//***************************************************************************************//
//count
        Stream<Integer> st5 = Stream.of(1,2,3,4,5,3,2,1);

//The stream can be used once time
//        System.out.println(st5.count());
        System.out.println(st5.distinct().count());

//***************************************************************************************//
//peek
// Intermediate version of forEach
        Stream<Integer> st6 = Stream.of(1,2,3,4,5,3,2,1);
        System.out.println(st6.distinct().peek(System.out::println).count());
    }
}
