package class15;

public class MPractice4 {
    /*create a method that takes two numbers as parameters and return the larger number*/

    int largerNumber(int num1, int num2){

       if(num1>num2){return num1;}
       else{return num2;}

            }

    public static void main(String[] args) {

        MPractice4 mpractice=new MPractice4();

        System.out.println((mpractice.largerNumber(12,13)));
    }

    }

