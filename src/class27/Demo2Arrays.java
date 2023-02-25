package class27;

public class Demo2Arrays {
    public static void main(String[] args) {

        String name="Urwa";
        String names[]={"Hiral","Nima","Laura","Nat"};
        System.out.println(contains(name,names));

        String arr[]=new String[2];

        names[3]="Shah";
    }
    public static boolean contains(String nameToBeSearched, String[] names){
        for(String name:names) {
            if (nameToBeSearched.equals(name)) {
                return true;}
            }

                return false;
            }
}