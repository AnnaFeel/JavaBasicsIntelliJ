package com.syntax.class20;

public class HumanTester {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Zoe";
        System.out.println(student.name);
        student.printName();
        student.studentId = "123";

        System.out.println("*****************");

        Principle principle = new Principle();
        principle.name = "Joe";
        principle.printName();
        principle.specialParkingSpot = false;
    }
}
