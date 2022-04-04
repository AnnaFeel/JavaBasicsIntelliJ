package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> numberList = new ArrayList<>();//you can use even a Scanner class here
        Double double1 = new Double(10.5);
        double number = double1.doubleValue(); //this method will give us our primitive back (unboxing)
        Double number2 = new Double(number); //opposite - boxing (placing primitive inside the box)
        Double number3=10.5; //auto-boxing
        Double number4=number3;
        number3=number4; //auto-unboxing
        //it's very important topic(boxing, unboxing). Popular question on interview.

        String name = new String("Hakan"); //this is unnecessary
        String name3="Hakan";
    }
}
