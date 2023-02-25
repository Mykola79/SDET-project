package class22;

public class Animal {
    String color;
    int age;
    double weight;

        void speak(){
            System.out.println("Animals can speak");
        }




    static class Cat extends Animal{

                    void speak(){
                    super.speak();
                    System.out.println("Meow Meow .......");
                }
                void printName(){
                        System.out.println("name");}}



    class Dog extends Animal{}




    public static void main(String[] args) {

                    Cat cat = new Cat();

                    cat.speak();}
                }








