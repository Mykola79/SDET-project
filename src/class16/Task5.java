package class16;

public class Task5 {
    //5) Write a method to return whether given number is prime or not?

    //return type=boolean
    //name=isPrime
    //parameter=int number

    public static void main(String[] args) {
        int number=5;
        boolean flag =true;
        if(number>1){
            for (int i = 2; i < number; i++) {
                if(number%i==0){
                    flag=false;
                    break;
                }
            }
        }else{
            flag=false;
        }
        System.out.println(number+" is prime "+flag);
    }
}
