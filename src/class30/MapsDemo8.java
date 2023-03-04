package class30;

import java.util.TreeMap;

public class MapsDemo8 {
    public static void main(String[] args) {
        /*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/

        TreeMap<String,String>countries=new TreeMap<>();
        countries.put("Morocco","Rabat");
        countries.put("USA","Washington DC");
        countries.put("India","New Dehli");
        countries.put("France","Paris");

        var entrySet=countries.entrySet();
        for(var entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("***********************");

        var iterator=countries.entrySet().iterator();
        while(iterator.hasNext()){
            var entry=iterator.next();
            System.out.println((entry.getKey())+" "+entry.getValue());
        }

    }
}
