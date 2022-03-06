package com.syntax.class19;

public class SeriousHorseTester {

    public static void main(String[] args) {
        Horse horse = new Horse("Jacky", 20, 400);
        /*
        "Horse" -> Data type (Names of classes)
        "horse" -> object/instance/reference variable/variable
        "=" -> assignment operator
        "Horse("Jacky", 20, 400)" -> call to a constructor
         */
        horse.printHorseName();
        horse.eat();

    }
}
