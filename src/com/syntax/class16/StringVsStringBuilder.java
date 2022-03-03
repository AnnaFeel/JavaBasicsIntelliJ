package com.syntax.class16;

public class StringVsStringBuilder {

    public static void main(String[] args) {

        String s=new String ("Asghar Is Great");//original string
        s.concat("hahah"); //add new String hahah to the string
        System.out.println(s); //printing out the original string

        StringBuilder stringBuilder=new StringBuilder("Asghar Is Awesome");//original sting
        stringBuilder.append("HAHAH"); //add new String HAHAH to the String
        System.out.println(stringBuilder);//printing out the original string
    }
}
