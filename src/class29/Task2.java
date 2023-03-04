package class29;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<String>cars=new ArrayList<>();

        cars.add("BWS");
        cars.add("Tesla");
        cars.add("Fs");
        System.out.println(cars);

        for (String car:cars){
            System.out.println(car);
        }
        System.out.println("**************************");

        for(int i=0;i<cars.size();i++){
            String str=cars.get(i);
            System.out.println(str);

    }
}}
