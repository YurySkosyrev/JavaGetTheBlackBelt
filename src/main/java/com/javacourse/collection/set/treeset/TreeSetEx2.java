package com.javacourse.collection.set.treeset;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        Student st1 = new Student("Yury", 3);
        Student st2 = new Student("Sergey", 2);
        Student st3 = new Student("Pavel", 1);
        Student st4 = new Student("Semen", 4);

        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);

        System.out.println(treeSet);

        System.out.println("First element: " + treeSet.first());
        System.out.println("First last: " + treeSet.last());

        System.out.println(treeSet.headSet(st1));
        System.out.println(treeSet.tailSet(st1));
        System.out.println(treeSet.subSet(st2, st4));

        Student st5 = new Student("Semen", 4);
        System.out.println(st4.equals(st5));
        System.out.println(st4.compareTo(st5)==0);
    }

}

class Student implements Comparable<Student>{

    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }

//    if a.equals(b) == true
//    a.compareTo(b) == 0
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
//        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
//        return Objects.hash(name, course);
        return Objects.hash(course);
    }
}
