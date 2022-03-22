package com.syntax.class25;
abstract class Tea {
    String teaType;
    Tea(String teaType){
        this.teaType=teaType;
    }
    abstract void addSugar();
}
class LemonTea extends Tea{
    LemonTea(String teaType){
        super(teaType);
    }
    void addSugar(){
        System.out.println("For "+teaType+" we need 2 spoons of sugar");
    }
}
class ChaiTea extends Tea {
    ChaiTea(String teaType) {
        super(teaType);
    }

    void addSugar() {
        System.out.println("For " + teaType + " we need 1 spoons of sugar");
    }
}
    public class Replit {
        public static void main(String[] args) {
            LemonTea obj1=new LemonTea("Lemon Tea");
            obj1.addSugar();
            ChaiTea obj2=new ChaiTea("Chai Tea");
            obj2.addSugar();
        }
    }


