package com.javacourse.stream;

import com.javacourse.lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEx {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm',22,3,8.3);
        Student st2 = new Student("Nikolay", 'm',28,2,6.4);
        Student st3 = new Student("Elena", 'f',19,1,8.9);
        Student st4 = new Student("Petr", 'm',35,4,7);
        Student st5 = new Student("Maria", 'f',23,3,9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        System.out.println(students);
        Predicate<Student> predicate = s -> s.getCourse() > 2;
        List<Student> filterList = students.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(filterList);

//***************************************************************************************//

        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
        filterList = myStream.filter(predicate).collect(Collectors.toList());
        System.out.println(filterList);
    }
}
