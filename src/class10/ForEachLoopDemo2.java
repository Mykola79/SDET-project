package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {

        int names[] = {10, 13, 20, 25, 45, 50};

        for (int i = 0; i < names.length; i++) {if(names[i]%2!= 0)

            {System.out.println(names[i]);}}



        System.out.println("***********");


        for (int i = 0; i < names.length; i++) {if(names[i]%2!=0){names[i]=0; }}


        System.out.println("Yes");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }





    }
    }
