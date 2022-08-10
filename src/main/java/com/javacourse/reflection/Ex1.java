package com.javacourse.reflection;

import java.lang.reflect.*;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("com.javacourse.reflection.Employee");
//        Class employeeClass2 = Employee.class;
//
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();

        Field someField = employeeClass.getField("id");
        System.out.println("Type of id = " + someField.getType());
        System.out.println("---------------------------------------");

        Field[] fields = employeeClass.getFields();
        for (Field field : fields){
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("---------------------------------------");


        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field field : allFields){
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("---------------------------------------");

        Method someMethod1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " + someMethod1.getReturnType()
                + ", parametr types = " + Arrays.toString(someMethod1.getParameterTypes()));
        System.out.println("---------------------------------------");

        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method increaseSalary = " + someMethod2.getReturnType()
                + ", parametr types = " + Arrays.toString(someMethod2.getParameterTypes()));
        System.out.println("---------------------------------------");

        Method[] methods = employeeClass.getMethods();
        for (Method method : methods){
            System.out.println("Method name = " + method.getName()
            + " return type = " + method.getReturnType()
            + " parameter types = "
                    + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("---------------------------------------");

        Method[] allMethods1 = employeeClass.getDeclaredMethods();
        for (Method method : allMethods1){
            System.out.println("Method name = " + method.getName()
                    + " return type = " + method.getReturnType()
                    + " parameter types = "
                    + Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("---------------------------------------");
        
        Method[] allMethods2 = employeeClass.getDeclaredMethods();
        for (Method method : allMethods2){
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Method name = " + method.getName()
                        + " return type = " + method.getReturnType()
                        + " parameter types = "
                        + Arrays.toString(method.getParameterTypes()));
            }
        }

        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("Constructor has " + constructor1.getParameterCount() +
                " parameters, their types are " + Arrays.toString(constructor1.getParameterTypes()));
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount() +
                " parameters, their types are " + Arrays.toString(constructor2.getParameterTypes()));
        Constructor constructor3 = employeeClass.getConstructor(int.class, String.class, String.class, double.class);
        System.out.println("Constructor has " + constructor3.getParameterCount() +
                " parameters, their types are " + Arrays.toString(constructor3.getParameterTypes()));

        System.out.println("---------------------------------------");

        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor constructor : constructors){
            System.out.println(constructor.getName() + " has " + constructor.getParameterCount() +
                    " parameters, their types are " + Arrays.toString(constructor.getParameterTypes()));
        }
    }
}
