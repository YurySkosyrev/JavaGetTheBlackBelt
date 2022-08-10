package com.javacourse.reflection;

public class Employee1 {
    public int id;
    public String name;
    public String department;
    private double salary = 1000;

    public Employee1() {
    }

    public Employee1(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }


    private void changeDepartment(String newDepartment){
        department = newDepartment;
        System.out.println("Department is " + department);
    }

    public void increaseSalary(){
        salary*=2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
