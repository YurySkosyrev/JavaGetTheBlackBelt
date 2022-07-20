package com.javacourse.collection.map.hashmap;

import java.util.Objects;

public class Student implements Comparable<Student>{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
//        an example of our hash function
//        return name.length()*7+surname.length()*11+course*53
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}