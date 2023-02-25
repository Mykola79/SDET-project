package class29;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        /*Create an array of even numbers from 1 to 500.remove any number that is divisible by 5
         */

        ArrayList<Integer>numbers=new ArrayList<>();

        for(int i=2;i<=500;i=i+2){

            numbers.add(i);
        }
        numbers.removeIf(x->x%5==0);
            System.out.println(numbers);
    }
}
