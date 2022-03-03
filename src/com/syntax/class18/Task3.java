package com.syntax.class18;

public class Task3 {
    /*
    Create a method that will accept a String as a parameter and return a new
    String that consist only of vowels. Method should be available inside the class
    only where it was declared and executed by calling it is name.
     */
/*static method can access other static methods and fields without needing
and object of that class of the class name if they are inside the same class*/

    private static String onlyVowels(String input) {
        //String newStr=input.replaceAll("[^aeiouAEIOU]", "");
        //return newStr;
        return input.replaceAll("[^aeiouAEIOU]", ""); //simple way
    }

    public static void main(String[] args) {
        System.out.println(onlyVowels("Emily"));
    }
}
