package com.syntax.class20;

public class FrogTester {
    public static void main(String[] args) {
        Frog frog=new Frog("Valera", "Pink",
                16, 28.5);
        frog.printInfo();

        new Frog("Froggy", "Green", 2).printInfo();

    }
}
