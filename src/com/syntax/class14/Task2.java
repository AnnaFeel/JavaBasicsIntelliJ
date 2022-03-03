package com.syntax.class14;

import java.util.Locale;

public class Task2 {

    String sayHello(String country) {

        country=country.toLowerCase();

        switch (country) {
            case "USA":
                return "Hello";
            case "France":
                return "Bonjour";
            case "Turkey":
                return "Merhaba";
            default:
                return "Zulfiya is very good and patience student who loves Silva";
        }
    }

    public static void main(String[] args) {
        //Create a method that will say Hello in different language based
        //on the country that will passed when method is executed.

        Task2 object = new Task2();
        String country=object.sayHello("France");
        System.out.println(country);

    }
}
