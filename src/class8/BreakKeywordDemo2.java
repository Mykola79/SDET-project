package class8;

public class BreakKeywordDemo2 {
    public static void main(String[] args) {
        boolean summer = true;
        int temp = 77;

        while (summer) {if (temp <= 100) {
            System.out.println("I love summer " + temp);
        } else {
            System.out.println("It is very hot " + temp);break;}temp+=5;}
    }
}
