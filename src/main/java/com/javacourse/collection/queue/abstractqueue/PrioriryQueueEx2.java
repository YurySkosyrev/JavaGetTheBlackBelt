package com.javacourse.collection.queue.abstractqueue;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class PrioriryQueueEx2 {
    public static void main(String[] args) {

        Student st1 = new Student("Yury", 3);
        Student st2 = new Student("Sergey", 2);
        Student st3 = new Student("Pavel", 1);
        Student st4 = new Student("Semen", 4);
        Student st5 = new Student("Igor", 5);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
//        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        })

        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);

        System.out.println("Not sorted view: " + priorityQueue);

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
//        remove without exception
//        queue.poll();
        System.out.println(priorityQueue.poll());
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


