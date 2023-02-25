package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class LambdaExpression1 {
        public static void main(String[] args) {

            ArrayList<Double> numbers = new ArrayList<>();
            numbers.add(10.0);
            numbers.add(15.2);
            /*numbers.add(20.0);
            numbers.add(30.5);
            numbers.add(40.5);
            numbers.add(10.3);*/

            Iterator<Double> iterator = numbers.iterator();

            System.out.println(iterator.hasNext());
            System.out.println(iterator.next());
            System.out.println(iterator.hasNext());
            System.out.println(iterator.next());

            System.out.println(numbers);
            while (iterator.hasNext()) {

                double number = iterator.next();
                if (number > 11) {
                    iterator.remove();
                }
            }

        }}
