package class9;

public class ArraysDemo {
    public static void main(String[] args) {

        String name="Slava";
        String name1="Safi";
        String name2="Jason";
        String name3="Nabi";
        String name4="Anees";

        String[] names={"Slava","Safi", "Jason", "Nabi", "Anees", "Joseph"};

        System.out.println(name2);
        System.out.println(names[4]);
        System.out.println(names[3]);
        System.out.println(names[5]);
        //System.out.println(names[500]);
        //System.out.println(names[-5]);

        System.out.println("Neeeeextttttttttttttt");


        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }


    }
}
