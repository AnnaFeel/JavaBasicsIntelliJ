package com.syntax.class19;

public class PandaTest {
    public static void main(String[] args) {
        Panda panda1=new Panda("Bobo", "Red Panda", "Red", 188.5, 28, 70.5);
        panda1.printInfo();
        Panda panda2=new Panda("Booboo", "Black Panda", "Black&White", 168.7, 30, 66.8);
        panda2.printPanda();
        Panda panda3=new Panda("Flower", "White");
        panda3.printSpecial();
    }
}
