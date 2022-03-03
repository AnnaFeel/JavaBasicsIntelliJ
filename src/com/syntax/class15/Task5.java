package com.syntax.class15;

public class Task5 {
    /*
    2. Create a String and print it in reverse order (Sunday → yadnuS).
     */

    public static void main(String[] args) {

        String str = "Sunday";
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println(reversedStr);
    }
}
