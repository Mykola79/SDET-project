package class29;

import java.util.ArrayList;

public class Dog {

    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    void printDogName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Dog d1=new Dog("Jacky","Persian",15);

        ArrayList<Dog>dogs=new ArrayList<>();
        dogs.add(new Dog("Jacky","Persian",15));
        dogs.add(new Dog("Jami","Gersian",5));
        dogs.add(new Dog("Jimmy","Pers",15));
        dogs.add(new Dog("Mami","Pe",10));

        for(Dog d:dogs){
            d.printDogName();
        }
    }
}
