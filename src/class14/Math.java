package class14;

public class Math {


    void add(int num1, int num2){
        System.out.println(num1+num2);
    }

    void mul(int num1, int num2, int num3){
        System.out.println(num1*num2*num3);
    }

    int sub(int num1, int num2){return num1-num2;}

    public static void main(String[] args) {
        Math math=new Math();

        math.add(10,10);

        math.mul(10,2,3);

        //Scanner scanner=new Scanner(System.in);
        //int num=scanner.nextInt();

        int result=math.sub(100,50);
        System.out.println(result);
}}
