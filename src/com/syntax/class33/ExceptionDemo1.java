package com.syntax.class33;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        System.out.println("Opening the application");
        System.out.println("Displaying the welcome messages");
        System.out.println("User is trying to use some feature 1");
        System.out.println("User is trying to use some feature 2");
        System.out.println(10/0);
         //Java not going to execute any other line because this one will give us error
        //so Java is going to ignore all next lines
        System.out.println("User is trying to use some feature 3");
        System.out.println("User is trying to use some feature 4");
        System.out.println("User is trying to use some feature 5");
    }
}
