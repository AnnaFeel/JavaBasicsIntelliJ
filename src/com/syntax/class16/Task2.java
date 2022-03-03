package com.syntax.class16;

public class Task2 {

    public static void main(String[] args) {

        //find out how many alphanumeric characters are there in the string

        String s="1234qwerty#$%^&*QWERTY123";
        System.out.println(s.length());
        System.out.println(s.replaceAll("[^A-Za-z0-9]","").length());
        //method chaining calling multiple methods on same line

    }
}
