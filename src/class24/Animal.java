package class24;

public abstract class Animal {
    //define the speak eat methods and create 3 subclasses and override the speak eat methods

    abstract void speak();
             void sleep(){System.out.println("Animals sleep 5 to 8 hours a day");}
             }



             class Dog extends Animal{
                 @Override
                 void speak() {
                     System.out.println("Wuff wuff");}
             }


             class Cat extends Animal {
                 @Override
                 void speak() {
                     System.out.println("Meow meow");
                 }
             }
             class AnimalTester{

                 public static void main(String[] args) {
                     // Animal animal=new Animal();
                     //  animal.speak();

                     //An object of abstract class can not be created directly, but it can be created indirectly

                     Animal[] allAnimals = {new Dog(), new Cat()};

                     for (Animal animal : allAnimals) {
                         animal.speak();

                     }
                 }}














