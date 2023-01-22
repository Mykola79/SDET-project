package class12;

public class CarTester {
    public static void main(String[] args) {

        Car bmw=new Car();

        bmw.make="BMW";
        bmw.model="i7";
                bmw.year=2022;
                bmw.color="Grey";
                bmw.moveForward();

                Car audi=new Car();

                audi.model="E-tron";
                audi.make="audi";
                        audi.year=2022;
                        audi.color="black";

                        audi.applyBreaks();
    }


}