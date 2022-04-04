package com.syntax.class27;
abstract class Marks{
    abstract double getAverage();
}
class A extends Marks {
    double subj1;
    double subj2;
    double subj3;

    A(double subj1, double subj2, double subj3){
        this.subj1=subj1;
        this.subj2=subj2;
        this.subj3=subj3;
    }
    @Override
    double getAverage() {
        return (subj1+subj2+subj3)/3;
    }
}
class B extends Marks{
    double subj1;
    double subj2;
    double subj3;
    double subj4;

    B(double subj1, double subj2, double subj3, double subj4){
        this.subj1=subj1;
        this.subj2=subj2;
        this.subj3=subj3;
        this.subj4=subj4;
    }
    @Override
    double getAverage() {
        return (subj1+subj2+subj3+subj4)/4;
    }
}
public class Task2 {
    /*
    We have to calculate the average of marks obtained in three subjects by student
    A and 4 subjects by student B. Create class 'Marks' with an abstract method 'getAvg'
    that will be returning the average of marks. Provide implementation of
    abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in three
    subjects as its parameters and the marks in four subjects as its parameters for student B.
    Test your code
     */
    public static void main(String[] args) {
        A obj = new A(10,20,30);
        System.out.println(obj.getAverage());
    }
}
