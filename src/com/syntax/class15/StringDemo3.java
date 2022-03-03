package com.syntax.class15;

public class StringDemo3 {

    public static void main(String[] args) {

        String name="111-222-1234";

        System.out.println(name.substring(4)); //this code would ignore all data before character 3
//we can put any index in brackets we want to ignore anything before it
        // output here would be "222-1234"

        System.out.println(name.substring(4, 7)); // use this if you need to print something in the middle
        //output here would be "222"

    }
}
