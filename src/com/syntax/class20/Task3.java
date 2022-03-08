package com.syntax.class20;

public class Task3 {
    /*
    Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this
    class: 1 - inside same class; 2 - from outside the class; 3 - from different
    class inside different package  and observe result.
     */

    private Task3(int i) {
        System.out.println("private");
    }

    Task3(double d) {
        System.out.println("default");
    }

    protected Task3(String s) {
        System.out.println("protected");
    }

    public Task3(boolean b) {
        System.out.println("public");
    }

    public static void main(String[] args) {
        new Task3(10);
        new Task3("Haha");
        new Task3(10.2);
        new Task3(false);


    }
}
