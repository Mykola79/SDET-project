package class16;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {

        Person person=new Person();

        //System.out.println(person.bankBalance);//private double
        System.out.println(person.Address);
        System.out.println(person.name);

        person.printTikTok();
        //person.printPassword();

        Scanner scanner=new Scanner(System.in);
                scanner.next();



    }
}
