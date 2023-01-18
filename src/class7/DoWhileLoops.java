package class7;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number=1;
        do{System.out.println("Enter a number");
            number=scanner.nextInt();


        }while (number!=5);

        int number2=0;

        while(number2!=5){
            System.out.println("Enter a number");
            number2=scanner.nextInt();}
    }
}
