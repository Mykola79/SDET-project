package class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetsDemo1 {
    public static void main(String[] args) {

        HashSet<String>list=new HashSet<>();

        list.add("java");
        list.add("tea");
        list.add("coke");
        list.add("pepsi");
        list.add("java");

        System.out.println(list);


    }
}
