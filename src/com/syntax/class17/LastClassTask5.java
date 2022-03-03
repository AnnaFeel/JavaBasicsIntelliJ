package com.syntax.class17;

public class LastClassTask5 {
    // How would you check if String is palindrome or not?
    // Example1: aba ---> true
    // Example2: Abbc --> false
    public static void main(String[] args) {
        LastClassTask5 task = new LastClassTask5();
        System.out.println(task.isPalindrome("aba"));
    }

    boolean isPalindrome(String inputStr) {
        String reversedStr = reversedString(inputStr);
        return reversedStr.equals(inputStr);
    }

    String reversedString(String inputStr) {
        //converting S string to StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder = new StringBuilder(inputStr);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
