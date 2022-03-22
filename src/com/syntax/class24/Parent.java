package com.syntax.class24;

public class Parent { //if parent class will be "final" Child class from Parent class would be impossible
    //there is no inheritance from final class
    final String name="Vladlen";
    final void method(){
        // name="Mr.a"; can reassign if a variable is final
        System.out.println("i am parent");
    }
    void method2(){
        //Math.PI - this value is final
        //when you don't need to make changes in your code - you make it final

    }
}

class Child extends Parent{

   /* void method(){
        can't override because it is final method
    }*/
}

