package class13;

public class ReplaceAllDemo {
    public static void main(String[] args) {

        String str=" ERGGGrgrg565565456%%&^&(()";
        //replaces ALL upper case letters from A to Z
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[a-z]","#"));
        System.out.println(str.replaceAll("[0-9]","#"));
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        System.out.println(str.replaceAll("[^A-Za-z]","#"));

        System.out.println(str.replaceAll("[^A-Za-z]",""));


    }
}
