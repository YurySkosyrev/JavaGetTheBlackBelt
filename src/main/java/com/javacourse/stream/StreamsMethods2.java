package com.javacourse.stream;

import com.javacourse.lambda.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMethods2 {
    public static void main(String[] args) {

//***************************************************************************************//
//concat
// This method is not for use in method chaining
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream2 = Stream.of(6,7,8,9,10);
        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(System.out::println);

//***************************************************************************************//
//distinct
        Stream<Integer> stream4 = Stream.of(1,2,3,4,5,3,2,1);
        stream4.distinct().forEach(System.out::println);

//***************************************************************************************//
//count
        Stream<Integer> stream5 = Stream.of(1,2,3,4,5,3,2,1);

//The stream can be used once time
//        System.out.println(st5.count());
        System.out.println(stream5.distinct().count());

//***************************************************************************************//
//peek
// Intermediate version of forEach
        Stream<Integer> stream6 = Stream.of(1,2,3,4,5,3,2,1);
        System.out.println(stream6.distinct().peek(System.out::println).count());

//***************************************************************************************//
//flatMap
        Student st1 = new Student("Ivan", 'm',22,3,8.3);
        Student st2 = new Student("Nikolay", 'm',28,2,6.4);
        Student st3 = new Student("Elena", 'f',19,1,8.9);
        Student st4 = new Student("Petr", 'm',35,4,7);
        Student st5 = new Student("Maria", 'f',23,3,9.1);

        Facultet f1 = new Facultet("Economics");
        Facultet f2 = new Facultet("Applied mathematics");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Facultet> facultets = new ArrayList<>();
        facultets.add(f1);
        facultets.add(f2);
        facultets.stream().flatMap(facultet -> facultet.getStudentsOnFacultet().stream())
                .forEach(System.out::println);

//***************************************************************************************//
//groupingBy, PartitionBy

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Map<Integer, List<Student>> map1 = students.stream()
                .collect(Collectors.groupingBy(e -> e.getCourse()));

        for(Map.Entry<Integer, List<Student>> entry : map1.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<Boolean, List<Student>> map2 = students.stream()
                .collect(Collectors.partitioningBy(e -> e.getCourse()>2));

        for(Map.Entry<Boolean, List<Student>> entry : map2.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

//***************************************************************************************//
//findFirst
        System.out.println();

        System.out.println("Filtered list:");
        students.stream().filter(e -> e.getCourse()>2).forEach(System.out::println);
        Student firstSt = students.stream().filter(e -> e.getCourse()>2).findFirst().get();
        System.out.println("First element of filtered list: \n" + firstSt);

//***************************************************************************************//
//min, max
        System.out.println();
        Student minSt = students.stream().min((x,y)->x.getCourse()-y.getCourse()).get();
        System.out.println(minSt);
        Student maxSt = students.stream().max((x,y)->x.getCourse()-y.getCourse()).get();
        System.out.println(maxSt);

    }
}

class Facultet{
    String name;
    List<Student> studentsOnFacultet;

    public Facultet(String name) {
        this.name = name;
        studentsOnFacultet = new ArrayList<>();
    }

    public List<Student> getStudentsOnFacultet() {
        return studentsOnFacultet;
    }

    public void addStudentToFaculty(Student st){
        studentsOnFacultet.add(st);
    }
}
