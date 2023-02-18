package class17;

public class DogTester {public static void main(String[] args) {

    Dog husky = new Dog("Poky","Husky the dog",2,25.2);
    //husky.breed = "Husky";
    //husky.name = "Poky";
    //husky.age=2;
    //husky.weight=25.2;


    Dog bulldog = new Dog("Lucy","Bulldog the dog",3,27.1);
   // bulldog.breed = "Bulldog";
   // bulldog.name = "Lucy";
   // bulldog.age=3;
    //bulldog.weight=27.1;

    Dog labrador = new Dog("Tomas","Labrador the dog",4,28.0);
    //labrador.breed = "Labrador";
    //labrador.name = "Tomas";
    //labrador.age=4;
    //labrador.weight=28.0;

    Dog pitbull=new Dog("Rocky","Pitbull the dog",5,22.5);
   // pitbull.breed="Pitbull";
    //pitbull.name="Rocky";
    //pitbull.age=5;
    //pitbull.weight=22.5;

    Dog stray=new Dog("Tom","Stray",7,17.3);

    //stray.breed="Stray";
    //stray.name="Tom";
    //stray.age=7;
    //stray.weight=17.3;

    stray.printInfo();

}

}

