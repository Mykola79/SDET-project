package class5;

import java.util.Scanner;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter name of the instructor");
        String name=scanner.nextLine();

        switch (name){

            case "Asghar": System.out.println("Will take care of Java Assignment");break;
            case "Moazzam": System.out.println("Will take care of SDLC Assignment");break;
            case "Wegas": System.out.println("Will take of Selenium Assignment");break;
            case "Asel": System.out.println("Will take care of any Assignment");break;
            default: System.out.println("Invalid instructor selected");

        }

    }

}

