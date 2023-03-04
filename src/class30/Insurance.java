package class30;

import java.util.ArrayList;
import java.util.Iterator;

abstract class Insurance {/*
    Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
Car class has its own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the subclasses and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.
     */

    String insuranceName;

    Insurance(String insuranceName){this.insuranceName=insuranceName;}


    public abstract void getQuote();

    public abstract void cancelInsurance();

}
class Car extends Insurance{
        String carModel;
    Car(String insuranceName, String carModel){
        super(insuranceName);
        this.carModel=carModel;
    }
    public void getQuote(){
        System.out.println(insuranceName+" quote is $2000 per year");}

    public void cancelInsurance(){
        System.out.println("Cancel any time");
    }

}
class Pet extends Insurance{

    String petType;

    Pet(String petType,String insuranceName){
        super(insuranceName);
        this.petType=petType;}

    public void getQuote(){
        System.out.println(petType+"'s insurance 580$ a year");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel any time");
    }
}
    class Health extends Insurance{
    Health(String insuranceName) {
        super(insuranceName);
}

    @Override
    public void getQuote() {
        System.out.println("Your health insurance is 3400$ per year");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("You can cancel your " + insuranceName + " anytime with %7 fee");

    }

        public static void main(String[] args) {
            /*Create 3 objects of the subclasses and store them in ArrayList.
                    Using for loop/advanced for loop/ iterator access all methods of the class.*/

            ArrayList <Insurance>arrayList=new ArrayList<>();

            arrayList.add(new Car("BMW","Geico"));
            arrayList.add(new Pet("Love Pet","Cat"));
            arrayList.add(new Health("Allianse"));

            for (Insurance ins:arrayList){ins.getQuote();ins.cancelInsurance();}

            Iterator<Insurance> it = arrayList.iterator();
            while (it.hasNext()) {
                Insurance insurance = it.next();
                System.out.println(insurance.insuranceName);

            }



        }

        }

