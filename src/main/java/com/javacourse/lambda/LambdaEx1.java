package com.javacourse.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaEx1 {

//***************************************************************************************//
//
//    public void PrintStudentsOverGrade(ArrayList<Student> al, double grade){
//        for(Student s : al){
//            if (s.avgGrade>grade){
//                System.out.println(s);
//            }
//        }
//    }
//
//    public void PrintStudentsUnderAge(ArrayList<Student> al, int age){
//        for(Student s : al){
//            if (s.age<age){
//                System.out.println(s);
//            }
//        }
//    }
//
//    public void PrintStudentsMix(ArrayList<Student> al, int age, double grade, char sex){
//        for(Student s : al){
//            if (s.age>age && s.avgGrade<grade && s.sex==sex){
//                System.out.println(s);
//            }
//        }
//    }
//
//***************************************************************************************//


    public void testStudent(ArrayList<Student> al, StudentChecks sc){
        for(Student s : al){
            if (sc.checkStudent(s)){
                System.out.println(s);
            }
        }
    }
}

class TestLambda{
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


//***************************************************************************************//
//
//        info.PrintStudentsOverGrade(students, 8);
//        info.PrintStudentsUnderAge(students, 30);
//        info.PrintStudentsMix(students, 19, 9.5, 'f');
//
//***************************************************************************************//

        LambdaEx1 info = new LambdaEx1();

        info.testStudent(students, new CheckOverGrade());

//        Variable 's' is already defined in the scope
//        int s= 1;

        info.testStudent(students, new StudentChecks() {
            @Override
            public boolean checkStudent(Student s) {
                return s.age>20;
            }
        });

//***************************************************************************************//

        info.testStudent(students, (Student s) -> {return s.avgGrade>8;});

        info.testStudent(students, (Student s) -> {
            System.out.println("Hello");
            return s.avgGrade>8;});

        info.testStudent(students, s -> {return s.age<30;});

        info.testStudent(students, (Student s) -> s.age<30);

        info.testStudent(students, s -> s.age<30);

        StudentChecks sc = s -> s.age<30;
        info.testStudent(students, sc);

        info.testStudent(students, (Student s) -> {return s.age>19 && s.avgGrade<9.5 && s.sex=='f';});

//***************************************************************************************//

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return  o1.course- o2.course;
            }
        });


        Collections.sort(students, (s1, s2) -> (s1.course - s2.course));
        System.out.println(students);

    }
}

//  Functional interface must have one abstract method
interface StudentChecks{
    boolean checkStudent(Student s);
}

class CheckOverGrade implements StudentChecks {

    @Override
    public boolean checkStudent(Student s) {
        return s.avgGrade>8;
    }
}
