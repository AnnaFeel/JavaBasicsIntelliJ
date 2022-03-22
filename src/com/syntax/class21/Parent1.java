package com.syntax.class21;

public class Parent1 {
    String name="Parent"; //that would be third priority
    void printName(){
        System.out.println(name);
    }
}
class Child1 extends Parent1{
    String name="Child"; //second priority to instance variables
    void printName(){
        String name="Teyfur"; //first priority is given to local variables
        System.out.println(name);
    }
}
class ParentTester{
    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.printName();
    }
}