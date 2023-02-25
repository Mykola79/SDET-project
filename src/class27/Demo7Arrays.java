package class27;

import java.util.ArrayList;

public class Demo7Arrays {
    public static void main(String[] args) {

        ArrayList<String>names=new ArrayList<>();

        names.add("Fizzy");
        names.add("Savo");
        names.add("Sam");
        names.add("Urwa");
        names.add("Tarik");
        names.add("Abeera");

        System.out.println(names.contains("Daria"));

        System.out.println(names.indexOf("Savo"));

        names.set(3,"Bagira");
        System.out.println(names);

        names.remove("Sam");
        System.out.println(names);

        int i=0;
        while (i< names.size()){
            System.out.print(i+" ");i++;}

        int j=0;
        do{System.out.print(j+" ");j++;} while (j< names.size());


        System.out.println(names);
    }
}
