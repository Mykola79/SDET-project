package class8;

public class NestedLoops4 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++)
        {for (int j = 0; j < 5; j++)
        if(j==1 || j==2){
            System.out.println("&");}

       else {System.out.println("*");}

            System.out.println("**********************");

        }
    }}
