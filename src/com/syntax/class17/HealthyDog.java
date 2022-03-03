package com.syntax.class17;

public class HealthyDog {
    //When the information is expected to be different from object to object
    //we store that information in an instance variable.
    String name; //instance
    String colour; //instance
    //if we know that a value will stay the same for all the objects of a class
    //we create a static variable for that
    static int numOfLegs = 4; //static
    void eat() {
        int noOfTimes=3; //local
        System.out.println(name+" eats "+noOfTimes+" times");
    }
    public static void main(String[] args) {
        HealthyDog dog=new HealthyDog(); //local
        dog.name="Scooby";
        dog.colour="Brown";
        HealthyDog.numOfLegs=6;
        dog.eat();

        HealthyDog dog2=new HealthyDog();
        dog2.name="Tommy";
        dog2.colour="Black";
        HealthyDog.numOfLegs=4;
        dog2.eat();
    }
}
