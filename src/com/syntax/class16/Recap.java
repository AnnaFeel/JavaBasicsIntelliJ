package com.syntax.class16;

public class Recap {

    public static void main(String[] args) {
        String str="This is my #0345678967 Tarik";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1));
        //this code would return last letter of our String

        System.out.println(str.indexOf('A'));
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));

        System.out.println(str.indexOf("#"));
        System.out.println(str.substring(str.indexOf("#")+1, str.indexOf("#")+1+11));
//alternately we could write System.out.println(str.substring(12,23));
    }
}
