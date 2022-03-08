package com.syntax.class20;

public class Frog {

    String name;
    String colour;
    int age;
    double weight;

    public Frog(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        weight = 10;
    }

    public Frog(String name, String colour, int age, double weight) {
        this(name, colour, age);//this must be first line inside constructor body
        this.weight = weight;
    }

    void printInfo(){
        System.out.println(name+" "+colour+" "+age+" "+weight);
    }
}
