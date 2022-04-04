package com.syntax.class27;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        //here computer will be doing a lot of work
        arraylist.add(10);
        arraylist.add(12);
        arraylist.add(20);
        arraylist.add(40);
        arraylist.add(50);
        arraylist.add(1, 100);

        LinkedList<Integer> numbers = new LinkedList<>();
        //here computer will not be doing a lot of work
        numbers.add(10);
        numbers.add(12);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(1, 100);
    }
}
