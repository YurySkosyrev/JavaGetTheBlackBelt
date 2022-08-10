package com.javacourse.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class classEmployee = Class.forName("com.javacourse.reflection.Employee");

        Constructor <Employee> constructor = classEmployee.getConstructor();
        Employee emp = constructor.newInstance();

        Constructor constructor1 = classEmployee.getConstructor(int.class, String.class, String.class);
        Object obj1 = constructor1.newInstance(1, "Yury", "IT");
        System.out.println(obj1);

        Method method = classEmployee.getMethod("setSalary", double.class);
        method.invoke(obj1, 800);
        System.out.println(obj1);
    }
}
