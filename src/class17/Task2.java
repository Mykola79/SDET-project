package class17;

public class Task2 {
        /*Create a method that will take a String as a parameter and returns reversed String.
                Method should be available to all classes within your project and accessible by class name.*/
        static String reverseStr(String input) {     //using static

            return new StringBuilder(input).reverse().toString();
        }

    public static void main(String[] args) {


        System.out.println(Task2.reverseStr("Sunday"));
    }
    }




