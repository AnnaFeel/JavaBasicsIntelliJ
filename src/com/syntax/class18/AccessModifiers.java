package com.syntax.class18;

public class AccessModifiers {

    private String name="Naughty Tarik"; //private - keyword for private access
    int age=50; //default access(accessible within the same package)
    protected double weight=50; //protected - keyword for protected access
    public String colour="White"; //public means accessible anywhere

    public static void main(String[] args) {
        AccessModifiers am=new AccessModifiers();
        System.out.println(am.name);
        System.out.println(am .age);
        System.out.println(am.weight);
        System.out.println(am.colour);


    }

}
