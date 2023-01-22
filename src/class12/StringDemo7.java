package class12;

public class StringDemo7 {
    public static void main(String[] args) {

  String str="I love java";
  boolean starsWith=str.startsWith("I");

  System.out.println(starsWith);
        System.out.println(str.endsWith("java"));


        //method chaining is when multiple methods are called on the same line
        System.out.println(str.toLowerCase().startsWith("i"));

        System.out.println(str.contains("java"));



    }
}
