package com.syntax.class19;

public class Car {
    String name="Toyota";
    String make;
    String colour;
    String type;
    Car(String name, String make, String colour, String type){
        /*
        if we have same local and instance variables java
        always prefer local variables if you want to instruct
        java to use instance variable we use "this" keyword
         */
        this.name=name;
        this.make=make;
        this.colour=colour;
        this.type=type;
    }
    Car(){

    }
    void PrintCar(){
        String name="Tesla";
        System.out.println(name);
        System.out.println(this.name);
    }
}
