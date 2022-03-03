package com.syntax.class17;

public class Students {
    String name;
    int id;
    static int numberOfStudents=0;

    public static void main(String[] args) {
        Students firstObj = new Students();
        firstObj.name="Flopsy";
        firstObj.id=001;
        Students.numberOfStudents++;

        Students secondObj = new Students();
        secondObj.name="Mopsy";
        secondObj.id=002;
        Students.numberOfStudents++;

        Students thirdObj = new Students();
        thirdObj.name="Cotton-tail";
        thirdObj.id=003;
        Students.numberOfStudents++;
        System.out.println(numberOfStudents);



    }
}
