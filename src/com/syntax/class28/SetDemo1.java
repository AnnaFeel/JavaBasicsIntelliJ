package com.syntax.class28;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        //no duplicates and no insertion order
        HashSet<String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple"); //duplicate will not be printed as it's not allowed in Set method
        System.out.println(fruit);
    }
}
