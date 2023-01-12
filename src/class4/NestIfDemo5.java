package class4;

public class NestIfDemo5 {
    public static void main(String[] args) {
        int money=600;
        String day="Sunday";
        boolean mood=true;

        if(money>700) {if(mood){
            System.out.println("go shopping");}
            else {
            System.out.println("don't go shopping");}}
        else {
            System.out.println("Just have a nice "+day);

    }}}
