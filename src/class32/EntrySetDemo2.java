package class32;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo2 {
    public static void main(String[] args) {

        Map<String, Double> fruitMap = new HashMap<>();

        fruitMap.put("Apple", 12.5);
        fruitMap.put("Banana", 4.9);
        fruitMap.put("Dragon Fruit", 5.6);
        fruitMap.put("pear", 16.5);
        fruitMap.put("Orange", 15.5);
        fruitMap.put("Mango", 10.6);

        fruitMap.entrySet().removeIf(entry->(entry.getKey().contains("a")||entry.getKey().contains("e"))&&entry.getValue()>8);
        System.out.println(fruitMap);



        /*fruitMap.entrySet().removeIf(entry-> (entry.getKey().contains("a") ||entry.getKey().contains("e"))&&entry.getValue()>8);
        System.out.println(fruitMap);*/



    }
}