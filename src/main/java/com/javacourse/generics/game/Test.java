package com.javacourse.generics.game;

public class Test {

    public static void main(String[] args) {

        Schoolar schoolar1 = new Schoolar("Ivan", 12);
        Schoolar schoolar2 = new Schoolar("Petr", 13);

        Student student1 = new Student("Sergey", 20);
        Student student2 = new Student("Victor", 21);

        Employee employee1 = new Employee("Maria", 35);
        Employee employee2 = new Employee("Zaur", 32);

        Team<Schoolar> schoolarTeam1 = new Team<>("Drakony");
        schoolarTeam1.addNewParticipant(schoolar1);
        schoolarTeam1.addNewParticipant(schoolar2);


        Team<Schoolar> schoolarTeam2 = new Team<>("Mudrecy");
        schoolarTeam2.addNewParticipant(new Schoolar("Pavel", 14));
        schoolarTeam2.addNewParticipant(new Schoolar("Sergey", 11));

        Team<Student> studentTeam = new Team<>("Vpered");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Rabotygi");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolarTeam1.playWith(schoolarTeam2);
        
    }

}
