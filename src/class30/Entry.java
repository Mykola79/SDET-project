package class30;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class Entry {

    private int key;
    private String value;


    public Entry(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }


    public static void main(String[] args) {

        Set<Entry> entrySet = new LinkedHashSet<>();
        entrySet.add(new Entry(1, "Nezir"));
        entrySet.add(new Entry(2, "Shah"));
        entrySet.add(new Entry(3, "Tami"));
        entrySet.add(new Entry(4, "Aisha"));
        entrySet.add(new Entry(5, "Gul"));
        entrySet.add(new Entry(6, "Bahar"));
        entrySet.add(new Entry(7, "Saba"));


        entrySet.removeIf(x->x.getKey()>2&& x.getValue().contains("i"));
        System.out.println(entrySet);

    }

}
