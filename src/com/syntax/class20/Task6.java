package com.syntax.class20;

public class Task6 {
   /* Write Book class that will have instance variables and 2
   Constructors. While creating an object make sure:
    - Instance variables are being initialized
    - Both Constructors are being executed*/

    String bookName;
    int bookYear;

    public Task6(){
        System.out.println("No argument constructor");
    }
    public Task6(String bookName, int bookYear) {
        this();
        this.bookName=bookName;
        this.bookYear=bookYear;
        System.out.println("Two arguments constructor");
    }

}
