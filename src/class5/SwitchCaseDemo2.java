package class5;

import java.util.Scanner;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner (System.in);


        System.out.println("chose m or f");
        char gender=scanner.next().charAt(0);

        //char gender='m';

        switch (gender){

            case 'f': System.out.println("Female");break;
            case 'F': System.out.println("Female");break;
            case 'm': System.out.println("Male");break;
            case 'M': System.out.println("Male");break;
            default: System.out.println("not specified");
        }
    }
}
