package com.syntax.class26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        String name="Yazgul";
        String name2="Farah";
        // Not scalable if we have to store large amount of data
        //Arrays can be good option to tackle this problem

        String[] names={"Yazgul","Andrew"};//this one is fixed
        // names[2]="Teyfur";
        String[] names2= new String[1000]; //here we are creating a bigger array that can store 1000 names
        names2[0]="Elena";
        names2[2]="Andrew";
        System.out.println(Arrays.toString(names2));//printing all arrays on the same line code
        //we will have all empty indexes printing "null"
        ArrayList<String> syntaxStudents=new ArrayList<>();//diamond operator
        //ArrayList=> Name of the class
        //<> diamond operator
        //String datatype
        syntaxStudents.add("Dmitriy");
        syntaxStudents.add("Mike");
        syntaxStudents.add("Andrew");
        System.out.println(syntaxStudents);
        //this is a much better practice


    }
}
