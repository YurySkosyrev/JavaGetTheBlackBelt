package com.javacourse.collection.arraylist;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String group;

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(group, student.group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student anotherStudent) {
        int result = this.group.compareTo(anotherStudent.group);
        if (result == 0){
            result = this.name.compareTo(anotherStudent.name);
        }
        return result;
    }
}
