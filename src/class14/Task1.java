package class14;

public class Task1 {
    public static void main(String[] args) {
        // create a string that will hold a sentence. Write a program to get a new String without any spaces

        String str="Batch 15 is Great";
        String newStr=str.replaceAll("a", "r");
        System.out.println(newStr);
    }
}
