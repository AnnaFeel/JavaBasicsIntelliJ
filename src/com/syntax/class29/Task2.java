package com.syntax.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        /*
How can you remove all duplicates from ArrayList?
List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");
         */
        List<String> arrayList=new ArrayList<>();
        arrayList.add("John");
        arrayList.add("Jane");
        arrayList.add("James");
        arrayList.add("Jasmine");
        arrayList.add("Jane");
        arrayList.add("James");

        LinkedHashSet linkedHashSet=new LinkedHashSet(arrayList);

        arrayList.clear();

        arrayList.addAll(linkedHashSet);
        System.out.println(arrayList);
    }
}
