package com.syntax.class15;

public class Task1 {

    public static void main(String[] args) {
        String userName="Asel";
        String password="password123";
        String confirmedPassword="password123";

        if (userName.isEmpty() || password.isEmpty()) {
            System.out.println("Username and Password can't be empty");
        } else {

            if (password.length()<8) {
                System.out.println("Password is too short");
            } else {
                if (password.contains(userName)) {
                    System.out.println("Password cannot contain username");
                } else {
                    if (password.equals(confirmedPassword)) {
                        System.out.println("Your username and password has been created");
                    } else {
                        System.out.println("Password do not match");
                    }
                }
            }
        }
    }
}
