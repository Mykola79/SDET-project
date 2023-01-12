package class5;

import java.util.Scanner;

public class TheLargest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int number3=scanner.nextInt();

        if (number1 > number2) {if(number1>number3) System.out.println(number1+" is the largest");}
    }
}
