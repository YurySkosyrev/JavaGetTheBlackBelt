package com.javacourse.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;


public class PredicateEx {

    public void testStudent(ArrayList<Student> al, Predicate<Student> predicate) {
        for (Student s : al) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }

}

class TestPredicate{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        PredicateEx info = new PredicateEx();
        info.testStudent(students, s -> s.age>20);

        Predicate<Student> pr1 = s -> s.age<23;
        Predicate<Student> pr2 = s -> s.avgGrade>8;

        System.out.println("pr1 && pr2");
        info.testStudent(students, pr1.and(pr2));

        System.out.println("pr1 or pr2");
        info.testStudent(students, pr1.or(pr2));

        System.out.println("pr1 negate");
        info.testStudent(students, pr1.negate());
    }
}
