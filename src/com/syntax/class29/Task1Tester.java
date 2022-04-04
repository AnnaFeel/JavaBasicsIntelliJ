package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1Tester {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("AdamsG","Tesla S"));
        insurances.add(new Pet("Doggy Insurance", "Cavalier"));
        insurances.add(new Health("Keiser"));

        for(Insurance i:insurances){
            i.getQuote();
            i.cancelInsurance();
        }
        Iterator<Insurance> iterator= insurances.iterator();
        while(iterator.hasNext()){
            Insurance i = iterator.next();
                    i.getQuote();
                    i.cancelInsurance();
        }
    }
}
