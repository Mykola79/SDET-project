package class7;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {

        boolean condition=true;


            Scanner scanner=new Scanner(System.in);
            int number=15;

            while (condition){
                System.out.println("Number between 10 to 20");

                int userInput=scanner.nextInt();
                if(userInput>number){
                    System.out.println("you entered the number is greater");}
                else if(userInput<number){
                    System.out.println("you entered smaller number");}
            else{System.out.println("you won");
                condition=false;}
    }
}}
