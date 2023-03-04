package class30;

import java.util.HashMap;

public class MapsDemo3 {
    public static void main(String[] args) {


        HashMap<Integer,String>floor=new HashMap<>();

        floor.put(1,"Google");
        floor.put(2,"Syntax");
        floor.put(3,"Apple");
        floor.put(4,"IBM");
        floor.put(5,"Samsung");
        floor.put(6,"McDonalds");
        floor.put(7,"Samsung");

        System.out.println(floor.size());

        floor.replace(4,"Shell");
        floor.remove(7);
        System.out.println(floor);
    }
}
