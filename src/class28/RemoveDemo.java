package class28;

import java.util.ArrayList;

public class RemoveDemo {
    public static void main(String[] args) {

        ArrayList<String>words=new ArrayList<>();

        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        var name="esfefesfes";
        var c='c';
        var f=12.5;

        words.removeIf(x-> x.endsWith("a"));

        System.out.println(words);
    }
}
