package com.javacourse.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareEx {
    public static void main(String[] args) {
        Employee emp1 = new Employee(3, "Yury", "Skosyrev", 600);
        Employee emp2 = new Employee(2, "Ivan", "Ivanov", 700);
        Employee emp3 = new Employee(1, "Petr", "Petrov", 800);

        List<Employee> employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

//        System.out.println("List before sort" + employees);
//        Collections.sort(employees);
//        System.out.println("List after sort" + employees);

        System.out.println("List before sort" + employees);
        Collections.sort(employees, new NameComparator());
        System.out.println("List after sort" + employees);
    }
}
