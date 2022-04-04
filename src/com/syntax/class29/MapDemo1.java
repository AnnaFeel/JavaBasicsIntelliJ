package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Asghar Nazir");
        names.add("Muhammad");
        System.out.println(names.get(0));

        HashMap<Integer, String> map = new HashMap<>();
        map.put(12345, "Asghar Nazir");
        map.put(123, "Muhammad");
        System.out.println(map.get(12345));

        HashMap<String, String> groceries = new HashMap<>();
        groceries.put("Lilly", "Eggs, milk, Bread etc");
        groceries.put("Teyfur", "Camel, Horse, CamelHorse, etc");
        groceries.put("Asghar", "Macbook, iphone 13, Apple Monitor");
        System.out.println(groceries.get("Lilly"));
    }
}
