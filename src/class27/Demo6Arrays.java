package class27;

import java.util.ArrayList;

public class Demo6Arrays {
    public static void main(String[] args) {

        ArrayList<Boolean> booleans = new ArrayList<>();

        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);

        System.out.println(booleans.get(0));
        System.out.println(booleans.get(4));
        System.out.println(booleans.size());

        int i = 0;
        while (i < booleans.size()) {
            System.out.print(booleans.get(i)+" ");
            i++;
        }
    }
}