package com.syntax.class28;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
     /*
     Create an arrayList of drinks.
     If any drink has letter “a” or “e” replace it with water.
     */
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Coke");
        arrayList.add("Tea");
        arrayList.add("Coffee");
        arrayList.add("milk");

        for (int i=0; i<arrayList.size(); i++){
            if (arrayList.get(i).contains("a") || arrayList.get(i).contains("e")){
                arrayList.set(i, "water");
            }
        }
        System.out.println(arrayList);
    }
}
