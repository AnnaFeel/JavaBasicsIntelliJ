package com.syntax.class28;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
    /*
    Create an arrayList of even numbers from 1 to 500.
    Remove any number that is divisible by 5 from that arrayList.
     */
        ArrayList<Integer> number = new ArrayList<>();
        for (int i=2; i<=500; i++){
            number.add(i);
        }
        number.removeIf(integer -> integer % 5 != 0);
        System.out.println(number);
         /*
         Iterator<Integer> iterator= number.iterator();
         while (iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }
        }*/
    }
}
