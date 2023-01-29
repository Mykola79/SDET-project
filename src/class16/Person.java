package class16;

public class Person {

    private double bankBalance=1250000;

    String Address="Street 123"; //defalt access level
    String name="Jon Snow";

    private void printPhonePassword(){
        System.out.println("pas123");
    }
    public void printTikTok(){}

    public static void main(String[] args) {
        Person person=new Person();

        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);

        person.printPhonePassword();
        person.printPhonePassword();
        person.printTikTok();
    }
}
