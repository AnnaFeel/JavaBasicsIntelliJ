package com.syntax.class16;

public class Task3 {

    public static void main(String[] args) {

        String a="Is it Saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(a.length());
        //String class method to count the number of characters in a class
        System.out.println(a.split("[?]").length);
        //length property that we can use to check the number of elements in an array

    }
    //Asghar gave this example
    String[] method(int [] numbers) {
        String[] stringArr=new String[numbers.length];
        return stringArr;
    }


}
