package class29;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<String>makeup=new ArrayList<>();

        makeup.add("Lipstick");
        makeup.add("Lipstice");
        makeup.add("Lipstick");
        makeup.add("Lipstice");
        makeup.add("Lipstick");

        makeup.removeIf(x->x.endsWith("e"));
        System.out.println(makeup);
    }
}
