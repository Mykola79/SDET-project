package class2;

public class VariablesDemo2 {
    public static void main(String[] args) {
        int numberBox=10;
                numberBox=20; //we are reassigning 20 to numberBox, so it overwrite 10 with 20
        System.out.println(numberBox);
        numberBox=200;
        System.out.println(numberBox);
        System.out.println(numberBox+20);
    }
}
