package class29;

import java.util.ArrayList;

public class LambdaExpression {
        public static void main(String[] args) {

            ArrayList<Double> numbers=new ArrayList<>();
            numbers.add(10.0);
            numbers.add(15.2);
            numbers.add(20.0);
            numbers.add(30.5);
            numbers.add(40.5);
            numbers.add(10.3);

            numbers.removeIf(x->x>11);
            System.out.println(numbers);
        }
    }


