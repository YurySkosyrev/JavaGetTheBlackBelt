package com.javacourse.reflection;

import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee1 employee1 = new Employee1(1, "Yury", "IT");

        Class employeeClass = employee1.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);

        double salaryValue = (Double)field.get(employee1);
        System.out.println(salaryValue);

        field.set(employee1, 1500);
        System.out.println(employee1);
    }
}
