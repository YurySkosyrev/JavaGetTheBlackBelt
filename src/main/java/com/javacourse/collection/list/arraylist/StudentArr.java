package com.javacourse.collection.list.arraylist;

import java.util.Objects;

public class StudentArr implements Comparable<StudentArr> {
    private String name;
    private String group;

    public StudentArr(String name, String group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentArr studentArr = (StudentArr) o;
        return Objects.equals(name, studentArr.name) && Objects.equals(group, studentArr.group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public int compareTo(StudentArr anotherStudentArr) {
        int result = this.group.compareTo(anotherStudentArr.group);
        if (result == 0){
            result = this.name.compareTo(anotherStudentArr.name);
        }
        return result;
    }
}
