package class5;

import java.util.Scanner;

public class ScannerDemo1 {public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    //double weight;

    /*System.out.println("Please enter your age");
    int age=scanner.nextInt();

    System.out.println("Your age is "+age+" years old");

    System.out.println("Please enter your weight");
    double weight=scanner.nextDouble();

    System.out.println("Your weight is "+weight+" pounds");*/
    System.out.println("Please enter your name");
    String name=scanner.nextLine();

    System.out.println("(your name is "+name);

//scanner.nextLine();
    System.out.println("Please enter your full name");

    String fullName = scanner.nextLine();

    System.out.println("You full name is "+fullName);

}
}
