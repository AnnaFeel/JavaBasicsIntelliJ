package com.syntax.class19;

public class Panda {
    String name;
    String breed;
    String colour;
    double height;
    int age;
    double weight;

    Panda(String name, String breed, String colour, double height, int age, double weight) {
        this.name=name;
        this.breed=breed;
        this.colour=colour;
        this.height=height;
        this.age=age;
        this.weight=weight;
    }

    Panda(String name, String colour) {
    this.name=name;
    this.colour=colour;
    }

    void printPanda() {
        System.out.println("Panda name is "+this.name);
    }
    void printInfo() {
        System.out.println(this.name+" "+this.breed+" "+this.colour+" "+this.height+" "+this.age+" "+this.weight);
    }
    void printSpecial(){
        System.out.println("This special panda name is "+this.name+" and her colour is "+this.colour);
    }
}
