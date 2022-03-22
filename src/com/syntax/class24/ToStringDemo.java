package com.syntax.class24;

public class ToStringDemo {
    String name;
    int age;
    ToStringDemo(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return name+" "+age;
    }

    public static void main(String[] args) {
        ToStringDemo toStringDemo=new ToStringDemo("Mr.A",10);
        System.out.println(toStringDemo.toString());// if we try to print object without .toString() it would be weird code

    }
}

