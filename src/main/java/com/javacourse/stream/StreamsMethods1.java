package com.javacourse.stream;

import com.javacourse.lambda.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMethods1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(8);
        list.add(5);
        list.add(3);
        list.add(1);

        int multiply = list.stream().reduce((accumulator,element) -> accumulator*=element).get();
        System.out.println(multiply);

//***************************************************************************************//

        int summ = list.stream().reduce(0,(accumulator,element) -> accumulator+=element);
        System.out.println(summ);

//***************************************************************************************//
//null in Optional
        List<Integer> nullList = new ArrayList<>();
        Optional<Integer> o = nullList.stream().reduce((a,e) -> a+=e);
        if (o.isPresent()){
            System.out.println(o.get());
        } else{
            System.out.println("Optional is null");
        }
//***************************************************************************************//
//sort
        int[] array = {45, 3, 12, 4, 1, 10, 6, 8, 23, 21, 90};

        array= Arrays.stream(array).sorted().toArray();
        System.out.println(array);

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        System.out.println("Unsorted list: " + students);
        students = students.stream().sorted((x,y)->x.getAge()-y.getAge()).collect(Collectors.toList());
        System.out.println("Sorted list: " + students);

//***************************************************************************************//
//method chaining

        int[] ar = {45, 3, 12, 4, 1, 10, 6, 8, 23, 21, 90};

        int result = Arrays.stream(ar).filter(e->e%2==1)
                .map(e->{if(e%3==0){e*=2;} return e;})
                .reduce((a,e) -> a+=e)
                .getAsInt();
        System.out.println(result);

        List<Student> studentsChain = new ArrayList<>();
        studentsChain.add(st1);
        studentsChain.add(st2);
        studentsChain.add(st3);
        studentsChain.add(st4);
        studentsChain.add(st5);

        studentsChain.stream().map(e->
        {
            e.setName(e.getName().toUpperCase());
            return e;
        })
                .filter(e->e.getCourse()>1)
                .sorted((x,y)->x.getAge()-y.getAge())
                .forEach(System.out::println);

//***************************************************************************************//
//a terminal method example

//        Stream<Integer> stream = Stream.of(1,5,3,2,4,5,7,9,6);
//        stream.filter(e -> {
//            System.out.println("!!!");
//            return e==2;
//        });

        Stream<Integer> stream = Stream.of(1,5,3,2,4,5,7,9,6);
        stream.filter(e -> {
            System.out.println("!!!");
            return e==2;
        }).toArray();


    }
}
