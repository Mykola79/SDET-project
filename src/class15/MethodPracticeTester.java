package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {

        MethodPractice mp=new MethodPractice();
        boolean isEven=  mp.isEven(15);
        System.out.println(isEven);


        boolean isEven2= mp.isEven(100);

        System.out.println(mp.isEven(200));
        System.out.println(mp.isEven(300));


    }
}
