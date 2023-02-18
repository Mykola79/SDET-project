package class18;

public class ThisDonkey {

    String name;
    int age;
    double weight;

     ThisDonkey(String name, int age) {

         this.name = name;
         this.age = age;
         this.weight = weight;
    }
    void print() {
        System.out.println("Donkey's name " + name + " and age " + age + " and weight " + weight);
    }



    public static void main(String[] args) {

        ThisDonkey donkey =new ThisDonkey("Pepper",3);

        donkey.print();


    }
}

