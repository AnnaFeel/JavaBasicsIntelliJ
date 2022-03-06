package com.syntax.class19;

public class Horse {
//it is a very good practice to make the fields private
    private String name;
    private int age;
    private double weight;

    //purpose of constructor is to five initial values to the fields of a class
    Horse (String name, int age, double weight) {
        this.name=name;
        this.age=age;
        this.weight=weight;
        //Rule no.1 constructors don't have return types like int String not even void
        //Rule no.2 name of the constructor should be the same as name of the class
    }

    void printHorseName() {
        System.out.println("Horse Name is "+name);
    }
    void setName(String horseName){
        name=horseName;
    }

    void eat() {
        System.out.println(this.name+" is eating");
    }

}
