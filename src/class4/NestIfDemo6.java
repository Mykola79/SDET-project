package class4;

public class NestIfDemo6 {public static void main(String[] args) {
    int money = 600;
    String day = "Sunday";
    boolean mood = false;

    if (money > 700){ if (mood) {System.out.println("I will spend all money");}
    else {
        System.out.println("Save money");}}

    else{
        System.out.println("Just have a nice "+day);}

}}