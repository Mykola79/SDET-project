package class8;

import java.util.Scanner;
import java.util.SortedMap;

public class LoopWithString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter name");
        while (scanner.next().equalsIgnoreCase("Sha")){
            System.out.println("Example with String in loop");}
    }
}
