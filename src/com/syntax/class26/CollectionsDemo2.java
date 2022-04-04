package com.syntax.class26;

import java.util.ArrayList;

public class CollectionsDemo2 {
    public static void main(String[] args) {
       ArrayList<String> countries = new ArrayList<>();
       countries.add("USA");
       countries.add("Turkey");
       countries.add("Morocco");
       countries.add("Iraq");
       countries.add("Ghana");
       countries.add("Eritrea");
       countries.add("Afghanistan");
        System.out.println(countries.get(3));
        //System.out.println(countries.get(-1)); will give us error
        //System.out.println(countries.get(7)); out of bound
        countries.add(3, "Pakistan");
        //inserts the element at this specified index and shift everything else (no data will be lost)
        System.out.println(countries);
        System.out.println(countries.size());//will give us our array size
        countries.add("PAKISTAN");
        countries.remove("Pakistan");
        System.out.println(countries);
        countries.clear();
        System.out.println(countries);
        System.out.println(countries.size());
    }
}
