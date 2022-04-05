package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a map of a building. Store floor number and it is associated company name.
        (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
        Print your map
         */
        Map<Integer, String> building = new HashMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Amazon");
        building.put(4, "Facebook");
        building.put(5, "Google");
        building.put(2, "DoorDash");
        building.put(7, "Uber");
        System.out.println(building.size());
        System.out.println(building);
        building.replace(4,"Meta"); // update the value
        System.out.println(building);
        building.remove(7);
        System.out.println(building);


    }
}
