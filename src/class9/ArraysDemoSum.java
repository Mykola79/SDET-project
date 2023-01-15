package class9;

public class ArraysDemoSum {
    public static void main(String[] args) {

        // 10 20 30 45 50

        int[] numbers={10, 20, 30, 45, 50};

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {sum=sum+numbers[i];
            System.out.println(sum);}


    }
}
