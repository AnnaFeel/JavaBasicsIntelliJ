package com.syntax.class17;

public class SyntaxEmployee {
    String empId;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee classObject=new SyntaxEmployee();
        classObject.empId="123";
        classObject.salary=200000;
        System.out.println(classObject.empId);
        System.out.println(classObject.salary);
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee mozzamObject=new SyntaxEmployee();
        mozzamObject.empId="456";
        mozzamObject.salary=198000;
        System.out.println(mozzamObject.empId);
        System.out.println(mozzamObject.salary);
        System.out.println(SyntaxEmployee.CEO);

    }


}
