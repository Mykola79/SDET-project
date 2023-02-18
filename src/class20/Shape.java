package class20;

public class Shape {
    /*1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle
class. In circle class create a method to calculate the area of circle. Test your code*/

        double radius;
        Shape(double radius){

            this.radius=radius;}


    }
    class Circle extends Shape {
        double radius;

        Circle(double radius) {

        super(radius);
        this.radius=radius;}


        void display() {
            System.out.println("radius " + radius + " * radius " + radius + " equals area " + (radius * radius));
        }


    public static void main(String[] args) {

            Circle ccr=new Circle(4.5);

            ccr.display();


        }

    }







