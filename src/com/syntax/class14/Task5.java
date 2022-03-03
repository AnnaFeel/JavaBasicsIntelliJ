package com.syntax.class14;

public class Task5 {
    /*
    Wrtite a method to return wether given number is prime or not.
     */

    boolean isPrime(int number) {
        boolean isPrime=true;

        if (number>1) {
            for (int i=2; i<number; i++) {
                if (number%2==0) {
                    isPrime=false;
                    break;
                }
            }
        } else {
            isPrime=false;
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Task5 obj = new Task5();
        System.out.println(obj.isPrime(13));

    }
}
