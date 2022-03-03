package com.syntax.class15;

public class StringDemo2 {
    public static void main(String[] args) {
        String name = "How Are @you guys @";
        System.out.println(name.indexOf("Are"));

        System.out.println(name.lastIndexOf("@"));
        System.out.println(name.indexOf("@"));
        System.out.println(name.indexOf(name, 0));
    }
}
