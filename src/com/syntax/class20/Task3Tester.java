package com.syntax.class20;

public class Task3Tester {
    public static void main(String[] args) {
        new Task3(10); //private is printed as "default"
        new Task3("Haha");
        new Task3(10.2);
        new Task3(false);

        //all the rest will be executed fine apart from private
    }
}
