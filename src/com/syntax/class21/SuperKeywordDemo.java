package com.syntax.class21;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.printColour();
        child.print();
    }
}

class GrandParent {
    String colour = "Blue";

    void printInfo() {
        System.out.println("I am a GrandParent");
    }
}

class Parent extends GrandParent {
    String colour = "Black";

    void printInfo() {
        System.out.println("I am a Parent");
    }
}

class Child extends Parent {
    String colour = "Red";

    void printInfo() {
        System.out.println("I am a Child");
    }

    void print(){
        printInfo();
    }

    void printColour() {
        String colour = "Green";
        //refers to local variable "Green"
        System.out.println(colour);
        //refers to instance variable "Red"
        System.out.println(this.colour);
        //refers to parent variable "Black"
        System.out.println(super.colour);
    }
}
