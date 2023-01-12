package class4;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Are you ready for holidays?");
        boolean value= input.hasNextBoolean();

        System.out.println("I am ready for holidays");
    }
}
